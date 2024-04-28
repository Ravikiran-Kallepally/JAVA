package com.ineuron.Lists;

import java.util.ArrayList;
import java.util.Collections;

class Student{
    String name ="RK";
    int id =4;

    @Override
    public String toString() {
        return "Student[name=" + name + ", int=" + id + "]";
    }
}

public class ArrayPractice {
    public static void main(String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Object> Student = new ArrayList<Object>();
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

        System.out.println("ArrayList class in Lists package ");
        System.out.println("My numbers array "+myNumbers);
        System.out.println("MAX number in myNumbers array is "+max);
        System.out.println("MIN number in myNumbers array is "+min);
        System.out.println("The updated string is "+str);
        System.out.println("The sorted string is "+ str);
        System.out.println(Student +"This is a student object updated  ");
    }
}
