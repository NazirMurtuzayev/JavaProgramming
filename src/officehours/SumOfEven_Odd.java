package officehours;

public class SumOfEven_Odd {
    public static void main(String[] args) {

        int sumOfEven=0;
        int sumOfOdd=0;
        int i=0;

        do {
            if (i % 2 == 0) {
                sumOfEven += i;// sum of even=2+4+6+..
            } else {
                sumOfOdd += i;//sum of odd=1+3+5+...
            }
            i++;
        }
            while (i <= 10) ;

        System.out.println("Sum of even numbers are "+sumOfEven);
        System.out.println("Sum of odd numbers are "+sumOfOdd);




    }
}
/*
(SumOfEven_Odd)
  Write a program using while loop, that calculates the sum
  of the even numbers between 0 and 10
 */