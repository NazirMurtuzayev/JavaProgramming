package day_24CustomMethodTasksReturnMethod.tasks;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
       int [] array1 = {1,2,3};
        int [] array2 = {4,5,6};


        merge(array1, array2);


    }


    public static int merge (int[] array1,int [] array2){

        int i=0;
        int total[]= new int [array1.length+array2.length];

        for (int each : array1) {
            total[i++]=each;
        }
        for (int each: array2){
            total[i++]=each;
        }

        System.out.println(Arrays.toString(total));
        return i;

    }
}
/*
7. Create a method named merge that passes two integer array parameters,
 the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

 */
