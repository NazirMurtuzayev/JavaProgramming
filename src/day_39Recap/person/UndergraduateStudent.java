package day_39Recap.person;

public class UndergraduateStudent  extends  Student{

    public UndergraduateStudent(String name, int age, char gender, int studentId, char grade, String fieldOfStudy, String schoolName) {
        super(name, age, gender, studentId, grade, fieldOfStudy, schoolName);
    }
    @Override
    public void study(){
        System.out.println(getName()+" in "+getFieldOfStudy()+" major  is studying at "+getSchoolName());
    }
}
/*
2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary
 */
