package com.ineuron.corejavapractice;
import com.ineuron.corejavamath.Calculator;
import  com.ineuron.utilities.StringHelper;
import com.ineuron.models.Employee; //imported package
import com.ineuron.io.FileOperations;
import com.ineuron.utilities.ArrayOperations;
import com.ineuron.collections.ListOperations;
import com.ineuron.Gui.Window;
import com.ineuron.Network.HttpClient;
import com.ineuron.logging.logger;
import com.ineuron.Security.Encryptor;

public class PackagesandImport {
    public static void main(String[] args){
        System.out.println("Packages and Import class file from core java folder ");
        Calculator.logSomething(); //This will log the message to the console
        StringHelper.reverse("LIonKing");
        StringHelper.toUpperCase("mufasa");
        StringHelper.toLowerCase("SIMBA");
        Employee e = new Employee(22,"hyn",500000.87); //instance of employee class
        e.logStatement(); //calling the employee class method from a different package
        FileOperations.read();
        FileOperations.write();
        ArrayOperations.reverse();
        ArrayOperations.sort(new int[]{4, 5, 6, 9, 8, 7});
        ListOperations.add();
        ListOperations.find();
        ListOperations.remove();
        Window.createComponents();
        HttpClient.get();
        HttpClient.put();
        HttpClient.post();
        HttpClient.delete();
        logger.logSomething();
        Encryptor.encryption();
        Encryptor.decryption();

    }
}
