package day17_While_DoLoop.whileLoopsTask;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers");
        int num= scan.nextInt();
        int sum=0;


        while(num<0){
            sum+=num;
            num= scan.nextInt();
        }
        System.out.println("sum = " + sum);


        //5,4,6,8,3,-1


    }
}
/*
	2. Write a program that calculates the sum of numbers entered by the user until
	 user enters a negative number.

            hint: you need an infinite loop

 */
