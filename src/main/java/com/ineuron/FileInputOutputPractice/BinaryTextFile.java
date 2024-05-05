package com.ineuron.FileInputOutputPractice;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class BinaryTextFile {
    public static void main(String[] args){
//        if(args.length<2){
//            System.out.println("Please provide input and output files ");
//            System.exit(0);
//        }
        String inputFile = "demo.txt";
        String outputFile = "copy.txt";
        //The following try block is called try with resources
        try(InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream= new FileOutputStream(outputFile);){
            int byteRead = -1;
            while((byteRead=inputStream.read())!=-1){ //this while will check if there is some data in the input file
                outputStream.write(byteRead);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
