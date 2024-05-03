package com.ineuron.ThreadsandConcurrency;

class SleepingThread implements Runnable{
    public void run(){
        try{
            System.out.println("Sleeping thread is going to sleep for 5 seconds");
            Thread.sleep(5000);
            System.out.println("Sleeping thread woke up without any Interruption");

        }catch (InterruptedException e){
            System.out.println("Thread Interrupted with an exception "+e);
            e.printStackTrace();

        }
    }
}


public class Interrupt {
    public static void main(String[] args){
        //System.out.println("Interrupt class in threads package");
        Thread t = new Thread( new SleepingThread());
        t.start();
        try{
            Thread.sleep(2000);
            t.interrupt();

        }catch (InterruptedException e){
            System.out.println("Thread Interupped after 2 seconds" + e);
            e.printStackTrace();
        }
    }
}
