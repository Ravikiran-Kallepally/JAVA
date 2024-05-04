package com.ineuron.ThreadsandConcurrency;

public class ThreadLocalPractice {
    private static ThreadLocal<Integer> threadLocalValue =ThreadLocal.withInitial(()->0);
    public static void main(String[] args){

        Thread threadOne = new Thread(()->{
            threadLocalValue.set(10);
            System.out.println("Value of thread 1 : "+threadLocalValue.get());
        });

        Thread threadTwo = new Thread(()->{
            threadLocalValue.set(20);
            System.out.println("Value of thread 2 : "+threadLocalValue.get());

            //remove the value from threadLocalValue
            threadLocalValue.remove();
        });
        threadOne.start();
        threadTwo.start();

    }
}
