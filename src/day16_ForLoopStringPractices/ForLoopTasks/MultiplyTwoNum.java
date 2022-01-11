package day16_ForLoopStringPractices.ForLoopTasks;

import java.util.Scanner;

public class MultiplyTwoNum {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter two positive numbers:");

        int firstNumber= scan.nextInt();
        int secondNumber= scan.nextInt();

        int result=0;

        for (int i = 0; i <secondNumber ; i++) {
           result+=firstNumber;
        }
        System.out.println(result);

    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200



 */