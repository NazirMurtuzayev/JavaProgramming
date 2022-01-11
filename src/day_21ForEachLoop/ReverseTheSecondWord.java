package day_21ForEachLoop;

import java.util.Arrays;

public class ReverseTheSecondWord {
    public static void main(String[] args) {

        String sentence="I Love Java";

        String [] word=sentence.split(" ");

        String reversed="";

        for (int i= word[1].length()-1; i>=0;i--) {
            reversed+=word[1].charAt(i);

        }


        System.out.println(reversed);

       // sentence=sentence.replace(word[1], reversed);
        word[1]=reversed;
        System.out.println(Arrays.toString(word));

        for (String words : word) {
            System.out.print(words+" ");
        }







    }
}
/*
2. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */