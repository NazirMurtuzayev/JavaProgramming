package day11_Switch_Scanner.tasks;


import java.util.Scanner;

public class PeopleLive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many people they live with:");
        int numOfPeople = scan.nextInt();

        String result = "";


        if (numOfPeople < 3) {
            result = " Live with less than 3 people";
        } else if (numOfPeople >= 3 && numOfPeople <= 6) {
            result = "Live with 3 - 6 people";
        } else {
            result = " Live with more than 6 people";
        }
        System.out.println(result);
        scan.close();


    }

}
/*
        1. Ask the user how many people they live with:
        if user lives with Less than 3 people: print "Live with less than 3 people"
        if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
        if the user lives with more than 6 people: print "Live with "more than 6 people"

 */


