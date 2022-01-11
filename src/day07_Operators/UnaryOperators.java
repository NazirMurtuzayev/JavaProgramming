package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1=25;
        int num2= -25;

        System.out.println(num1<0); // false
        System.out.println(num2<0);// true

        System.out.println("------------------------");

        int a=5;
        ++a; //pre increment : increases value by one immediately


        System.out.println(a);// it is pre decrement: it decreases value by one immediately
        System.out.println(a);

        System.out.println("-------------------------");

        int b= 100;

        System.out.println(++b); //pre increment

        int c=100;

        System.out.println(c++); // post increment
        System.out.println(c); // 101


        System.out.println("-----------------------");

        int x =200;
        System.out.println(--x); // pre decrement : decrease the value by 1 right away
        System.out.println(x);


        System.out.println("----------------");
        int y=200;
        System.out.println(y--); // post decrement; first passes the current value, then decrease the value 1
        System.out.println(y);


        System.out.println("------------------------------");

        int z=45;
        System.out.println( ++z);// increase the value immediately
        System.out.println(z++); // 46,
        System.out.println(z);//47

        int q=30;

        System.out.println(--q); // pre decrement 29
        System.out.println(q--); // post decrement 29
        System.out.println(q); // 28






    }
}
