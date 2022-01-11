package day17_While_DoLoop.whileLoopsTask;

import java.util.Scanner;

public class DivisioAndMulti {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        float firstNumber= scan.nextFloat();
        float secondNumber= scan.nextFloat();

        int result=0;

        for (int i = 0; i <firstNumber; i++) {
            result+=secondNumber;

            
        }
        System.out.println(result);

        float result2=0f;
      //10,2
        while(firstNumber>0) {
            result2++;
            firstNumber-=secondNumber;



        }
        System.out.println(result2);



    }
}
/*
1. Write a program that can divide two positive numbers without using / (division)
and * (multiplication) operators.
 */
