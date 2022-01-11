package day_25CustomMethods_Overloading.MethodOverloadingTaks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {
        int[] n1={1,2,3,4,5,6};

        System.out.println("maxNumber= "+maxNum(n1));



    }


    public static int maxNum(int []array1){
        int max =array1[0];

        for (int each:array1) {

            if(each>max){
               max=each;
            }

            }
        return max;


    }
    public static double maxNum(double []array1){
        double max =array1[0];

        for (double each:array1) {

            if(each>max){
                max=each;
            }

        }
        return max;


    }
    public static long maxNum(long []array1){
        long max =array1[0];

        for (long each:array1) {

            if(each>max){
                max=each;
            }

        }
        return max;


    }
    public static short maxNum(short []array1){
        short max =array1[0];

        for (short each:array1) {

            if(each>max){
                max=each;
            }

        }
        return max;


    }
    public static float maxNum(float []array1){
        float max =array1[0];

        for (float each:array1) {

            if(each>max){
                max=each;
            }

        }
        return max;


    }
    public static byte maxNum(byte []array1){
        byte max =array1[0];

        for (byte each:array1) {

            if(each>max){
                max=each;
            }

        }
        return max;


    }


}
/*
Task 4:
    1. create a method that can return the max number from
    an integer array

    2. create a method that can return the max number from
    double array

    3. create a method that can return the max number from
     long array

    4. create a method that can return the max number from
    short array

    5. create a method that can return the max number from
    float array

    6. create a method that can return the max number from
    byte array

 */
