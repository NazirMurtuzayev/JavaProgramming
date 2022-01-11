package day17_While_DoLoop.whileLoopsTask;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum= scan.nextInt();

        System.out.println("Enter second number:");
        int secondNum= scan.nextInt();

        System.out.println("Enter math operator:");
        char ch=scan.next().charAt(0);

        while(!(ch=='+' || ch=='-')) {
            System.err.println("Invalid operator, re-enter valid operator");
            ch = scan.next().charAt(0);



        }


        if (ch == '+') {
            System.out.println(firstNum + secondNum);
        } else {
            System.out.println(firstNum - secondNum);

        }




    }

}
/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator
		(+, -, *, /)

 */
