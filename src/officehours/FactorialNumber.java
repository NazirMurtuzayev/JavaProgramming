package officehours;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number:");
        int number = scan.nextInt();
        int result = 1;

        if (number > 2) {
            for (int i = number; i >= 1; i--) {
                result *= i;
            }
        } else {
            result += number;
        }
        System.out.println("Factorial of number is: " + result);


        System.out.println("-------------------");











    }
}

/* Write a program that can return the factorial number of any given number

                     Ex:
                       input: 5
                    output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
                          */

