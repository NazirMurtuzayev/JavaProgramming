package day19_LoopsPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="aabcccd";
        String result="";


        for (int j = 0; j <str.length() ; j++) {

            char ch=str.charAt(j);//each character from string

        int count=0;

        for (int i = 0; i < str.length(); i++) { // to find a frequency of each character
            char each = str.charAt(i);//each character of str

            if (ch == each) {
                count++;

            }
        }
         if (result.contains(""+ch)){
             continue;
         }

        result+=ch;
        result+=count;

        }
        System.out.println(result);



    }
}
/*
Write a program that cn find the
frequency of the characters from a string
str="aabcccd"
output: a2b1c3d1

 */