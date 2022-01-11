package day_37Inheritance.animalTask.employeeTask;

public class Teacher extends Employee {


    public Teacher(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, jobTitle, salary);
    }

    public void work(){
        System.out.println(name+"is working as a "+jobTitle);
    }

    public void teaching(){
        System.out.println(name+"is teaching as a "+jobTitle);
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
2.4 Create the subclass of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching
				toString()
 */