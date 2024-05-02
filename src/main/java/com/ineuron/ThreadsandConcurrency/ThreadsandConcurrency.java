package com.ineuron.ThreadsandConcurrency;

class Counter extends Thread{
    @Override
    public void  run(){
        for(int i =0;i<=5;i++){
            System.out.println("Current thread id is   "+Thread.currentThread().getId()+" "+i);
        }

    }
}

class MLthreads implements Runnable{
    @Override
    public void run(){
        for(int i =0;i<2;i++){
            System.out.println("Current thread is : "+ Thread.currentThread().getId()+" "+i);
        }
    }
}

class SynchronizedExample {
    public int getSharedCounter() {
        return sharedCounter;
    }
    private int sharedCounter=0;
    public synchronized void incrementCounter(){ //I want this to be incremented by one thread at a time
        sharedCounter++;
    }

}

public class ThreadsandConcurrency {
    public static void main(String[] args){
        System.out.println("Threads and concurrency practice");
        Counter c = new Counter();
       // c.start();
        int numberOfThreads=3;
        for(int i =0; i<numberOfThreads;i++){
        Thread rk = new Thread(new MLthreads());
        rk.start();
        }
        SynchronizedExample se = new SynchronizedExample();
        //creating multiple threads
        Thread thread1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                se.incrementCounter();
            }
        });
        Thread thread2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                se.incrementCounter();
            }
        });
        try {
            thread1.join(); // here we call thread1.join and not thread1.start() !!!
            thread2.join();
        }catch (InterruptedException e){
            System.out.println("Exception Interuppted is : "+e);
        }
        System.out.println("Shared Counter: " + se.getSharedCounter());


        //MLthreads ml = new MLthreads();
    }
}
