package com.ineuron.models;

public class Employee {
    //Attributes
    int id ;
    String name;
    double salary;

    public Employee(int id ,String name,double salary){ //constructor
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void logStatement(){ //method
        System.out.println("Int value is "+ id);
        System.out.println("Name is "+name);
        System.out.println("Salary is "+salary);
    }
    public static void main(String[] args){
        //System.out.println("Employee class in model package");
    }
}
