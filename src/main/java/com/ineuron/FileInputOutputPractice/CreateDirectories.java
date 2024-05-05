package com.ineuron.FileInputOutputPractice;
import java.io.File;

public class CreateDirectories {
    public static void main(String[] args){
        String baseDirectory = "R:\\BP Modeling quizzes\\test";
        File imagesDirectory = new File(baseDirectory);
        if(!imagesDirectory.exists()){
            if(imagesDirectory.mkdirs()){
                System.out.println("Base directory created");
            }else {
                System.out.println("Failed to create directory");
                System.exit(1);
            }
        }
        //create sub-categories
        String[] subCategories ={"background,foreground"};
        for(String s : subCategories){
            File subDir = new File(imagesDirectory,s);
            if(subDir.mkdirs()){
                System.out.println("Sub directory created  "+subDir.getAbsolutePath());
            }else {
                System.out.println("Failed to create sub directory");
            }
        }


    }
}
