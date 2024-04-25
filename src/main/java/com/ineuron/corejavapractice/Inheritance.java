//61) Create a base class `Vehicle` with a method `drive()`. Derive a `Car` class and
//override the `drive()` method.
//62) Implement a `Bird` class inheriting from `Animal`. Add a method `fly()` in `Bird`
//class.
//63) Create a `Rectangle` class with `length` and `width` attributes. Derive a `Square`
//class from `Rectangle` and override the `area()` method.
//64) Implement a `Circle` class inheriting from `Shape`. Add methods to calculate
//circumference and area.
//65) Create a base class `Fruit` with `color` attribute. Derive `Apple` and `Banana`
//classes and display their colors.
//66) Implement a `Shape` class with `color` attribute. Derive `Circle` and `Rectangle`
//classes and display their colors.
//67) Create a `Vehicle` class with `speed` attribute. Derive `Car` and `Bike` classes and
//display their speeds.
//68) Implement a `Person` class with `name` attribute. Derive `Student` and `Teacher`
//classes and display their names.
//69) Create a `Bank` class with `balance` attribute. Derive `Savings` and `Current`
//classes and display their balances.
//70) Implement a `Animal` class with `type` attribute. Derive `Dog` and `Cat` classes
//and display their types.
package com.ineuron.corejavapractice;

class Vehicle{
    public void drive(){
        System.out.println("Vehicle base class drive method");
    }
}

class Ferrari extends  Vehicle{
    @Override
    public void drive() {
        super.drive(); // parent class constructor will be called here
        System.out.println("Car drive method , this drive method is overridden in child class called car");
    }
}

class Animal{
    public  void logSomething() {  //Static methods belong to the class, not instances, and cannot be overridden.
        System.out.println("This is an empty Animal class ");
    }
}

class Bird extends Animal{
    public  void fly(){ //Static methods belong to the class, not instances, and cannot be overridden.
        super.logSomething();  // This will call the logSomething() method from Animal class
        System.out.println("bird flies ");
    }
}

class Rectangle{
    double length =87.6;
    double breadth =98.6;
    double area_Rectangle;
    public void Area(double length ,double breadth){
        area_Rectangle = length*breadth;
        System.out.println("Area of Rectangle is : "+ area_Rectangle);
    }
}

class Square extends Rectangle{
    double side=78.72;
    double sideOne= 98.54;
    @Override
    public void Area(double side , double sideOne) {
        double squareResult;
        super.Area(length, breadth);
       squareResult= side*sideOne;
       System.out.println("Area of Square is : "+squareResult);
    }
}

class Shape{
    public void logSomething(){
        System.out.println("Parent class shape");
    }}
class Circle extends Shape{

    public void circumference(){
        super.logSomething();
        double pie =3.14;
        int radius = 43;
        double result = 2*(pie*radius);
        System.out.println("Circumference of a circle is " + result);

    }
    public void area(){
        super.logSomething();
    double pie = 3.14;
    int radius = 87;
    double result = pie*(radius*radius);
    System.out.println("Area of a circle is " + result);
    }
}

class Fruit{
    String color;
    public Fruit(String color){
        this.color=color;
        System.out.println("The provided color is : " +color);
    }
}
class Apple extends Fruit{

    public Apple(){ // This is a constructor
        super("red");
    }
    public void displayColor(){
        System.out.println("Apple is "+ color + " in color");
    }

}
class Banana extends Fruit{
    public Banana(){
        super("Yellow"); //This is also a constructor

    }
    public void displayColor(){
        System.out.println("Banana is "+ color + " in color");
    }

}

class shapeColor{
    String color;
    public shapeColor(String color){ //This is a constructor
    this.color=color;
    }
}

class circleColor extends shapeColor{
    public circleColor(){
        super("red");
    }
    public void circleDisplayColor(){
        System.out.println("circle is "+ color+" in color");
    }
}

class rectangleColor extends shapeColor{
    public rectangleColor(){ //This is a constructor
        super("blue");
    }
    public void rectangleDisplayColor(){
        System.out.println("Rectangle is " + color + " in color ");
    }
}

class vehicleSpeed{
    double speed;
    public vehicleSpeed(double speed){ //This is a constructor
        this.speed=speed;
    }
}

class bikeSpeed extends  vehicleSpeed{
    public bikeSpeed(){
        super(65.7);
    }
    public void displayBikeSpeed(){
        System.out.println("The speed of the bike is  " +speed);
    }
}

class carSpeed extends vehicleSpeed{
    public carSpeed(){
        super(89.8);
    }
    public void displayCarSpeed(){
        System.out.println("The speed of the car is "+speed);
    }
}

class personName{
    String name ;
    public personName(String name){ // This is a constructor
    this.name=name;
    }
}
class studentName extends  personName{
    public studentName(){
        super("RK");
    }
    public void displayName(){
    System.out.println("The name of the student is "+ name);
    }
}

class teacherName extends  personName{
    public teacherName(){
        super("NS");
    }
    public void displayName(){
        System.out.println("The name of the teacher is " + name);
    }
}

class Bank{
    double balance;
    public Bank(double balance){
        this.balance=balance;
    }
}
class Savings extends Bank{
    public Savings(){
        super(28765.9);
    }
    public void display(){
        System.out.println("The balance in the savings account is "+balance);
    }
}

class Current extends Bank{
    public Current(){
        super(5321.87);
    }
    public void display(){
        System.out.println("The balance in the current account is "+ balance);
    }
}

class animalType{
    String type;
    public animalType(String type){//This is a constructor
        this.type=type;
    }
}

class Dog extends  animalType{
    public Dog(){
        super("Loyalty");
    }
    public void display(){
        System.out.println("Dogs are usually known for their  " + type);
    }
}

class Cat extends animalType{
    public Cat(){
        super("wild");
    }
    public void display(){
        System.out.println("Cats are usually known for being  "+type);
    }
}

public class Inheritance {
    public static void main(String[] args){
        System.out.println("Inheritance");
        Ferrari f = new Ferrari();
        f.drive();
        Bird b = new Bird();
        b.fly();
        Square s = new Square();
        s.Area(34.5,87.7);
        Circle c = new Circle();
        c.area();
        c.circumference();
        Apple a = new Apple();
        Banana ba = new Banana();
        a.displayColor();
        ba.displayColor();
        rectangleColor rc = new rectangleColor();
        circleColor cc = new circleColor();
        rc.rectangleDisplayColor();
        cc.circleDisplayColor();
        carSpeed cs = new carSpeed();
        bikeSpeed bs = new bikeSpeed();
        cs.displayCarSpeed();
        bs.displayBikeSpeed();
        studentName sn = new studentName();
        teacherName tn = new teacherName();
        sn.displayName();
        tn.displayName();
        Savings sv = new Savings();
        Current ct = new Current();
        sv.display();
        ct.display();
        Dog dg = new Dog();
        Cat cta = new Cat();
        dg.display();
        cta.display();




    }
}
