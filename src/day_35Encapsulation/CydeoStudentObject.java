package day_35Encapsulation;

import java.util.concurrent.Callable;

public class CydeoStudentObject {
    public static void main(String[] args) {


        CydeoStudent student=new CydeoStudent("Raphael",'M',31,25,13,"SDET");

        System.out.println(student);

       CydeoStudent.printProgrammingLanguage();
        System.out.println(student.schoolName);

    }
}
