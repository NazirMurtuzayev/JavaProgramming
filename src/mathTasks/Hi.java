package mathTasks;

import java.util.Scanner;

public class Hi {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        String str = scan.nextLine();

        int countHi=0;





        for (int i = 0; i < str.length()-1; i+=1) {
            String s= str.substring(i,i+2);
            if(s.equals("hi")){
                countHi++;
            }

        }
        System.out.println(countHi);

    }
}
/*
Print out the number of times that the string "hi" appears anywhere in the given
 string. Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2
input: abc hi how hi

output: 2
Example:

input: hi code java please

output: 1
 */
