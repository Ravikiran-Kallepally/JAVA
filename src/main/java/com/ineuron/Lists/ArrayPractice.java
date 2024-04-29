package com.ineuron.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student{
    String name ="RK";
    int id =4;

    @Override
    public String toString() {
        return "Student[name=" + name + ", int=" + id + "]";
    }
}

class Book{
    String name;
    double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Book1{
    String name;
    double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Book1(String name, double price) {
        this.name = name;
        this.price = price;
    }
}





public class ArrayPractice {

    public static double calculateAverage(List<Integer> marks){
        int sum =0;
        for(int mark:marks){
            sum+=mark;
        }
        //System.out.println("Average marks of this student are : "+(double)sum/marks.size());
        return (double)sum/marks.size();
    }






    public static void main(String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Object> Student = new ArrayList<Object>();
        ArrayList<Integer> marks = new ArrayList<Integer>();
        ArrayList<Object> books = new ArrayList<Object>();
        Book b = new Book("shopaholic",99.8);
       // Book1 b1 = new Book1("lean start up",93.7);
        books.add(new Book("Book 87", 250.0));
        books.add(new Book("Book 88", 150.0));
        books.add(new Book("Book 89", 300.0));
        books.add(b);
        //books.add(b1);
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        int max = Collections.max(myNumbers);
        int min = Collections.min(myNumbers);

        str.add("R");
        str.add("A");
        str.add("v");
        str.add("i");
        str.remove(1);
        Collections.sort(str,String.CASE_INSENSITIVE_ORDER); //java sorting initially follows lexicographic order

        Student s = new Student();
        Student.add(s);
        marks.add(98);
        marks.add(99);
        marks.add(91);
        marks.add(93);
        double marksAverage =calculateAverage(marks); //calculates average marks of a student

//        for(Object book : books){
//            if(book.getPrice()<99){
//                System.out.println("The book less than 99 is "+book);
//            }
//        }
        System.out.println("ArrayList class in Lists package ");
        System.out.println("My numbers array "+myNumbers);
        System.out.println("MAX number in myNumbers array is "+max);
        System.out.println("MIN number in myNumbers array is "+min);
        System.out.println("The updated string is "+str);
        System.out.println("The sorted string is "+ str);
        System.out.println(Student +"This is a student object updated  ");
        System.out.println("Average marks of a student : "+marksAverage);
        System.out.println(books+"This is a Book list object  ");
    }
}
