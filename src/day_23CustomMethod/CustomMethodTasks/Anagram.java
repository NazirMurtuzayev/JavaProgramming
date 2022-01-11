package day_23CustomMethod.CustomMethodTasks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        anagram("lama", "alma");



    }

    public static void anagram (String word1, String word2){

        char [] ch1 = word1.toCharArray();
        char [] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean res = Arrays.equals(ch1,ch2);
        System.out.println(res);








    }


}
/*
17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram

 */
