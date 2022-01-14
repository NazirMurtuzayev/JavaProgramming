package day_38Inheritance.employee;

public class Tester extends Employee {

    public Tester( String jobTitle, String companyName, int age, int id, char gender, double salary) {
        super("Tester", jobTitle, companyName, age, id, gender, salary);
    }

    public void work(){
        System.out.println(name+"is working at"+companyName+"as a"+jobTitle);
    }


}
