package day16_ForLoopStringPractices.ForLoopTasks;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
          double number=scan.nextDouble();

          double result=1;

        for (int i = (int) number; i>=1 ; i--) {
            result+=1;
        }
        System.out.println("result = " + result);

    }
    }
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
