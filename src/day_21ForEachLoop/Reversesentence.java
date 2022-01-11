package day_21ForEachLoop;

import java.util.Arrays;

public class Reversesentence {
    public static void main(String[] args) {

        String sentence="Today is a good day to learn Java";

       String words[]= sentence.split(" ");
        System.out.println(Arrays.toString(words));


        String reversedSentence="";

        for (int i = words.length-1; i >=0 ; i--) {
            reversedSentence+=words[i] + " ";
        }

        System.out.println(reversedSentence);

        System.out.println("-----------------");

        String sentence1="I love Vivab";

        String word[]=sentence1.split(" ");

        System.out.println(Arrays.toString(word));

        String reversed="";

        for (int i = word.length-1; i >=0 ; i--) {
            reversed+=word[i]+" ";
        }

        System.out.println(reversed);

    }
}
/*
Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
 */