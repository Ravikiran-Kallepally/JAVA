package com.ineuron.datatypes;

public class Arrays {

    public static int sum(int[] x){
        int total =0;
        for(int x1:x){
            total+=x1;
        }
        return total;

    }

    public static void main(String[] args){

        //Array declarations
        //int []a  = new int[-1]; //recommended to use this declaration because name is clearly separated from the type
        int [] b = new int[5];

        int [] num = {10,20,30,40,50};
        System.out.println(num[0]);
    }
}

//Every array in java is an object , hence we can create using new keyword

