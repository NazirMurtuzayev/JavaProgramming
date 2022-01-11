package day_32Constructors;

public class Employee { // one constructor can call only one constructor and make sure constructor doe not contain itself

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name){ // in java only constructor can call constructor
        this.name=name; // this. is used for to call instance variables or method
    }
    public Employee(String name, char gender){
        this(name);  // you can not call constructor by using its name , you have to use this function  this();
        this.gender=gender;
    }

    public Employee(String name, char gender, String jobTitle){
        this(name,gender); // same as this.name=name;  this.gender=gender; constructor call at the first step in that constructor.
        this.jobTitle=jobTitle;
    }

    public Employee(String name, char gender, String jobTitle,double salary){
        this(name, gender, jobTitle);
        this.salary=salary;
    }

    public void method1(){

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }






}


