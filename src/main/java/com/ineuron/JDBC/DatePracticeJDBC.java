package com.ineuron.JDBC;
//import java.util.Date;
//import java.sql.Date;


import java.util.Date;

public class DatePracticeJDBC {
    public static void main(String[] args){
        //System.out.println("JDBC concept to store date in data base");
        //This is used to store both date and time information
        java.util.Date udate = new java.util.Date();
        System.out.println("UTIL date : "+udate);
        //long value
        long value = udate.getTime();
        System.out.println("Long value : "+value);
        //we use the following to store date information
        java.sql.Date sqlDate = new java.sql.Date(value);
        System.out.println("SQL date : "+sqlDate);



    }
}
