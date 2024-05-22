package AdvancedJAVA_NEW;

import java.io.FileInputStream;
import java.util.*;

public class PropertiesApp {
    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("R:\\IntelliJ Idea Projects\\IneuronPractice\\src\\main\\java\\AdvancedJAVA_NEW\\application.properties");
        Properties properties = new Properties();
        properties.load(fis);

        String url = properties.getProperty("url");
        String userName = properties.getProperty("userName");
        String password = properties.getProperty("password");

        System.out.println("URL "+url);
        System.out.println("User "+userName);
        System.out.println("Password: "+password);
    }
}
