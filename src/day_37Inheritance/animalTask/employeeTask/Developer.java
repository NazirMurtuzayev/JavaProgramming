package day_37Inheritance.animalTask.employeeTask;

public class Developer extends Employee {


    public Developer(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, "Developer",salary);
    }

    public void work(){
        System.out.println(name+"is working as a "+jobTitle);
    }
    public void coding(){
        System.out.println(name+"as a "+jobTitle+"is coding");
    }
    public void fixingBugs(){
        System.out.println(name+"as a "+jobTitle+"is fixing bugs");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
/*
2.3 Create the subclass of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */
