package com.ineuron.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void illegalArgumentException(String str){
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }
        System.out.println("IllegalArguments Exception " + str);
    }

    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8};
        try{
           int result = numbers[10];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bounds  "+e);
        }
        //System.out.println("Exception handling class in exception handling package");
        String a ="abc";
        try{
            int b = Integer.parseInt(a);
        }catch (NumberFormatException e){
            System.out.println("Number format exception " + e);
        }
        String RK = null;
        try{
            String name = RK.toUpperCase();
        }catch (NullPointerException e){
        System.out.println("NullPointer Exception  "+e);
        }
        int d =10;
        int o =0;
        try{
            int g = d/o;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException  "+e);
        }
        try{
            FileReader fr = new FileReader("example.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found exception  "+e);
        }
        try{
            FileWriter fw = new FileWriter("/path/to/readonly/demo.txt");
            fw.write("rk");
            fw.close();//close the resource
        }catch (IOException e){
            System.out.println("IO exception for file name demo.txt "+e);
        }
        try{
            Scanner scan = new Scanner("");
            scan.nextInt();
        }catch (NoSuchElementException e){
            System.out.println("No such element exception "+e);
        }
        try{
            String name =null;
            int result =name.length();
        }catch (NullPointerException e){
            System.out.println("Null pointer exception for name length "+e);
        }
        try{
            Object obj ="Hello";
            Integer str_result = (Integer)obj;
        }catch (ClassCastException e){
            System.out.println("Class cast exception "+e);
        }
        try{
            int[] list = new int[-8];
        }catch (NegativeArraySizeException e ){
            System.out.println("Illegal argument exception ");
        }try{
            illegalArgumentException("RK");
        }catch (IllegalArgumentException e){
            System.out.println("Expected String but received an Integer");
        }

    }
}
