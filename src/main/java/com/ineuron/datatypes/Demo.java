package com.ineuron.datatypes;

public class Demo {

    public static void logSomething(){
        System.out.println("Log Something this is a method");
    }
    public static void main(String[] args){
        int x =10 ;
        int number = 10;
        int Number =20;
        int NUMBER = 20;
        int NumBer = 30; // we can differentiate with case
       // int if =10 ; // invalid , reserved keyword
        int Runnable =40; //All predefined java class names and Interface names we use as Identifiers
        System.out.println("Language Fundamentals ");
        logSomething();
        System.out.println("number" + number);
        System.out.println("********************");
        System.out.println(Runnable);
    }
}
// The only allowed characters in JAVA Identifiers are
//1) a to z
//2) A to Z
//3) 0 to 9
//4) _
//5) $
//Identifiers are not allowed to start with a digit
//Java Identifiers are case-sensitive
//There is no length limit for java Identifiers , but it is not recommended to take more than 15 lengths
// we cant use reserved keywords as Identifiers
//All predefined java class names and Interface names we use as Identifiers
// Default value for object reference is null
// if a method won't return anything compulsory that method should be declared with a void return type in java
// Java_language is considered a strongly typed language because every assignment is checked by the compiler
// The most rarely used data type in java is short
// byte-> short -> int -> long ====== 1,2,4,8 Bytes of memory each
//**************************Arrays *********************************






