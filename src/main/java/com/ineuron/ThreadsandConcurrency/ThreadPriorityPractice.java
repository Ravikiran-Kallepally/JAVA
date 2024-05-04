package com.ineuron.ThreadsandConcurrency;

public class ThreadPriorityPractice {
    public static void main(String[] args){
        Thread threadOne = new Thread(()->{
            System.out.println("The current thread is "+Thread.currentThread().getName());
        });
        //set the priority of the thread
        threadOne.setPriority(Thread.MAX_PRIORITY);
        //start the thread
        threadOne.start();

        //print the priority of the thread
        System.out.println("Thread priority is : "+threadOne.getPriority());
    }
}
