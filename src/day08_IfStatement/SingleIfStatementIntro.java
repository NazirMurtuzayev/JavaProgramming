package day08_IfStatement;

public class SingleIfStatementIntro {


    public static void main(String[] args) {

        int number = 100;

        System.out.println("Odd Number");

        System.out.println("Even number");

        boolean evenNumber= number%2==0;
        boolean oddNumber = !evenNumber;

        if (evenNumber){
            System.out.println(number+" is even number ");
        }
        if(oddNumber){ // not even number
            System.out.println(number+" is odd number");

        }

        System.out.println("------------------------");

        int n=200;
        // positive

        if(n>0){
            System.out.println(n+ " is positive"); //// if the n is greater than 0, then it is positive
        }
        //negative

        if (n<0){
            System.out.println(n+" is negative"); // iff n is less than 0 then it is negative

        }
        // zero
        if (n == 0) {
            System.out.println(n + " is zero");
        }




    }
}
