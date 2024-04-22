//11) Create variables of all primitive data types and print their default values.
//12) Declare a variable of type `String` and assign it a value. Print the length of the string.
//13) Create a `char` variable and print its ASCII value.
//14) Declare and initialize a `boolean` variable. Convert it to a `String` and print.
//15) Create a `double` variable and round it to the nearest integer. Print the rounded value.
//16) Declare a `float` variable and cast it to `int`. Print the integer value.
//17) Declare a `long` variable and convert it to `int`. Print the `int` value.
//18) Create a `byte` variable and increment its value. Print the new value.
//19) Declare a `short` variable and perform arithmetic operations. Print the result.
//20) Create variables of all non-primitive data types and initialize them. Print their values.
package com.ineuron.corejavapractice;

interface Greet{
    public void Greeting(); // this method is by default public and static because it is inside an Interface
}

class englishGreeting implements Greet{
    @Override
    public void Greeting() {
        System.out.println("Hello!");
    }
}

class hindiGreeting implements  Greet{
    @Override
    public void Greeting(){
        System.out.println("Namasthe!");
    }
}

class B{
   public static void methodA(){
        System.out.println("This is a method inside a class B & its a  non-primitive data type");
    }

}

class Person{
    private  String name ; // what it has -> variables
    private int age ; //what it has -> variables

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age){ // This is the constructor
    this.name =name;
    this.age=age;
    }
}

class Car{
    int wheels;
    String brand;
    double miles;
    //getter methods defined below
    public int getWheels(){
        return  wheels;
    }
    public String getBrand(){
        return  brand;
    }
    public double getMiles(){
        return  miles;
    }
    // following is the constructor
    public Car(int wheels,String brand,double miles){
        this.wheels=wheels;
        this.brand=brand;
        this.miles=miles;
    }
}


public class datatypes {
    static byte num;
    static short Q;
    static int E;
    static long T;
    static float U;
    static double O;
    static boolean isPie;
    static char a = 'z';
    static String str = "RK";
    static boolean isGenuine = false;
    static double roundValue =7.96;
    static float floatlikeInt = 999999999;
    static long longLikeInt = 987654321;
    static byte counter = 126;
    static short arithmeticExpression =12+6/8*2-1;
    static B b = new B(); // non-primitive data type
    static String nonPrimitiveValue ="Sunny Day ";
    static int[] array = new int[3];
    public static void main(String[] args){
        byte digit;
        short W;
        int R;
        long Y;
        float I;
        double P;
        boolean isCake;
        char x;
        counter++;
        Person p = new Person("RK",26);
        Car c = new Car(4,"Audi",19.5);
        englishGreeting eg = new englishGreeting();
        hindiGreeting hg = new hindiGreeting();
        System.out.println("********************************************************");
        System.out.println("Data types in Java");
        System.out.println(num);
        System.out.println(Q);
        System.out.println(E);
        System.out.println(T);
        System.out.println(E);
        System.out.println(O);
        System.out.println(isPie);
        System.out.println(a);
        System.out.println("************************************");
        System.out.println("The length of the String is "+str.length());
        System.out.println("The ASCII value of character z is "+ (int)a); //Explicit casting
        System.out.println("The boolean genuine value in the form of string is "+ Boolean.toString(isGenuine)); // This is how we cna convert boolean to string
        System.out.println("The rounded value of the double number 7.96 is "+Math.round(roundValue)); // This is how you round a value to its nearest number
        System.out.println("The value of float number cast/converted to Int is "+ (int)floatlikeInt );
        System.out.println("The value of long cast/converted to int is "+ (int)longLikeInt);
        System.out.println("The incremented value of byte counter is " + counter);
        System.out.println("The arithmetic expression performed on short number results in "+ arithmeticExpression);
        System.out.println("***********************NON-PRIMITIVE***************************************************");
        System.out.println("The non primitive type object b for class B is "+ b);
        System.out.println("The name and age of the person "+ p.getName() + " "+ p.getAge());
        System.out.println("No of wheels" + c.getWheels()+" "+"Brand name is "+ " " + c.getBrand()+" "+"number of miles for this car"+" "+c.getMiles());
        System.out.println("Non primitive string"+nonPrimitiveValue);
        System.out.println("array is a non primitive data type "+ array);
        //call the greeting method on objects
        eg.Greeting();
        hg.Greeting();
    }
}
