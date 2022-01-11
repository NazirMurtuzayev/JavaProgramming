package InterviewQuestions;

public class Mirror {
    public static void main(String[] args) {

        String str="abXYZba";
        String result="";


        for (int j = 0; j < str.length() - 1; j++) {


            for (int i = str.length() - 1; i <= 0; i--) {




            }
            System.out.println(result);
        }

    }

}
/*

  Given a string, look for a mirror image (backwards) string at both the
  beginning and end of the given string.
  In other words, zero or more characters at the very beginning of the given string,
  and at the very end of the
  string in reverse order (possibly overlapping). For example, the string "abXYZba"
   has the mirror end "ab".

                  mirrorEnds("abXYZba") → "ab"
                  mirrorEnds("abca") → "a"
                  mirrorEnds("aba") → "aba"
         */
