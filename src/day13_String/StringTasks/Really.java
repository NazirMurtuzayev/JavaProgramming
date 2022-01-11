package day13_String.StringTasks;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner scan=  new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=scan.nextLine();

        word.endsWith("ly");


        if(word.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }

    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */