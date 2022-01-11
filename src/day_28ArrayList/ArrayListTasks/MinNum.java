package day_28ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MinNum {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int minNum=list.get(0);

        for (Integer each : list) {
            if(each<minNum){
                minNum=each;
            }
        }
        System.out.println("minNum = " + minNum);

    }
}
/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */