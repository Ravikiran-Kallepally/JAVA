package com.ineuron.FileInputOutputPractice;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToATextFile {
    public static void main(String[] args){
        String fileName ="demo.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){ // this parenthesis declaration comes under try with resources concept
//            (When you declare a resource (such as a BufferedWriter)
//            within the parentheses after try, Java ensures
//            that the resource is properly closed (i.e.,
//            its close() method is called)
//            when the block exits, whether normally or due to an exception).
            writer.write("some thing to demo file");
            writer.newLine();;
            writer.write("two lines for demo");
            writer.newLine();
            writer.write("you are done with writing to a new file");


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
