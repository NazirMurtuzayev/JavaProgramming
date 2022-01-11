package day_25CustomMethods_Overloading.MethodOverloadingTaks;

public class MinNum {

    public static void main(String[] args) {

        int [] min={5,2,3,4,1,6,7};
        System.out.println(minNum(min));

    }


    public static int minNum(int []array){

        int min =array[0];

        for (int each : array) {
            if(each<min){
                min=each;
            }

        }
        return min;
    }
    public static double minNum(double []array){

        double min =array[0];

        for (double each : array) {
            if(each<min){
                min=each;
            }

        }
        return min;
    }
    public static long minNum(long []array){

        long min =array[0];

        for (long each : array) {
            if(each<min){
                min=each;
            }

        }
        return min;
    }
    public static short minNum(short []array){

        short min =array[0];

        for (short each : array) {
            if(each<min){
                min=each;
            }

        }
        return min;
    }
    public static float minNum(float []array){

        float min =array[0];

        for (float each : array) {
            if(each<min){
                min=each;
            }

        }
        return min;
    }
    public static byte minNum(byte []array){

        byte min =array[0];

        for (byte each : array) {
            if(each<min){
                min=each;
            }

        }
        return min;
    }

}
/*
Task 5:
    1. create a method that can return the min number from an integer array

    2. create a method that can return the min number from double array

    3. create a method that can return the min number from long array

    4. create a method that can return the min number from short array

    5. create a method that can return the min number from float array

    6. create a method that can return the min number from byte array
 */
