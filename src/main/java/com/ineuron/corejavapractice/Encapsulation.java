package com.ineuron.corejavapractice;

class PersonE{
    private String name ="RK";
    private int age =26;

    public void setAge(int age) {
        if(age<0){
            System.out.println("Age is invalid ");
        }
        this.age = age;
    }
    public int getAge(){
        if(age<0){
            System.out.println("Age is invalid cannot get invalid age ");
        }else {
            System.out.println("Age is  "+age);
        }
        return age;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        System.out.println("Name is "+name);
        return name;
    }
}

class BankAccount{
private double balance;
public void deposit(double balance){
    double result = balance+500.98;
    System.out.println("The current balance after the deposit is "+result);
}
public void withdraw(double balance){
    double result = balance-500.87;
    if(result>100){
        System.out.println("You have sufficient balance to buy groceries > 100$");
    }
    System.out.println("The current balance after the withdrawal is "+result);
}

}

class EmployeeE{
    private double salary;
    public double getSalary() {
        if(salary<0){
            System.out.println("Salary can't be a negative number ");
        }
        System.out.println("The salary is : "+salary);
        return salary;
    }
    public void setSalary(double salary) {
        if(salary<0){
            System.out.println("Salary can't be a negative number => cannot set salary  ");
        }else{
            this.salary = salary;
        }
        }}

class StudentM{
    private int marks;
    public int getMarks(){
        System.out.println("Marks of this student : "+marks);
        return  marks;
    }
    public void setMarks(int marks){
        if(marks<0){
            System.out.println("Marks cant be less than zero => cannot set marks");
        } else if (marks>0 && marks<101) {
            System.out.println("Valid marks are given");
            this.marks = marks;
        } else {
            //this.marks = marks;
            System.out.println("Marks are not in valid range : " + marks);
        }
    }
}

class Bookp{
    private double price;
    public void setPrice(double price){
        if(price<0){
            System.out.println("Please provide valid price => cannot set price ");
        }else {
            this.price=price;
        }

    }
    public double getPrice(){
        if(price<0){
            System.out.println("Please provide valid price => cannot get price ");
        }else{
            System.out.println("The price is  "+price);
        }

        return price;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Java Programming Encapsulation");
        PersonE pe = new PersonE();
        pe.getName();
        pe.getAge();
        pe.setName("Sd");
        pe.setAge(-99);
        pe.getAge();
        pe.getName();
        System.out.println("*********************************************");
        BankAccount bc = new BankAccount();
        bc.deposit(200.98);
        bc.withdraw(1000.98);
        EmployeeE ee = new EmployeeE();
        ee.setSalary(500000.98);
        ee.getSalary();
        ee.setSalary(-98);
        System.out.println("**************************************************");
        StudentM sm = new StudentM();
        sm.setMarks(98);
        sm.getMarks();
        sm.setMarks(102);
        //sm.getMarks();
        System.out.println("******************************************************");
        Bookp bp = new Bookp();
        bp.setPrice(87.98);
        bp.getPrice();
        bp.setPrice(-98.87);
        bp.getPrice();

    }
}
