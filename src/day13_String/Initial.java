package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the first name:");
        String firstName=scan.next();//Java

        System.out.println("Enter the last name:");
        String lastName=scan.next();

        char f=firstName.charAt(0);
        char l=lastName.charAt(0);

        String initial= f+"."+l;
        System.out.println("initial= "+initial);

        scan.close();



    }
}
