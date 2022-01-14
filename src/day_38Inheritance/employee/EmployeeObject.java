package day_38Inheritance.employee;

public class EmployeeObject {
    public static void main(String[] args) {

        Tester tester=new Tester("QA","Cydeo",31,15,'M',111000);

        tester.work();
        tester.create();
        System.out.println(tester);

    }
}
