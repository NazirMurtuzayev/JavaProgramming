package officehours;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word");
        String name=scan.next();
        String result="";


        for (int i=name.length()-1; i >=0 ; i--) {

              result+=name.charAt(i);
        }

        boolean hasPalindrome=name.equalsIgnoreCase(result);
        System.out.println(hasPalindrome);


    }
}

/*
           Write a program that can check if the given String is palindrome

                                  Ex:
                                      input:
                                          Level

                                      output:
                                          true


                                      input:
                                          Anna

                                      output:
                                          true

                       */

