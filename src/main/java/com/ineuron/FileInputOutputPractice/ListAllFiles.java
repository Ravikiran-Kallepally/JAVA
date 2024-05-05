package com.ineuron.FileInputOutputPractice;

import java.io.File;

public class ListAllFiles {
    public static void main(String[] args){
        String fileContents="R:\\BP Modeling quizzes";
        File directory = new File(fileContents);
        File[] filesList = directory.listFiles();
        if(filesList!=null){
            for(File file :filesList ){
                if(file.isFile()){
                    System.out.println(file.getName());
                }
            }
        }else{
            System.out.println("The directory path is not valid or empty ");
        }
    }
}
