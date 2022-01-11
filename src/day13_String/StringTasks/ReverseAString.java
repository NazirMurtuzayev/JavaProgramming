package day13_String.StringTasks;

public class ReverseAString {
    public static void main(String[] args) {

        String word="12345";
        String reverseWord="";


        if(word.length()==5){
            for (int i = word.length()-1; i >=0; i--) {
               reverseWord+=word.charAt(i);
            }
            System.out.println(reverseWord);

        }else if(word.length()<5){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }





    }
}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long. If word is shorter,
display message: "Too short!". If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
*Interview question
 */