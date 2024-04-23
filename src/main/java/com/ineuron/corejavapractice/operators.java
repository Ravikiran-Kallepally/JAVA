//21) Write a program to calculate the sum of two numbers using `+` operator.
//22) Implement a program to check if a number is divisible by 5 using `%` operator.
//23) Write a program to find the area of a rectangle using `*` operator.
//24) Create a program to calculate the average of two numbers using `/` operator.
//25) Implement a program to check if a number is even or odd using `%` operator.
//26) Write a program to find the remainder of two numbers using `%` operator.
//27) Implement a program to compare two numbers using `==` and `!=` operators.
//28) Write a program to perform bitwise AND operation on two integers.
//29) Create a program to perform bitwise OR operation on two integers.
//30) Implement a program to perform bitwise XOR operation on two integers.
package com.ineuron.corejavapractice;
public class operators {

    public static int addNumbers(int a,int b){
        return a+b;
    }

    public static void divisibleByFive(int num){
        if(num%5==0){
            System.out.println("The given num is divisible by 5 " + " "+num);
            System.out.println();
        }else {
            System.out.print("The given number is not divisible by 5 " +" " + num);
            System.out.println();
        }
    }
    public static void areaOfRectangle(int length ,int breadth){
        int result = length*breadth;
        System.out.println("Area of Rectangle is " +" " + result);
    }
    public static void averageofTwoNumbers(int a , int b){
        int result = (a+b)/2;
        System.out.println("Average of two numbers is "+ " " + result);
        System.out.println();
    }

    public static void evenOrOdd(int num){
    if(num%2==0){
        System.out.println(num + " "+ " is an even number");
        System.out.println();
    }else {
        System.out.println(num + " "+ " is an odd number");
        System.out.println();
    }
    }

    public static void reminderOfTwoNumbers(int a , int b){
        int result = a%b;
        System.out.println("Reminder of given two numbers is "+" "+ result);
    }

    public static void equal(int a , int b){
        if(a==b){
            System.out.println("Given two numbers are equal");
        } else if (a>b) {
            System.out.println("A is greater than B ");
        }
        else{
            System.out.println("Neither greater not equal ");
        }
    }

    public static void notEqual(int a , int b){
        if(a!=b){
            System.out.println("Given two numbers are not equal");
        } else {
            System.out.println("A is Not Equal to B ");
        }
    }

    public static void bitwiseAnd(int a , int b){
        if(a%2==0 && b%2==0){
            System.out.println("Both are even numbers");
        }else{
            System.out.println("either A or B is not an even number ");
        }
    }
    public static void bitwiseOr(int a , int b){
        if(a%5==0 || b%5==0){
            System.out.println("Either A or B is divisible by 5");
        }else{
            System.out.println("Either A or B is not divisible by 5");
        }
    }
    public static void bitwiseXor(int a ,int b){
        if(a>5 ^ b<8){
            System.out.println("Either A is greater than 5 or B is less than 8 ");
        }else {
            System.out.println("XOR operation is not being used for now ");
        }
    }


    public static void main(String[] args){
        System.out.println("Operators in java");
        int result = addNumbers(10,20);
        System.out.println("Sum of two numbers"+" "+result);
        divisibleByFive(56);
        areaOfRectangle(34,(int)87.6); //casting
        averageofTwoNumbers(30,40);
        evenOrOdd(47);
        evenOrOdd(60);
        reminderOfTwoNumbers(15,10);
        reminderOfTwoNumbers(50,2);
        equal(10,20);
        notEqual(24,76);
        bitwiseAnd(10,28);
        bitwiseOr(89,73);
        bitwiseXor(3,7);
    }
}
