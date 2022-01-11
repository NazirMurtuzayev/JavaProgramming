package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12 + 1");  // 121 concatenation

        System.out.println(10 + 20); // 30, Addition
        System.out.println(100 - 50); // Subtraction
        System.out.println(10 * 6);  // Multiplication

        System.out.println( 100 / 3 ); //33 int
        System.out.println((double) 10/4); // 2.5 decimal
        System.out.println(10/4.0);
        System.out.println( 10/4d ); //2.5

        int a = 100;
        double b = a/6d; // 16 because int by default 16.0

        double c = (double)a/6;

        System.out.println(b);
        System.out.println(c);

        System.out.println(100d);








    }

    /*
 +: Addition
 -: Subtract
 *: Multiplication
 /: Division
       10/4 = 2.5 in math
       10/4 = 2 in java because they are integer numbers
 %: Remainder

 */


}
