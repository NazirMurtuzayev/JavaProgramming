package day_39Recap.person;

public class Student extends Person{


    private int studentId;
    private String fieldOfStudy,schoolName;
    private char grade;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(grade!='A' && grade!='B' && grade!='C' && grade!='D' && grade!='F'){
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {

        if(fieldOfStudy==null || fieldOfStudy.isEmpty()){
            System.err.println("Invalid filed of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName==null || schoolName.isEmpty()){
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, int studentId, char grade, String fieldOfStudy, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setGrade(grade);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
    }
    public void study(){
        System.out.println(getName()+" is studying at "+schoolName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + studentId +
                ", grade=" + grade +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included
 */