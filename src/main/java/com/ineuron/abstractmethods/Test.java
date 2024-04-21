package com.ineuron.abstractmethods;

//abstract class Test {
//    public static void main(String[] args){
//Test t = new Test(); // compile time error, we cant create an object for abstract class, we cant instantiate
//    }
//}

abstract class Parent{
    abstract public void methodOne();
//    public abstract  void methodTwo(){} //compilation error abstract methods cant have a body
    public abstract void methodTwo();
}
abstract class child extends Parent{
    public void methodOne(){

    }
}

abstract class kid extends child{
    @Override
    public void methodOne() {
        super.methodOne();
        System.out.println("kid print statement , child is parent class for kid ");
    }
}








