package com.ineuron.abstractmethods;

abstract class vehicle{
    public abstract int getNoOfWheels();
}

class Bus extends vehicle{
    public int getNoOfWheels(){
        return 7;
    }
}

class Auto extends vehicle{
    public int getNoOfWheels(){
        return 3;
    }
}

public class abstractMethods {

    public static void main(String[] args){
        System.out.println("Abstract methods practice ");

    }
}
