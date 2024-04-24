//Loops
//41) Write a program to print numbers from 1 to 10 using a `for` loop.
//42) Implement a `while` loop to print even numbers between 1 and 20.
//43) Write a program to calculate the sum of natural numbers up to 100 using `for` loop.
//44) Implement a `do-while` loop to print numbers from 1 to 5.
//45) Write a program to print the Fibonacci series using `for` loop.
//46) Implement a `while` loop to find the factorial of a number.
//47) Write a program to print the multiplication table of a number using `for` loop.
//48) Implement a `do-while` loop to check if a number is Armstrong number.
//49) Write a program to print numbers in reverse order using `for` loop.
//50) Implement a `while` loop to check if a number is palindrome.

package com.ineuron.corejavapractice;

public class loops {

    public static void printOnetoTen(){
        for(int i =0;i<=10;i++){
            System.out.println("Number :"+i);
        }
    }

    public static void evenOnetoTwenty(){
        int i = 2;
        while(i<=20){
            if(i%2==0){
                System.out.println("Even number "+i);
            }
            i++;
        }
    }

    public static void sumOfNaturalNumbers(){
        int sum =0;
        for(int i =0; i<=100 ;i++){
            sum+=i;
        }
        System.out.println("The sum of the first hundred natural number is " + sum);
    }

    public static void printOnetoFive(){
        int number = 1;
        do {
            System.out.println("Number" +" " + number); //This loop will execute at least once
            number++;
        }while(number<=5);
    }
    public static void fibanocci(){
        int firstNumber=0;
        int secondNumber=1;
        int result;
        for(int i =0 ; i<=10;i++){
            result= firstNumber+secondNumber;
            System.out.println("Result"+" "+result);
            firstNumber=secondNumber;
            secondNumber=result;
            }
    }
    public static void factorial( int number){
        int factorial =1;
        //int number;
        while(number>1){
        factorial=factorial*number;
        number--;
        }
        System.out.println("Factorial of the given number " +"  is : "+factorial);
    }

    public static void multiplicationThree(){
        int number =3 ;
        int result = 1;
        for(int i =1;i<=10;i++){
        result=number*i;
            System.out.println("The multipliers in each iteration are " + result);

        }
    }

    public static void armstrongNumber(){
        int originalNumber = 25;
        int sum =0;
    }

    public static void reverse(){
        for(int i=10;i>=0;i--){
            System.out.println(i);
        }
    }

    public static void whilePalindrome(){

    }

    public static void main(String[] args){
        System.out.println("Loops");
        printOnetoTen();
        evenOnetoTwenty();
        sumOfNaturalNumbers();
        printOnetoFive();
        fibanocci();
        factorial(5);
        multiplicationThree();
        reverse();
    }
}
