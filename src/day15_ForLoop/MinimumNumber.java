package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int min= 2147483647;// any number is smaller than this

        for (int i = 10; i <15 ; i++) {
            System.out.println("Enter minimum number");
            int num=scan.nextInt();
            if(num<min) {
                min=num;
            }
        }
        System.out.println("min= "+min);

    }
}
/*
Write a porgram that asks the user to enter a number for 5 times.
return the minimum number
 */
