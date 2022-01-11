package day_37Inheritance.animalTask.employeeTask;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public String jobTitle;
    public double salary;


    public Employee(String name, char gender, int age, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public void work(){
        System.out.println(name+"is working as "+jobTitle);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
/*
2. Employee Task:
	2.1 Create a class named Employee:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				toString()

 */