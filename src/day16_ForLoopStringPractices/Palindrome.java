package day16_ForLoopStringPractices;

public class Palindrome {
    public static void main(String[] args) {


        String str = "Level";

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        boolean isPalindrome = str.equalsIgnoreCase(result);

        System.out.println(isPalindrome);






    }
}
/*


       "Java" = "avaJ"= false (not a plaindrome)
       "Anna"="annA"=true
       level
       dad
       mom




 */