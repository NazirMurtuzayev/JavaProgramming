package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 5; // 1~12

        boolean has28days = number==2; //  for the months that has 28 days
        boolean has30days= number==4 || number==6 || number==9 || number==11; // for the months that has 30 days
        boolean has31days = !has28days || !has30days; // if the month does not have 28 and 30 days

        if(has28days){
            System.out.println("28Days");
        }

        if(has30days){
            System.out.println(" has 30 days");
        }
        if (has31days){
            System.out.println("has 31 days");
        }



    }
}
/*
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */