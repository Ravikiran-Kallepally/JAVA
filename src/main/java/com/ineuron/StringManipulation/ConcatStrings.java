package com.ineuron.StringManipulation;

import java.util.Arrays;
import java.util.Objects;

public class ConcatStrings {

    public static String UpperCase(String str){
        return str.toUpperCase();
    }
    public static String LowerCase(String str){
        return  str.toLowerCase();
    }

    public static String trimSpaces(String str){
        return str.trim();
    }
    public static String replaceCharacter(String str){
        return str.replace('a','u');
    }
    public static String[] SplitAString(String str){
        return  str.split(" ");
    }
    public static void subString(String str){
        if(str.contains("a")){
            System.out.println("It contains the character "+str);
        }else {
            System.out.println("It does not have the character "+str);
        }
    }
    public static int indexOfACharacter(String str, char c){
        return str.indexOf(c);

    }
    public static void StringEquals(String str1, String str2){
        if(Objects.equals(str1, str2)){
            System.out.println("The corresponding strings are equal ");
        }else{
            System.out.println("Not equal check the memory map ");
        }
    }
    public static StringBuilder reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse();
    }

    public static void main(String[] args){
        String str = "R";
        String str2 = "K";
        String result = str+str2;
        System.out.println("result of two strings "+result);
        System.out.println("**********************************");
        String str3 = UpperCase("ravikiran");
        System.out.println(str3);
        String str4 = LowerCase("DISCIPLINE");
        System.out.println(str4);
        String str5 = trimSpaces("   RAvi    Kiran    ");
        System.out.println(str5);
        System.out.println("*******************************");
        String str6 = replaceCharacter("aaakoaaaooaaaiaaa");
        System.out.println(str6);
        String[] result2 = SplitAString("This string will be split based on number of spaces");
        System.out.println(Arrays.toString(result2));
        for(String str7 : result2){
            System.out.println(str7);
        }
        System.out.println("*****************************");
        subString("There is an alphabet here for sure ");
        System.out.println("***************************************");
       int num = indexOfACharacter("Ravikiran",'n');
       System.out.println(num);
       StringEquals("ravi","ravi");
       System.out.println("**************************************");
       StringBuilder result3 =reverseString("ravikiran");
       System.out.println(result3);
    }

}
