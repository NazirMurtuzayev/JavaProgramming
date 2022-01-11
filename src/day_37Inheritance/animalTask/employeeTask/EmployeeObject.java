package day_37Inheritance.animalTask.employeeTask;

import day_32Constructors.Test;

public class EmployeeObject {

    public static void main(String[] args) {


        Developer developer=new Developer("Nazir",'M',32,"Developer",100000);

        developer.work();
        System.out.println(developer);

        Tester tester=new Tester("Nazir",'M',21,"Tester",1000000);

        System.out.println(tester);
        tester.testing();


    }

}
/*

 */