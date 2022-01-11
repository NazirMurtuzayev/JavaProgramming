package day_30CustomClass.CustomClassTasks;

public class MySalary {

    public static void main(String[] args) {


        SalaryCalculator salary=new SalaryCalculator(50,0.06,0.26,45);

        System.out.println("Salary Calculator : " + salary);

        System.out.println(salary.salary());


    }
}
