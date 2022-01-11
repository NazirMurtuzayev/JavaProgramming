package day16_ForLoopStringPractices.ForLoopTasks;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive 5 numbers: ");


        int pos=0;
        int neg=0;

        for (int i = 0;i <5 ; i++) {

            int num= scan.nextInt();

            if(num>0){
                pos++;
            }else if(num<0){
                neg++;
            }

        }
        System.out.println(pos+" positive and "+neg+" negative");;




    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user
 entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative


 */