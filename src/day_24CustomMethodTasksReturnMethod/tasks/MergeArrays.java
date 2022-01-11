package day_24CustomMethodTasksReturnMethod.tasks;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur",};
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String s1 []= mergeArrays(group1,group2);
        System.out.println(Arrays.toString(s1));




    }

    public static String[] mergeArrays(String[] group1,String[] group2){

        String [] employees=new String[group1.length + group2.length];
        int i=0;


        for (String each : group1) {
            employees[i++]=each;
        }
        for (String each: group2){
            employees[i++]=each;
        }


        return employees;


    }
}
/*
5. create a method that can merge two arrays and return
 the new array
 */