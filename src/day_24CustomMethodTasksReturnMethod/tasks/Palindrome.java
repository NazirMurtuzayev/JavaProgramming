package day_24CustomMethodTasksReturnMethod.tasks;

public class Palindrome {
    public static void main(String[] args) {

        String str="Level";
        System.out.println(isPalindrome(str));


    }


    public static boolean isPalindrome (String str){

        String result="";



        for (int i = str.length() - 1; i >= 0; i--) {

            result+=str.charAt(i);

            }

            boolean isPalindrome=str.equalsIgnoreCase(result);


           return isPalindrome;
    }
}
/*
4. By using the reverse method above to create another
 method named isPalindrome  that passes a String parameter,
 the method returns true if the string is palindrome,
 otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */
