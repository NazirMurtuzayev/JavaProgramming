package day_22MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        //elements indexes   0 1 2   0 1 2 3   0 1 2  3 4
        int [] [] arrd2D= { {1,2,3},{4,5,6,7},{8,9,10,11,12} };
        //index of arrays:     0        1        2

        for (int i = 0; i < arrd2D.length; i++) { //i represents index numbers of single dimensional arrays
           // System.out.println(Arrays.toString(arrd2D[i]));
            for (int j = 0; j < arrd2D[i].length; j++) { // j is index numbers of elements

                System.out.print(arrd2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");




    }
}
