package com.ineuron.ThreadsandConcurrency;

public class DeadLockScenario {
    public static void main(String[] args){
        final Object resource1 = new Object(); // is an object
        final Object resource2 = new Object(); // is an object

        Thread t = new Thread(()->{
            synchronized (resource1){ //this is locked method
                System.out.println("Holding lock on resource 1 , thread t ");
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock on resource2");
            }
        });

        Thread t1 = new Thread(()->{
            synchronized (resource2){ //this is also a locked method
                System.out.println("Holding lock on resource 2,thread t1 ");
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock on resource1");
                synchronized (resource1) {
                    //This is a synchronized block that requires a lock on the resource1
                    // object before any thread can execute the code inside the block
                    System.out.println("Thread 2: Acquired lock on resource1");
                }

            }

        });
        t.start();
        t1.start();
    }
}
