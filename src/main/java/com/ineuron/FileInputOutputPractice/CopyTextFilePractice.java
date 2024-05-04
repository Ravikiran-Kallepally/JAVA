package com.ineuron.FileInputOutputPractice;
import java.io.*;

public class CopyTextFilePractice {
    public static void main(String[] args){
        String sourceFile ="demo.txt";
        String destinationFile ="copy.txt";
        try{
            FileInputStream input = new FileInputStream(sourceFile);
            FileOutputStream output = new FileOutputStream(destinationFile);
            int n;
            while((n = input.read())!=-1){ //this condition has to return  boolean value
                // !=-1 here tell us that the file is not empty , if its empty this condition will be true
                output.write(n);
            }
            input.close(); //close input stream
            output.close(); // close output stream
            System.out.println("File Copied Successfully");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
