package InterviewQuestions;

public class CountLetters {

    public static void main(String[] args) {
        String str = "aaabbbcc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each2 = str.charAt(j);

                if (each == each2) {
                    count++;
                }


            }
            if (!result.contains(each + "")) {
                result += each + "" + count;

            }

        }

        System.out.println();
    }
}
/*
3. Find frequency of each character in given string
    ex: input --> "aabccddd";
        output --> a2b1c2d3
 */
