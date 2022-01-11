package day_25CustomMethods_Overloading.MethodOverloadingTaks;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int [] arr1={1,2,3,4,5};
        int [] arr2={6,7,8};


        System.out.println(Arrays.toString(merge(arr1,arr2)));
        System.out.println("--------------");

        double[] arr3={1.5,2.0,3.3};
        double[] arr4={6.8,7.2,8.5};
        System.out.println(Arrays.toString(merge(arr3,arr4)));
        System.out.println("--------------");

        char[] arr5={'A', 'B', 'C', 'D'};
        char[] arr6={'E','F'};
        System.out.println(Arrays.toString(merge(arr5,arr6)));

        System.out.println("-------------------");

        String[] arr7={"Gorkmaz","Nazir","Koray","Natayya","Selma"};
        String[] arr8={"Togrul","Kozbek","Togrul"};
        System.out.println(Arrays.toString(merge(arr7,arr8)));






    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] total = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            total[i++] = each;
        }

        for (int each : arr2) {
            total[i++] = each;
        }

        return total;
    }


    public static double[] merge(double[] arr1, double[] arr2){
        double[] total = new double[arr1.length + arr2.length];

        int i = 0;
        for (double each : arr1) {
            total[i++] = each;
        }

        for (double each : arr2) {
            total[i++] = each;
        }

        return total;
    }


    public static char[] merge(char[] arr1, char[] arr2){
        char[] total = new char[arr1.length + arr2.length];

        int i = 0;
        for (char each : arr1) {
            total[i++] = each;
        }

        for (char each : arr2) {
            total[i++] = each;
        }

        return total;
    }


    public static String[] merge(String[] arr1, String[] arr2){
        String[] total = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {
            total[i++] = each;
        }

        for (String each : arr2) {
            total[i++] = each;
        }

        return total;
    }







}
/*
1. create a method that can merge two integer arrays.
        merger(int[] arr1, int[] arr2)

    2. create a method that can merge two double arrays.
           merge(double[] arr1, double[] arr2)

    3. create a method that can merge two char arrays.
        merge(char[] arr1, char[] arr2)

    4. create a method that can merge two String arrays.
           merge(String[] arr1, String[] arr2)
 */