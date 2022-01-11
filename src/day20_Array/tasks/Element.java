package day20_Array.tasks;

public class Element {
    public static void main(String[] args) {

        int[] array1={1,2,3,4,5};
        int[] array2={4,5,6,7,8};




        for (int i = 0; i <array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {


                if (array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }


            }


        }

    }
}
/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */