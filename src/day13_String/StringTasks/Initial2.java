package day13_String.StringTasks;

import java.util.Scanner;

public class Initial2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        System.out.println("Enter first name:");
        String firstname= scan.nextLine();

        System.out.println("Enter last name:");
        String lastName= scan.nextLine();

        char f= firstname.charAt(0);
        char l= lastName.charAt(0);

        java.lang.String initial=f+"."+l;
        System.out.println("initial = " + initial);


    }
}

/*
2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output

 */
