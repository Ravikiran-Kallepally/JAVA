package com.ineuron.FileInputOutputPractice;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;

public class ReadFromCSVFile {

    public static void main(String[] args){

        String fileName = "customers.csv";
        //try with resources
        try(CSVReader reader = new CSVReader(new FileReader(fileName))){
            List <String[]> records = reader.readAll();
            //print header
            String[] header = records.get(0);
            printRow(header);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    private static void printRow(String[] row) {
        for (String cell : row) {
            System.out.print(cell + "\t");
        }
        System.out.println();
    }
}
