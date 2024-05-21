package AdvancedJAVA_NEW;

public class DatePractice {
    public static void main(String[] args){
        //this java.util.Date is used to store both time and date information
        java.util.Date udate = new java.util.Date();
        System.out.println("util date is " + udate);

        long value = udate.getTime();
        System.out.println("Information about date in milliseconds "+value);

        //java.sql.Date we used to store Date Information
        java.sql.Date sqlDate = new java.sql.Date(value);
        System.out.println("SQL date is "+sqlDate);



    }
}
