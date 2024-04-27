package com.ineuron.utilities;
import java.util.Arrays;

public class ArrayOperations {

    public static void sort(int[] arr){
        Arrays.sort(arr); // This will just sort the array not return an array
        System.out.println(arr);//single dimensional array
    }

    public static void search(int[] arr,int key){
        int result =Arrays.binarySearch(arr,key); //This takes
        System.out.println("The index of number is  "+result);
    }

    public static void reverse(){
    System.out.println("This method is used to reverse the array , implementation later just the concept for now ");
    }


    public static void main(String[] args){
        System.out.println("Array Operations in utilities package");
        int [] a = {10,9,8,7,6,5,};
        sort(a);
        System.out.println(Arrays.toString(a));
        search(a,8);
        reverse();
    }
}
