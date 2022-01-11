package day16_ForLoopStringPractices.ForLoopTasks;

public class FrequencyOfChar {
    public static void main(String[] args) {

    String str="AAABBBC";
    char ch='A';
    int frequency=0;

        for (int i = 0; i <str.length() ; i++) {// i" indexes of str
            char eachChar=str.charAt(i); //eachChar: each character of str

            if (ch==eachChar) { //if given ch is matching with eachChar , then ch is appeared in the string

                frequency++; //indicates how many times it appeared in the String
            }

        }
        System.out.println(frequency);

    }
}
/*
Write a program that can return frequency of a char from a String
Ex:
str="AAABBC"
Output:
3
 */
