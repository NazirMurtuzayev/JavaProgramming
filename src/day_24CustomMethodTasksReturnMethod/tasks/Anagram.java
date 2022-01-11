package day_24CustomMethodTasksReturnMethod.tasks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "cba";
        String str2 = "bac";

       boolean isAnagram= isAnagram(str1, str2);




    }

    public static boolean isAnagram(String str1,String str2) {



            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();

            Arrays.sort(ch1); // while you sort the elements in the array all the characters sorting same.
            Arrays.sort(ch2);

            boolean result=Arrays.equals(ch1,ch2);

            if(result){
                System.out.println(true);
            }else{
                System.out.println(false);
            }


             return result;


    }
}
/*
 2. create a method named isAnagram that passes two String
 parameters, the method returns true if the given two strings
 are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true

 */