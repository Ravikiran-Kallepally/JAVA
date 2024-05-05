package com.ineuron.InterfacesAndAbstractClasses;

interface Drawable{
    public void draw();
}

interface Sortable{
    public void sort();
}

class ArrayList implements  Sortable{
    @Override
    public void sort() {
        System.out.println("sort method from ArrayList class");
    }
}

class Circle extends Shape implements Drawable{
    @Override
    public void draw() {
        System.out.println("This is a circle draw method");
    }

    @Override
    public void calculateArea() {

            System.out.println("calculate area method from abstract class Shape");

    }
}
class Rectangle extends  Shape implements Drawable{
    @Override
    public void draw() {
        System.out.println("This is a rectangle draw method");
    }

    @Override
    public void calculateArea() {
        System.out.println("calculate area method from abstract class Shape");
    }
}

interface Runnable{
    public void run();

}

class Thread implements Runnable{
    public void run(){
        System.out.println("run method from thread class ");
    }
}

interface Readable{
    public void read();
}
class FileReader implements  Readable{
    @Override
    public void read() {
        System.out.println("read method from file reader ");
    }
}

interface Writable{
    public void write();
}

class FileWriter implements  Writable{
    public void write(){
        System.out.println("write method from file writer class ");
    }
}

abstract  class Bank{
    abstract public void deposit();
    abstract  public void withDraw();
}

class Savings extends Bank{
    @Override
    public void deposit() {
        System.out.println("deposit method from savings class ");
    }

    @Override
    public void withDraw() {
        System.out.println("withdraw method from savings class ");
    }
}

abstract class Shape{
    abstract public void calculateArea();
}

abstract class Animal{
    abstract  public void sound();
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("sound method from dog class");
    }
}
class Cat extends  Animal{
    @Override
    public void sound() {
        System.out.println("sound method from cat class ");
    }
}

abstract class Vehicle{
    abstract public void drive();
}
class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("drive method from Car class steering");
    }
}
class Bike extends Vehicle{
    @Override
    public void drive() {
        System.out.println("drive method from Bike class handle");
    }
}

abstract class Fruit {
    abstract public void taste();
}
class Apple extends Fruit{
    @Override
    public void taste() {
        System.out.println("taste method from Apple class");
    }
}
class Banana extends Fruit{
    @Override
    public void taste() {
        System.out.println("taste method from Banana class ");
    }
}


public class DrawableInterfacePractice {
    public static void main(String[] args){
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
        System.out.println("************************************************");
        ArrayList al = new ArrayList();
        al.sort();
        System.out.println("******************************************");
        Thread t = new Thread();
        t.run();
        System.out.println("****************************************");
        FileReader fr = new FileReader();
        fr.read();
        FileWriter fw = new FileWriter();
        fw.write();
        System.out.println("***************************************");
        Savings s = new Savings();
        s.deposit();
        s.withDraw();
        System.out.println("*************************************");
        r.calculateArea();
        c.calculateArea();
        System.out.println("****************************************");
        Dog d = new Dog();
        d.sound();
        Cat ct = new Cat();
        ct.sound();
        System.out.println("***************************************");
        Car cr = new Car();
        cr.drive();
        Bike b = new Bike();
        b.drive();
        System.out.println("********************************************");
        Apple ap = new Apple();
        Banana ba = new Banana();
        ap.taste();
        ba.taste();


    }
}
