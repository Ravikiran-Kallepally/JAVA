package com.ineuron.FileInputOutputPractice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromATextFile {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(new File("demo.txt"));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found exception");
            e.printStackTrace();
        }


    }
}
