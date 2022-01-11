package day20_Array;

import java.util.Arrays;

public class ArraysPractices {
    public static void main(String[] args) {
        //store teh elements:10,20,30,70

        int [] elements={10,20,30,40};// size is 4
        System.out.println(Arrays.toString(elements));
        System.out.println("-----------------");

        //create a variable that contain 5 scores

        int[]scores=new int [5];
        scores [1]=85;
        scores[scores.length-1]=95;
        scores[3]=75;
        scores[0]=65;
        scores[2]=55;


        System.out.println(Arrays.toString(scores));

        System.out.println("----------------------");

        String[] months={"January","February","March", "April","May", "June", "July", "August",
        "September", "October","November", "December"};


        for (int i = 0; i< months.length; i++){  // i: represents the index numbers of array from 0
            System.out.println(months[i]);

            System.out.println("---------------------");

            for(int i1= months.length-1;i>0;i-- ){  // represents the idex number of array from last index
                System.out.println(months[i]);
            }

        }




       /*
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);

        */




    }
}
