package day13_String.StringTasks;

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first String:");
        String s1=scan.nextLine();

        System.out.println("Enter second String");
        String s2=scan.nextLine();

        int lengthStr1= s1.length();
        int lengthStr2 = s2.length();

        if(lengthStr1>lengthStr2){
            System.out.println(s1);
        }else {
            System.out.println(s2);
        }
        scan.close();


/*
2. write a program that asks user to enter two strings, and print out the longest string

 */


    }
}
