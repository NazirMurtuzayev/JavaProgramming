package day_24CustomMethodTasksReturnMethod.tasks;

import java.util.Arrays;

public class Reverse2 {

    public static void main(String[] args) {

        int []array = {10, 20, 30, 40};


        reverse(array);



    }

    public static int[] reverse(int [] array){






        int[] reverse = new int[array.length];

            for (int i = array.length - 1,j=0; i >= 0; i--,j++) {

                reverse[j] = array[i];

        }

        System.out.println(Arrays.toString(reverse));
        return reverse;

    }
}
/*
8. Create method named reverse that passes an integer array parameter,
the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */
