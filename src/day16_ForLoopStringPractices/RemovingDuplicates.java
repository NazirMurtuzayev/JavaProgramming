package day16_ForLoopStringPractices;

public class RemovingDuplicates {
    public static void main(String[] args) {

        String str="aabbcc";
        String result="";
        for(int i = 0; i<=  str.length()-1; i++) {// i: represents the all the index numbers of str(starts from 0)
            String ch = "" + str.charAt(i);//represents each Character of str

            if (!result.contains(ch)) { // if the character is not contained in the result
                result += ch;
            }
        }
        System.out.println(result);

    }
}
/*
. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC
                    Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding

 */