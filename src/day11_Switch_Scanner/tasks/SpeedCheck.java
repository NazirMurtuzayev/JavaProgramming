package day11_Switch_Scanner.tasks;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the current speed:");
        int speedLimit = 55;
        int currentSpeed= scan.nextInt();

        if(currentSpeed>speedLimit){
            int result= currentSpeed - speedLimit;
            System.out.println("You're driving "+result+
                    " mph over the limit.Slow down");
        }


         scan.close();

    }
}
/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!


 */
