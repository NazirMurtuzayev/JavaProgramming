package day20_Array.tasks;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class TenTimes {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);



        int[] nums = new int[10];
        int maxNumber=0;
        int minNumber=0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number ten times");
            nums[i] += input.nextInt();

            if(nums[i]>maxNumber){
                maxNumber = nums[i];
            }
            if(nums[i]<minNumber){
                minNumber=nums[i];
            }
            System.out.println(maxNumber);
            System.out.println(minNumber);
        }










}
}
/*
3. Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number
 */