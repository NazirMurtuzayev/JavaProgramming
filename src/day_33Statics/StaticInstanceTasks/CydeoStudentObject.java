package day_33Statics.StaticInstanceTasks;

public class CydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent student=new CydeoStudent("John",25,15,25,7,'M','A');

        System.out.println(student);
        System.out.println(CydeoStudent.programmingLanguage);
        CydeoStudent.printProgLanguage();
        System.out.println(CydeoStudent.schoolName);
        CydeoStudent.printSchoolName();
    }
}
