package day_27WrapperClass.wrapperTasks;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int[] newArray = insert(arr, 2, 100);

        System.out.println(Arrays.toString(newArray));

    }


    public static int[] insert(int[] array, int index, int element) {
        int[] result = new int[array.length + 1]; // new array with new  element +1
        int i = 0;
        for (int each : array) { // each array
            result[i] = each; //
            if (i == index) {
                result[i] = element;
                result[++i] = each;
            }
            i++;

        }
        return result;
    }

    public static double[] insert(double[] array, double index, double element) {
        double[] result = new double[array.length + 1]; // new array with new  element +1
        int i = 0;
        for (double each : array) { // each array
            result[i] = each; //
            if (i == index) {
                result[i] = element;
                result[++i] = each;
            }
            i++;

        }
        return result;
    }

    public  static char [] insert (char [] array,char index,char element ) {
        char[] result = new char[array.length + 1]; // new array with new  element +1
        char i = 0;
        for (char each : array) { // each array
            result[i] = each; //
            if (i == index) {
                result[i] = element;
                result[++i] = each;
            }
            i++;

        }
        return result;
    }
    public  static String [] insert (String [] array,int index,String element ) {
        String[] result = new String[array.length + 1]; // new array with new  element +1
        int i = 0;
        for (String each : array) { // each array
            result[i] = each; //
            if (i==index) {
                result[i] = element;
                result[++i] = each;
            }
            i++;

        }
        return result;
    }


}


/*
1. Insert Task:
		1.1 Create a method named insert that passes three
		parameters: integer array, integer index, integer element.
		 the method inserts the given element to the given index
		 of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40,
					 50}


		1.2 Create the same function for double array,
		 char array and string array
 */