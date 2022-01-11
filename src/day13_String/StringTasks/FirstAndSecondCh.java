package day13_String.StringTasks;

import java.util.Scanner;

public class FirstAndSecondCh {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");

        String str= scan.nextLine();


        char firstCh = str.charAt(0);
        System.out.println("firstCh = " + firstCh);

        int length=str.length();
        System.out.println("length = " + length);

        char lastCh= str.charAt(length-1);
        System.out.println("lastCh = " + lastCh);

        System.out.println( firstCh == lastCh);





    }
}
  /*
   1. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
    */
