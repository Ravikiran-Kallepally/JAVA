package com.ineuron.HashSet;

import java.util.HashSet;

public class HashSetPractice {

    static class StudentDetails{
        String name ;
        int marks;
        public StudentDetails(String name,int marks){
            this.name =name;
            this.marks =marks;
        }

        @Override
        public String toString() {
            return "Student name : "+this.name + " Student marks :"+this.marks;
        }
    }

    public static void main(String[] args){
        System.out.println("Hashset in Java");
        HashSet<Integer> integerSet = new HashSet<>();
        HashSet<Object> studentDetails = new HashSet<>();
        StudentDetails sd = new StudentDetails("RK",12);
        StudentDetails sd1 = new StudentDetails("Kr",21);

        studentDetails.add(sd);
        studentDetails.add(sd1);
        studentDetails.remove(sd1);
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(40);
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(40);
        for(Integer rk : integerSet){
            System.out.println(rk);
        }
        System.out.println(integerSet.contains(10));
        System.out.println(integerSet.contains(70));
        for(Object obj : studentDetails){
            System.out.println(obj);
        }
    }
}
