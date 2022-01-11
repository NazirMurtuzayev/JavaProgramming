package day13_String.StringTasks;

import java.util.Scanner;

public class StartXcode {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=scan.nextLine();

        if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println("invalid");
        }
    }
}
/*
 3. Ask user to enter a word. If the work starts with x,
 print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */