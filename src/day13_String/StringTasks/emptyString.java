package day13_String.StringTasks;

import java.util.Scanner;

public class emptyString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a string:");

        String str= scan.next();


        int r1=str.length();

        String r2=str.substring(str.length()-3);



        if(r1==0){
            System.out.println("empty");
        }else if(r1>3){
            System.out.println(r2);
        }else if(r1<3){
            System.out.println(str);
        }
        scan.close();






        }
}
/*
3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
