package day_28ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNum {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

         int maxNum=list.get(0);

        for (Integer each : list) {

            if(each>maxNum){
                maxNum=each;
            }

        }
        System.out.println("maxNum = " + maxNum);

    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */
