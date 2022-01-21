package day_41Exceptions;

import day_39Recap.person.Student;

import java.io.FileInputStream;


public class Checked_vs_Unchecked {

    public static void main(String[] args) throws InterruptedException {


        int a=10;
        int b=10;

        //System.out.println( a/b );
        //System.out.println("Wooden Spoon");

        char []  characters={'A', 'B', 'C'};
        //                     0,   1,   2

        System.out.println(characters [99]);

        Student student=null;

        //System.out.println(student.getName());
        //student.study();

        String str="Wooden Spoon";

       // str=null;

       // System.out.println(str.toUpperCase());

        String str2="";

        System.out.println(str2.isEmpty());

        // checked Exception:

        System.out.println("Hello");

        //checked exception //Thread.sleep(3000);

        System.out.println("Cydeo");


      //checked exception // FileInputStream file=new FileInputStream("path of the file");












    }
}
