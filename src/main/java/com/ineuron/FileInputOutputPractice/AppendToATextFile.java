package com.ineuron.FileInputOutputPractice;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToATextFile {

    public static void main(String[] args){
        String fileName ="copy.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            bw.append('k');
            bw.append('a');
            bw.append('p');
            bw.append('p');
            bw.append('e');
            bw.append('n');
            bw.append('d');
        }catch (IOException e){
            System.out.println("IO exception for append to a text file ");
            e.printStackTrace();
        }

    }
}
