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
        //close the resources
        scanner.close();
    }
}
