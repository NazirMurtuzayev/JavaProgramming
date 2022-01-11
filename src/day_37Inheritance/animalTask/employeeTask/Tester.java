package day_37Inheritance.animalTask.employeeTask;

public class Tester extends Employee {


    public Tester(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, "Tester", salary);
    }


    public void work(){
        System.out.println(name+"is working as a "+jobTitle);
    }
    public void testing(){
        System.out.println(name+"as a  "+jobTitle+" is testing");
    }
    public void creatingTicket(){
        System.out.println(name+"as a "+jobTitle+" is creating ticket");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
/*

	2.2 Create the subclass of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()
 */

