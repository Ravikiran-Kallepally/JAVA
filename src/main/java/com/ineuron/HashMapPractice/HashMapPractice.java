package com.ineuron.HashMapPractice;
import java.util.HashMap;

class Student{
    String name;
    int id;
    //double marks;
    public Student(String name,int id ){ //this is a constructor
        this.name=name;
        this.id=id;
        //this.marks=marks;
    }
}

class Book{
    String title;
    double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
}

class Employee{
    String name;
    double salary;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
}

class Country{
    String country;
    String capital;
    public Country(String country,String capital){
        this.country=country;
        this.capital=capital;
    }
}

public class HashMapPractice {

    public static void greaterNumber(HashMap<String,Integer>a,String b){
        if(a.containsKey(b)){
            if(b.length()>5){
                System.out.println("The String length greater than 5 is "+b);
            }else{
                System.out.println("The string length is not greater than 5 "+b);
            }
        }
    }
    public static void givenNumber(HashMap<String,Double> a, Double b){
        if(a.containsValue(b)){
            if(b>95){
                System.out.println("This value is greater than 95 "+b);
            }
        }
    }

    public static void givenSalary(HashMap<String,Double> a,String employeeName,Double b){
        if(a.containsValue(b)){ //check the value
            double c = a.get(employeeName);
            if(c > 50){
                System.out.println("salary greater than 50 ");
            }else{
                System.out.println("Salary is less than 50 ");
            }
        }
    }

    public static void findCapital(HashMap<String,String> a , String b){
        if(a.containsKey(b)){
            String result = a.get(b);
            System.out.println("capital of the given country is "+result);
        }
    }

    public static void main(String[] args){
        System.out.println("HashMap Practice ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        HashMap<String,Integer> student = new HashMap<String,Integer>();
        Student s = new Student("qw",23);
        Student s1 = new Student("dudkdkdkdk",25);
        Student s2 = new Student("ka",22);
        map.put("rk",26);
        map.put("sameer",26);
        map.put("ak",23);
        System.out.println("HashMap before removal : "+map);
        map.remove("rk");
        System.out.println("HashMap after removal : "+map);
        String nameToFind = "ak";
        if(map.containsKey(nameToFind)){
            int age = map.get(nameToFind); // you are getting the value of the key and storing in this variable
            System.out.println("The age of " +" "+nameToFind+" "+"is "+age);
        }
        student.put(s.name,s.id); //key value pair => String and Integer
        student.put(s1.name,s1.id);
        student.put(s2.name,s2.id);
        System.out.println("student hashmap before removal "+student);
        student.remove(s.name);
        System.out.println("Student HashMap after removal "+student);
        System.out.println("*********************************************");
        greaterNumber(student,"qw");//This element has been removed from the hashmap
        greaterNumber(student,"ka");
        System.out.println("***************************************************");
        Book b = new Book("cat",77.76);
        Book b1 = new Book("dog",98.87);
        Book b2 = new Book("rabbit",85.98);
        HashMap<String, Double> Book = new HashMap<String, Double>();
        Book.put(b.title,b.price);
        Book.put(b1.title,b1.price);
        Book.put(b2.title,b2.price);
        System.out.println("HashMap of Book before removal "+ Book);
        Book.remove("cat");
        System.out.println("Hashmap of Book after removal " +Book);
        System.out.println("**********************************");
        givenNumber(Book,98.87);
        System.out.println("**********************************");
        Employee e = new Employee("dhoni",65.76);
        Employee e1 = new Employee("virat",78.87);
        Employee e2 = new Employee("rohit",87.74);
        HashMap<String,Double> employeeHash = new HashMap<String,Double>();
        employeeHash.put(e.name,e.salary);
        employeeHash.put(e1.name,e1.salary);
        employeeHash.put(e2.name,e2.salary);
        System.out.println("Employee hashmap before removal : "+employeeHash);
        employeeHash.remove("rohit");
        System.out.println("Employee hashmap after removal : "+ employeeHash);
        employeeHash.get("virat");
        System.out.println("***********************************");
        givenSalary(employeeHash,e1.name,e1.salary);
        System.out.println("*************************************");
        Country c = new Country("india","delhi");
        Country c1 = new Country ("USA ","Washington DC");
        HashMap<String,String> countryCapital=new HashMap<String,String>();
        countryCapital.put(c.country,c.capital);
        countryCapital.put(c1.country,c1.capital);
        System.out.println("Country capitals hashmap "+countryCapital);
        System.out.println("****************************");
        findCapital(countryCapital,c.country);

    }
}
