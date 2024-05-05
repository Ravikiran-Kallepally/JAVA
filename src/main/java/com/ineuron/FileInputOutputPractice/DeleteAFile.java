package com.ineuron.FileInputOutputPractice;

import java.io.File;

public class DeleteAFile {
    public static void main(String[] args){
        File deletedFile = new File("copy.txt");
        if(deletedFile.delete()){
            System.out.println("Deleted the file "+deletedFile.getName());
        }else{
            System.out.println("Failed to delete the file ");
        }
    }
}
