package com.ineuron.corejavapractice;

class Student {
    String name;
    int age;

    public static void compareAge(int age, int age1) {
        if (age > age1) {
            System.out.println("RK is elder");
        } else if (age1 > age) {
            System.out.println("Hyd is elder");
        } else {
            System.out.println("Both are equal");
        }

    }


    public static void display(int age, String name){
        System.out.println(age +" "+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }
}

class Book{
    static public  String title = "Autobiography of steve jobs \n";
    static public  String author = "Walter Issacson \n";
    static public int price=600;

    public static void discountPrice(){
        int discountedPrice= 540;
        //int newPrice = price-discountedPrice;
        System.out.println("Discounted price is " + discountedPrice);
    }
    public static void display(){
        System.out.println(title+ " "+ author+ " "+ price);
    }
}

class Employee{
    int id ;
    String name;
    double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id , String name, double salary){
        this.id=id;
        this.name =name;
        this.salary=salary;
    }
    public int getId(){
        return  id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}



public class classesandobjects {
    public static void main(String[] args){
        System.out.println("Classes and Objects");
        Student s = new Student("RK",26);
        Student s1 = new Student("Hyd",22);
        Employee e = new Employee(2,"RK",200000.78);
        //System.out.println(s.name + " "+ s.age);
        s.display(26,"Ravikiran");
        System.out.println(s1.name + " "+ s1.age);
        s.compareAge(s.age,s1.age);
        Book b = new Book();
        b.display();
        b.discountPrice();
        System.out.println(e.id+" "+ e.name + " "+e.salary);

    }
}
