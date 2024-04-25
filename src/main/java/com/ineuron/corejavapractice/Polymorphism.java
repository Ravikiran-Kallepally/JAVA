package com.ineuron.corejavapractice;

interface Drawable{
    public void draw();
}

class shapeP{
    public void calculateArea(){
        System.out.println("Parent class calculate area method ");
    }
    public void displayShape(){
        String name = "displayShapeName";
        System.out.println("displayShape method in shape class NAME : "+name);
    }
}

class circleP extends shapeP implements Drawable{
    @Override
    public void calculateArea(){
        super.calculateArea();
        System.out.println("Circle P calculated area");
    }
    public void draw(){
        System.out.println("Implementation of Draw method in circle class");
    }

    @Override
    public void displayShape() {
        super.displayShape();
        System.out.println("displayShape inside a circle class ");
    }
}
class rectangleP extends shapeP implements Drawable{
    @Override
    public void calculateArea(){
        super.calculateArea();
        System.out.println("Rectangle P calculated area");
    }
    public void draw(){
        System.out.println("Implementation of Draw method in rectangle class");
    }
    @Override
    public void displayShape(){
        super.displayShape();
        System.out.println("display shape method overridden in rectangle class");
    }
}

class methodoverloading{
    public void addNumbers(int a , int b){
        int result = a+b;
        System.out.println("The result of adding two Integers is  "+result);
    }
    public void addNumbers(double a , double b){
        double result = a+b;
        System.out.println("The result of adding two decimal numbers is "+result);
    }
}

class AnimalSound{
    public void sound(){
        System.out.println("Sound method parent class");
    }
}

class Lion extends AnimalSound{
    @Override
    public void sound() {
       // super.sound(); -> call to parent class constructor
        System.out.println("Lion Roars -> KING");
    }
}

class Tiger extends AnimalSound{
    @Override
    public void sound() {
       // super.sound();
        System.out.println("Tiger Roars too -> It comes from the cat family");
    }
}


class DogSound extends  AnimalSound{
    @Override
    public void sound() {
        //super.sound();
        System.out.println("sound method of dog woof woof ...");
    }
}
class CatSound extends AnimalSound{
    @Override
    public void sound(){
        //super.sound();
        System.out.println("Sound method of cat class  meow meow ...");
    }
}

class ShapeCV{
    public void calculateVolume(){
        System.out.println("calculate volume in shape CV parent class");
    }
}

class Cube extends ShapeCV{
    @Override
    public void calculateVolume() {
        //super.calculateVolume();
        System.out.println("calculate volume of cube class ");
    }
}

class Cylinder extends ShapeCV{
    @Override
    public void calculateVolume() {
        //super.calculateVolume();
        System.out.println("calculate volume of cylinder class ");
    }
}

interface Playable{
    public void playMusic();
    public void stopMusic();
}

class Radio implements Playable{
    //@Override
    public void playMusic() {
        System.out.println("Radio plays music");
    }

    //@Override
    public void stopMusic() {
        System.out.println("Radio stops music ");
    }
}

class VehicleMove{
    public void move(){
        System.out.println("Parent vehicleMove class method");
    }
}

class Carmove extends VehicleMove{
    @Override
    public void move() {
        super.move();
        System.out.println("Car move method -> child class of vehicle move method ");
    }
}

class Bikemove extends VehicleMove{
    @Override
    public void move() {
        super.move();
        System.out.println("Bike move method -> child class of vehicle move method");
    }
}

interface eatable{
    public void eat();
}

class AppleEat implements eatable{
    public void eat(){
        System.out.println("I am eating an apple");
    }
}

class BananaEat implements eatable{
    public void eat(){
        System.out.println("I am eating a banana");
    }
}




public class Polymorphism {
    public static void main(String[] args){
        System.out.println("Polymorphism");
        circleP cp = new circleP();
        rectangleP rp = new rectangleP();
        cp.calculateArea();
        rp.calculateArea();
        cp.draw();
        rp.draw();
        methodoverloading mol = new methodoverloading();
        mol.addNumbers(23,45);
        mol.addNumbers(32.76,98.509);
        cp.displayShape();
        rp.displayShape();
        DogSound ds = new DogSound();
        CatSound cs = new CatSound();
        ds.sound();
        cs.sound();
        Cube cb = new Cube();
        Cylinder cy = new Cylinder();
        cb.calculateVolume();
        cy.calculateVolume();
        Radio rd = new Radio();
        rd.playMusic();
        rd.stopMusic();
        Carmove cm = new Carmove();
        Bikemove bm = new Bikemove();
        cm.move();
        bm.move();
        AppleEat ae = new AppleEat();
        BananaEat be = new BananaEat();
        ae.eat();
        be.eat();
        Lion l = new Lion();
        Tiger t = new Tiger();
        l.sound();
        t.sound();
    }
}
