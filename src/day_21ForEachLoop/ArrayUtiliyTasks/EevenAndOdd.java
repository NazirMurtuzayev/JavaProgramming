package day_21ForEachLoop.ArrayUtiliyTasks;

public class EevenAndOdd {
    public static void main(String[] args) {

        int [] array ={1,2,3,4,5};

        int countEven=0;
        int countOdd=0;


        for (int each : array) {

            if (each % 2 == 0) {
                    countEven++;
                } else if (each % 2 != 0) {
                    countOdd++;
                }



        }
        System.out.print("counteven: "+countEven+"countOdd: "+countOdd);






    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */
