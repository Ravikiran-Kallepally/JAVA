//1) Create an `int` variable and display its value.
//2) Declare a `double` variable and initialize it with a value. Print the variable.
//3) Declare and initialize a `boolean` variable and print its value.
//4) Declare a `long` variable and assign it a large number. Print the variable.
//5) Create a `byte` variable and assign it a value. Print its value.
//6) Declare a `float` variable and initialize it with a decimal value. Print the variable.
//7) Create a `short` variable and assign it a value. Print its value.
//8) Declare a `char` variable and assign it a character. Print the character.
//9) Declare a `String` variable and initialize it with "Java". Print the variable.
//10) Declare multiple variables of different types and print their values.
package com.ineuron.corejavapractice;
public class variables {

   static int i =20;
   static double p = 20.87; // for precision, we use double
   static  boolean isCorrect=true;
   static long bigNumber = 34567890;
   static byte myNumber = 127;
   static  float pointer= 99999;
   static short a = 32767;
   static char letter = 'm';
   static String str ="RK";
    public static void main(String[] args){
        int j =30;
        double q = 40.86;
        boolean isCar = false;
        long largeNumber = 987654321;
        byte localNumber= 98;
        float localPointer = 88888;
        short localA= 29876;
        char localLetter = 'n';
        String localStr = "RaviKiran K";
        System.out.println("Variables practice");
        System.out.println(i);
        System.out.println("local variable J is "+j);
        System.out.println("static double variable "+p);
        System.out.println("local double variable value is "+q);
        System.out.println("static boolean value is "+ isCorrect);
        System.out.println("local boolean value isCar "+ isCar);
        System.out.println("static long number is "+ bigNumber);
        System.out.println("local long number is "+ largeNumber);
        System.out.println("byte static number is "+ myNumber);
        System.out.println("local byte number is " + localNumber);
        System.out.println("static float pointer is " + pointer);
        System.out.println("local float pointer is "+ localPointer);
        System.out.println("static short variable is "+ a);
        System.out.println("local short variable is "+localA);
        System.out.println("static char is "+ letter);
        System.out.println("local char is "+ localLetter);
        System.out.println("static string value is "+ str);
        System.out.println("local string value is "+ localStr);
    }
}
