package day09;

public class MedianNumber {

    public static void main(String[] args) {

        int a=10,
        b = 20,
        c = 30;
                   //       a=15 b=10 c=20     a=15 c=10 b=20
        boolean aisMedian = (a>b  && a<c) || (a>c && a<b);
        /*
        in order for a to be the median number :
        1. if c is the maximum number & b is the minimum number

         */


                       //   b=15 a=20 c=10     b=15, a=10, c=20
        boolean bisMedian= (b > c && b<a) ||   (b>a && b<c);

        /*
        in order of b to be the median number:

         */

        boolean cisMedian = !aisMedian  && !bisMedian;

        if (aisMedian){ //if a is median number
            System.out.println(a+ " is Median number");
        }
        if (bisMedian){ //if b is median number
            System.out.println(b+" is Median number");
        }
        if (cisMedian){ //if c is median number
            System.out.println(c+" is Median number");
        }








    }



}

/*
2. Create a class called MedianNumber. write a program that
can find the median number between three DIFFERENT given integers
  Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */