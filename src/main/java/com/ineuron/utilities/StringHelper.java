package com.ineuron.utilities;

public class StringHelper {

    public static  StringBuilder reverse(String str){
        StringBuilder builder = new StringBuilder(str);
        StringBuffer buffer = new StringBuffer(str);
        StringBuffer finalWord = buffer.append('b');
        StringBuilder result = builder.reverse();
        System.out.println("String in reverse is "+ result);
        System.out.println("String Buffer result is " + finalWord);
        return builder;
    }

    public static String toUpperCase(String str){
    String str1 = new String(str);
    String result = str1.toUpperCase();
    System.out.println("The Upper case string is "+result);
    return result;
    }

    public static String toLowerCase(String str){
        String str3 = new String(str);
        String result1 = str3.toLowerCase();
        System.out.println("The Lower case String is "+result1);
        return  result1;
    }

    public static void main(String[] args){
        System.out.println("String helper class in utility package");
        reverse("Ravikiran");
        toUpperCase("ravikiran");
        toLowerCase("RAVIKIRAN");
    }
}
