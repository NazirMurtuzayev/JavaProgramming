package day11_Switch_Scanner.tasks;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter his/her score: ");

        int score = scan.nextInt();


        if (score >= 0 && score <= 100) {
            if (score > 90) {
                System.out.println('A');
            } else if (score > 80) {
                System.out.println('B');
            } else if (score > 70) {
                System.out.println('C');
            } else if (score > 60) {
                System.out.println('D');
            } else {
                System.out.println("F");
            }
        }else{
            System.out.println("Invalid score");
    }

    }
}
/*
2. GradeReport:
            2.1 Ask the user to enter  his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

   90~100: excellent
   80~89: Great
   70~79: Good
   60~69: Passed
   0~59:Failed
    */
