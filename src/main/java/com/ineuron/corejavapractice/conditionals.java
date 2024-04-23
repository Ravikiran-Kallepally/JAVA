//31) Implement a program to check if a number is positive, negative, or zero using `if-else`
//statement.
//32) Write a program to check if a character is a vowel or consonant using `if-else`
//statement.
//33) Implement a program to find the largest among three numbers using `if-else`
//statement.
//34) Write a program to check if a year is leap year or not using `if-else` statement.
//35) Implement a program to find the grade of a student based on marks using `if-else`
//statement.
//36) Write a program to check if a number is prime or not using `if-else` statement.
//37) Implement a program to check if a number is palindrome using `if-else` statement.
//38) Write a program to check if a number is Armstrong number or not using `if-else`
//statement.
//39) Implement a program to find the factorial of a number using `if-else` statement.
//40) Write a program to check if a number is perfect square using `if-else` statement.
package com.ineuron.corejavapractice;
public class conditionals {

    public static void positiveNegativeZero(int num){
    if(num>0){
        System.out.println("It is a positive nunber");
    } else if (num < 0 ) {
        System.out.println("It is a negative number");
    }else{
        System.out.println("The given number is 0 ");
    }
}

public static void vowelOrConsonant(char a){
        char result = Character.toLowerCase(a);
        if(result== 'a' ||result== 'e' ||result== 'i' || result=='o' ||result== 'u'){
        System.out.println("Given character is a vowel");
        }else{
            System.out.println("Given character is a consonant");
        }
    }
    public static void largestOfThreeNumbers(int a , int b , int c){
        if(a>b && a>c){
            System.out.println("A is the largest number ");
        } else if (b>a && b>c) {
            System.out.println("B is the largest number");
        }else {
            System.out.println("C is the largest number ");
        }
    }

    public static void leapOrNot(int year){
        if(year%4==0){
            if(year%100!=0 || year%400 ==0){
                System.out.println("It is a leap year");
            }
        }else {
            System.out.println("It is not a leap year ");
        }
    }

    public static void grade(int marks){
        if(marks>93){
            System.out.println("A grade for the student");
        } else if (marks<93 && marks >89) {
            System.out.println("A- grade for the student");
        }else {
            System.out.println("Grade will be given later");
        }
    }

    public static void isPrime(int num){
        boolean isPrimenum =true;
        if(num<=1){
            System.out.println("It is a not prime number ");
        } for(int i =2 ;i<=Math.sqrt(num);i++){
            if(num % i ==0){
                isPrimenum =false;
                break;
            }
        }
        if (isPrimenum) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is not a prime number.");
        }
    }

//    public static void isPalindrome(int num){
//    boolean isPalindromeNumber=false;
//    int originalNumber= num;
//    int reversedNumber=0;
//    while(originalNumber!=0){
//        int digit = num%10;
//        reversedNumber*=10+digit;
//        num/=10;
//    }
//        if (originalNumber == reversedNumber) {
//            System.out.println(originalNumber + " is a palindrome.");
//        } else {
//            System.out.println(originalNumber + " is not a palindrome.");
//        }
//    }


        public static void isPalindrome() { // AI generated
            int num = 12321; // Example number to check
            int reversedNum = 0;
            int originalNum = num;

            // Reverse the number
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            // Check if the number is a palindrome
            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is a palindrome.");
            } else {
                System.out.println(originalNum + " is not a palindrome.");
            }
        }

        public static void armStrongNumber(){ //program not completed yet
        int number = 153;
        String numberString = number + "";
            // Access individual digits
            for (int i = 0; i < numberString.length(); i++) {
                char digitChar = numberString.charAt(i);
                int digit = Character.getNumericValue(digitChar);
                System.out.println("Digit at index " + i + ": " + digit);
            }
        }

        public static void factorial(int num){ //program not completed yet

        }

        public static void perfectSquare(int num){ //program not completed yet

        }


    public static void main(String[] args){
        System.out.println("Control flow statements");
        positiveNegativeZero(0);
        vowelOrConsonant('e');
        largestOfThreeNumbers(2,3,4);
        leapOrNot(2024);
        grade(92);
        isPrime(20);
        isPalindrome();
    }
}
