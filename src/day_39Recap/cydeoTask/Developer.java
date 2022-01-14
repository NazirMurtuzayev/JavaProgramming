package day_39Recap.cydeoTask;

public class Developer extends Employee {


    public Developer(String korkmaz, int age, char gender, int employeeId, String jobTitle, double salary) {
        super("Developer", age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is writing a code");
    }
    public void  fixingBugs(){
        System.out.println(getName()+" is fixing Bugs ");
    }
}
/*
  4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */