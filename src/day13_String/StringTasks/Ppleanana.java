package day13_String.StringTasks;

import java.util.Scanner;

public class Ppleanana {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1=input.nextLine();


        System.out.println("Enter second word:");
        String word2=input.nextLine();



       String s1= word1.substring(1)+word2.substring(1);

        System.out.println(s1);










    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana


 */
