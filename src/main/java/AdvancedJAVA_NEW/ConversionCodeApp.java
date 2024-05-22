package AdvancedJAVA_NEW;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ConversionCodeApp{
    public static void main(String[] args) throws  Exception{
        //Read the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the data in the format -> dd-MM-yyyy");
        String sdate =scanner.next();
        //convert the String format to java.util.Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date udate = sdf.parse(sdate);
        //convert the java.util.Date to java.sql.Date
        long value = udate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(value);
        //printing all the 3 formats of date
        System.out.println("String date input is "+sdate);
        System.out.println("Simple date format using parse converted date is "+udate);
        System.out.println("java.sql.date using udate.getTime() is "+sqlDate);
        //Practice Standard input , where we don't need internal conversions
        System.out.println("Enter the input in following format : yyyy-MM-dd");
        String standardInput = scanner.next();
        java.sql.Date sqlStandardInput = java.sql.Date.valueOf(standardInput);
        System.out.println("Standard input from user "+standardInput);
        System.out.println("Sql standard input "+sqlStandardInput);
        //close the resources
        scanner.close();
    }
}
