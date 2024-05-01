package com.ineuron.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class Employee{
    String name ;
    double salary;
    int id;
    public Employee(String name,double salary,int id){
        this.name=name;
        this.salary=salary;
        this.id=id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }

    @Override
    public String toString() {
        return "Name of the employee/n :" + name+" "+"salary of the employee/n "+" "+salary+" "+"id of the employee"+" "+id;
    }
}


class Book{
    String title;
    double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }

    @Override
    public String toString() {
        return  "Book title : "+this.title+" Book price : "+this.price;
    }
}


class StudentDetails{
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

public class HashSetPractice {

    public static void commonElements(HashSet<Integer>a,HashSet<Integer>b){
        HashSet<Integer>commonFunction = new HashSet<Integer>();
        for(Integer element : a){
            if(b.contains(element)){
                commonFunction.add(element);
            }
        }
        System.out.println("The common elements in both HashSets are : "+commonFunction);

    }



    public static void main(String[] args){
        System.out.println("Hashset in Java");
        Employee e = new Employee("Rk",100.98,12);
        Employee e1 = new Employee("kr",23.78,13);
        Employee e2 = new Employee("uj",98.76,14);
        HashSet<Object>EmployeeDetails = new HashSet<Object>();
        HashSet<String>stringNames = new HashSet<String>();
        EmployeeDetails.add(e);
        EmployeeDetails.add(e1);
        EmployeeDetails.add(e2);
        System.out.println("Employee Details HashSet before removal "+EmployeeDetails);
        EmployeeDetails.remove(e);
        System.out.println("Employee Details HashSet after removal "+EmployeeDetails);

        HashSet<Integer> integerSet = new HashSet<>();
        HashSet<Integer>integerSet2 = new HashSet<Integer>();
        HashSet<Integer>commonElements= new HashSet<Integer>();
        HashSet<Object> studentDetails = new HashSet<>();
        HashSet<Object>BookDetails = new HashSet<Object>();
        HashSet<Object>BookDetails2 = new HashSet<Object>();
        StudentDetails sd = new StudentDetails("RK",12);
        StudentDetails sd1 = new StudentDetails("Kr",21);
        Book book = new Book("Yogi",99.9);
        Book book2 = new Book("jobs",87.76);
        Book book3 = new Book("dummy",87.96);
        Book book4 = new Book("book number 4",76.45);
        BookDetails.add(book);
        BookDetails.add(book2);
        BookDetails.add(book3);
        BookDetails.remove(book);
        BookDetails2.add(book);
        BookDetails2.add(book2);
        BookDetails2.add(book3);
        BookDetails2.add(book4);
        System.out.println("*******************************");
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
        integerSet2.add(60);
        integerSet2.add(70);
        integerSet2.add(10);
        integerSet2.add(90);
        for(Integer rk : integerSet){
            System.out.println(rk);
        }
        System.out.println(integerSet.contains(10));
        System.out.println(integerSet.contains(70));
        for(Object obj : studentDetails){
            System.out.println(obj);
        }
        commonElements(integerSet,integerSet2);
        System.out.println("Book details HashSet "+BookDetails);
        for(Object obj : BookDetails){
            if(BookDetails2.contains(obj)){
                BookDetails2.remove(obj);
            }
            System.out.println("The removed book objects are :" +obj);
        }
        System.out.println(BookDetails);
        System.out.println(BookDetails2);
        if(EmployeeDetails.contains(new Employee("kr",23.78,13))){
            System.out.println("This object exists in the employee hashset");
        }
        stringNames.add("ravi");
        stringNames.add("kiran");
        stringNames.add("rk");
        System.out.println("String names before removal "+stringNames);
        stringNames.remove("ravi");
        System.out.println("String names after removal "+stringNames);
        ArrayList<String> stringArray = new ArrayList<String>(stringNames);//converting hashset to arraylist
        System.out.println("String Array "+stringArray);
    }
}
