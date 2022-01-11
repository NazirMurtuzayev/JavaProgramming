package day19_LoopsPractices;

public class UniqueCharacters {
    public static void main(String[] args) {


        String str="aabccdeef";
        String result="";


        for (int j = 0; j <str.length() ; j++) {

            char ch= str.charAt(j);



            int count = 0;//represents the frequency of the char
            for (int i = 0; i < str.length(); i++) {//compares the character that outer loop picked, with each character of the string
                char each = str.charAt(i);//each character of str
                if (ch == each) {
                    count++;
                }

            }

            if(count!=1){//if the freuquency of the charcater is 1, then the character is unique
           continue;
            }
            result+=ch;
        }


        System.out.println(result);


    }
}
/*
2. Write a program that can find a unique characters from string without using indexOf()
ex:str="aabccdeef"
output:
bdf
 */
