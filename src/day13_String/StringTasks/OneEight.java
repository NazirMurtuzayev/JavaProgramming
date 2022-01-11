package day13_String.StringTasks;

import java.util.Scanner;

public class OneEight {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);

        System.out.println("enter first words:");
        String firstWord=scan.nextLine();

        System.out.println("enter second word:");
        String secondWord=scan.nextLine();



        if(firstWord.charAt(firstWord.length()-1)==secondWord.charAt(0)) {
            System.out.println(firstWord+ secondWord.substring(1));

        }else {
            System.out.println(firstWord+secondWord);
        }




    }
}
/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter
    of the last word is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */