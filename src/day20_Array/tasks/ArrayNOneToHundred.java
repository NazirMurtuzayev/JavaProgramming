package day20_Array.tasks;



public class ArrayNOneToHundred {
    public static void main(String[] args) {

     int [] numbers=new int[90];



        for (int j = 0; j < numbers.length; j++) {

            for (int i = 1; i <= 100; i++) {

                numbers[j] += i;


                System.out.print(i + " ");
            }

        }
    }
}
/*
1. create an array that has the numbers 1 to 100

 */