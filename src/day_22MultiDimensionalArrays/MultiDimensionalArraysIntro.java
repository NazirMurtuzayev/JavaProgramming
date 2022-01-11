package day_22MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {
        String [] group1={"John", "Joes", "James"};
        String[] group2= {"John", "Joes", "James"};
        String [] group3={"John", "Joes", "James"};


        String [][] groups=new String [3] []; // index: 0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.toString(groups));  // toString()
                              //method is only for one dimensional array

        System.out.println(Arrays.deepToString(groups)); // for multidimensioanal arrays

        System.out.println("--------------------------------------");

        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,12}
         */
        //elements indexes   0 1 2   0 1 2 3   0 1 2  3 4
        int [] [] arrd2D= { {1,2,3},{4,5,6,7},{8,9,10,11,12} };
        //index of arrays:     0        1        2

        System.out.println(Arrays.deepToString(arrd2D));
        //{4,5,6,7}

        System.out.println(Arrays.toString(arrd2D[1]));

        //11
        System.out.println(arrd2D[2][3]);




    }
}
/*
String [] group 1={"John", "Joes", "James"};
String[] group2= {"John", "Joes", "James"};
String [] group3={"John", "Joes", "James"};

 */
