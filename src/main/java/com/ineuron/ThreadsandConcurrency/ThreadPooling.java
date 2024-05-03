package com.ineuron.ThreadsandConcurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class WorkerTask implements Runnable{
    private final int taskId; // This value cannot be changed since its final
    public WorkerTask(int taskId){ //This is the constructor
        this.taskId=taskId;
    }

    @Override
    public void run() {
        System.out.println("Task is executing by the thread : "+Thread.currentThread().getName());
        // Simulate some work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + taskId + " completed."); //Task 1 is completed

    }
}


public class ThreadPooling {
    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i =0;i<10;i++){
            Runnable task = new WorkerTask(i); //this will run the loop inside this class
            executor.execute(task);
            executor.shutdown();
            try{
                while (!executor.isTerminated()){
                    // do nothing
                    if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                        executor.shutdownNow(); // Cancel currently executing tasks
                        // Wait a while for tasks to respond to being cancelled
                        if (!executor.awaitTermination(60, TimeUnit.SECONDS))
                            System.err.println("Pool did not terminate");
                    }
                }

            }catch (Exception e){
                System.out.println(e);
                e.printStackTrace();
            }

            System.out.println("All tasks completed. Thread pool is shut down.");
        }

    }
}
