package day_21ForEachLoop.ArrayUtiliyTasks;

import java.util.Arrays;

public class ArrayOfInteger {
    public static void main(String[] args) {

        int[] integer = {4, 5, 2, 3, 7, 8, 9};
        int[] reversed=new int[integer.length];

        Arrays.sort(integer);

        for (int i = reversed.length - 1,j=0;  i >= 0; i--,j++) {

            reversed[j]=integer[i];
        }




        System.out.println(Arrays.toString(reversed));










    }
}
/*
1. Write a program that sort the array of integer in descending order
 */