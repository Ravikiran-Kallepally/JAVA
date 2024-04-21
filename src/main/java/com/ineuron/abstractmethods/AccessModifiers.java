package com.ineuron.abstractmethods;
import java.util.*;
class A{
    public void methodOne(){
        System.out.println("a class method");

    }
}

class B{
    public static void main(String[] args){
        A a = new A();
        a.methodOne();
    }
}


