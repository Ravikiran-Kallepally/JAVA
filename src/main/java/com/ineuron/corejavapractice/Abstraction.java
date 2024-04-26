package com.ineuron.corejavapractice;

abstract class BankA{
    abstract void savings();
    abstract void withdraw();
}

class SavingsA extends BankA{
    public  void savings(){
        System.out.println("abstract method savings implemented in SavingsA class");
    }
    public  void withdraw(){
        System.out.println("abstract method withdraw implemented in SavingsA class");
    }
}

class CurrentA extends BankA{
    public  void savings(){
        System.out.println("abstract method savings implemented in CurrentA class");
    }
    public  void withdraw(){
        System.out.println("abstract method withdraw implemented in CurrentA class");
    }
}

abstract class Shapea{
    abstract void calculateArea();
}
class CircleA extends  Shapea{
    public void calculateArea(){
        System.out.println("Calculate area method implemented in CircleA class");
    }
}
class RectangleA extends Shapea{
    public void calculateArea(){
        System.out.println("Calculate area method implemented in RectangleA class");
    }
}

abstract class AnimalS{
    abstract void sound();
}
class DogS extends AnimalS{
    public void sound(){
        System.out.println("Dog barks -> woof woof ");
    }
}

class CatS extends  AnimalS{
    public void sound(){
        System.out.println("Cat Meows -> meow meow ");
    }
}

abstract class VehicleD{
    abstract void drive();
}
class CarD extends  VehicleD{
    public void drive(){
        System.out.println("drive method of car class");
    }
}
class BikeD extends VehicleD{
    public void drive(){
        System.out.println("drive method of bike class ");
    }
}

abstract  class FruitT{
    abstract void taste();
}
class AppleT extends  FruitT{
    public void taste(){
        System.out.println("Taste method of Apple fruit & AppleT class ");
    }
}
class BananaT extends FruitT{
    public void taste(){
        System.out.println("Taste method of Banana fruit & BananaT class ");
    }
}

abstract class EmployeeS{
    abstract void calculateSalary();
}
class Manager extends EmployeeS{
    public void calculateSalary(){
        System.out.println("Manager makes 500K$ per year");
    }
}
class Engineer extends EmployeeS{
    public void calculateSalary(){
        System.out.println("This staff engineer makes 1000000K$ per year");
    }
}

abstract class ShapeD{
    abstract void drawShape();
}
class CircleD extends ShapeD{
    public void drawShape(){
        System.out.println("Draw shape method implemented inside CircleD class");
    }
}
class RectangleD extends ShapeD{
    public void drawShape(){
        System.out.println("Draw shape method implemented inside RectangleD Class");
    }
}

abstract class BankAccountba{
abstract void deposit();
abstract void withdraw();
}
class Savingsba extends BankAccountba{
    public void deposit(){
        System.out.println("Deposit method of savings class extends BankAccountba");
    }
    public void withdraw(){
        System.out.println("Withdraw method of savings class extends BankAccountba");
    }
}

class Currentba extends BankAccountba{
    public void deposit(){
        System.out.println("Deposit method of current  class extends BankAccountba");
    }
    public void withdraw(){
        System.out.println("Withdraw method of current class extends BankAccountba");
    }
}

abstract class AnimalM{
    abstract void move();
}
class BirdM extends AnimalM{
    public void move(){
        System.out.println("Bird flies ");
    }
}
class FishM extends AnimalM{
    public void move(){
        System.out.println("Fish swims");
    }
}

abstract class Furniture{
    abstract void display();
}
class Chair extends Furniture{
    public void display(){
        System.out.println("Chair is categorized as furniture");
    }
}
class Table extends Furniture{
    public void display(){
        System.out.println("Table is categorized as furniture too ");
    }
}

public class Abstraction {
    public static void main(String[] args){
        System.out.println("Abstraction practice in Java ");
        System.out.println("****************************");
        CurrentA ca = new CurrentA();
        SavingsA sa = new SavingsA();
        ca.savings();
        ca.withdraw();
        sa.savings();
        sa.withdraw();
        System.out.println("******************************************");
        CircleA cr = new CircleA();
        RectangleA ra = new RectangleA();
        cr.calculateArea();
        ra.calculateArea();
        System.out.println("*********************************************");
        DogS ds = new DogS();
        CatS cs = new CatS();
        ds.sound();
        cs.sound();
        System.out.println("************************************************");
        CarD cd = new CarD();
        BikeD bd = new BikeD();
        cd.drive();
        bd.drive();
        System.out.println("***************************************************");
        AppleT at = new AppleT();
        BananaT bt = new BananaT();
        at.taste();
        bt.taste();
        System.out.println("*******************************************************");
        Manager m = new Manager();
        Engineer e = new Engineer();
        m.calculateSalary();
        e.calculateSalary();
        System.out.println("*********************************************************");
        CircleD cird = new CircleD();
        RectangleD rd = new RectangleD();
        cird.drawShape();
        rd.drawShape();
        System.out.println("*************************************************************");
        Savingsba sba = new Savingsba();
        Currentba cba = new Currentba();
        sba.deposit();
        sba.withdraw();
        cba.deposit();
        cba.withdraw();
        System.out.println("************************************************************");
        BirdM bm = new BirdM();
        FishM fm = new FishM();
        bm.move();
        fm.move();
        System.out.println("***************************************************************");
        Chair ch = new Chair();
        Table tb = new Table();
        ch.display();
        tb.display();


    }
}
