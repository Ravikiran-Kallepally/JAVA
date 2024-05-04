package com.ineuron.ThreadsandConcurrency;

public class ThreadInterruption {
    public static void main(String[] args){
        Thread threadOne = new Thread(()->{
            try{
                for(int i=0;i<5;i++){
                    System.out.println("Working... "+i);
                    Thread.sleep(1000);
                }
            }catch(InterruptedException e){
            System.out.println("The exception in catch block is after 1000 millis "+e);
            e.printStackTrace();
            }

        });
        threadOne.start();
        try{
        Thread.sleep(3000);
        threadOne.interrupt();
        }catch (InterruptedException e){
        System.out.println("Thread one interrupted after 3 seconds ");
        e.printStackTrace();
        }
    }
}
