package com.ineuron.FileInputOutputPractice;


import java.io.File;
//This solution is by AI




public class SearchFile {
    // Method to search for the file in the directory and its subdirectories
    public static void searchFile(String fileName, File directory) {
        // Get all the files and directories within the current directory
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                // If the file is a directory, recursively search it
                if (file.isDirectory()) {
                    searchFile(fileName, file);
                } else {
                    // If the file is found, print its path
                    if (fileName.equalsIgnoreCase(file.getName())) {
                        System.out.println("File found: " + file.getAbsolutePath());
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        // Replace with the directory path where you want to search for the file
        String directoryPath = "R:\\BP Modeling quizzes";
        // Replace with the name of the file you are searching for
        String searchFileName = "test.txt";

        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Start the search
        searchFile(searchFileName, directory);
    }
}
