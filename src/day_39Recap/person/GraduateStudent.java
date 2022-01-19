package day_39Recap.person;

public class GraduateStudent extends Student {


    public GraduateStudent(String name, int age, char gender, int studentId, char grade, String fieldOfStudy, String schoolName) {
        super(name, age, gender, studentId, grade, fieldOfStudy, schoolName);
    }

    @Override
    public void study(){
        System.out.println(getName()+" in "+getFieldOfStudy()+" major is studying at "+getSchoolName());
    }
}
/*
1. GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary

 */