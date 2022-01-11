package day13_String;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String sentence = scan.nextLine();


        char firstChar = sentence.charAt(0);

        int totalChars = sentence.length();//"Cydeo"

        char lastChar = sentence.charAt(sentence.length() - 1);


        System.out.println("first = " + firstChar);
        System.out.println("last = " + lastChar);
        System.out.println("length = " + totalChars);
        scan.close();


    }

}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence


 */
