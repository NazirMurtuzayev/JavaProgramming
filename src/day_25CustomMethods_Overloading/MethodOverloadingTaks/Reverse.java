package day_25CustomMethods_Overloading.MethodOverloadingTaks;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array={1,2,3,4,5};

        reverse(array);


    }



    public static int [] reverse(int [] array){

        int[] reversed=new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {

            reversed[j]=array[i];
        }

        System.out.println(Arrays.toString(reversed));
        return reversed;



    }
    public static double [] reverse(double [] array){

        double[] reversed=new double[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {

            reversed[j]=array[i];
        }

        System.out.println(Arrays.toString(reversed));
        return reversed;



    }
    public static char [] reverse(char [] array) {

        char[] reversed = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = array[i];
        }

        System.out.println(Arrays.toString(reversed));
        return reversed;
    }
    public static String [] reverse(String [] array) {

       String[] reversed = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = array[i];
        }

        System.out.println(Arrays.toString(reversed));
        return reversed;
    }

}
/*
Task 6:
    1.

    2. Create a method that can reverse a double array

    3. Create a method that can reverse a char array

    4. Create a method that can reverse a String array
 */