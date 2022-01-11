package day_24CustomMethodTasksReturnMethod.tasks;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {
        int []arr ={1,2,3};
         int num=4;

        System.out.println( addElement(arr,4));


    }

    public static String addElement(int[] array, int num){



       int newArray []=new int[array.length+1];

       String result="";

        for (int i = 0; i < array.length; i++) {

            newArray[i]=array[i];

        }
        newArray[newArray.length-1]=num; //showing new element which is "num" on the new array which is "newArray"
        result=Arrays.toString(newArray);
        return result;







   }


}
/*
 6. create a method named addElement that takes one integer array
  and one integer, the method can add the Integer number after the  last index
   of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

 */
