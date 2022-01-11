package day17_While_DoLoop.whileLoopsTask;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int kingBed = 120;
        int queenBed= 100;
        int singleBed=80;



        System.out.println("Enter a reserve a room:");
        String answer= scan.next();




        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid entry, re-enter again");
            answer= scan.next();


        }
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("which type of room you want to reserve?");
        }else{
            System.out.println("Have a nice day");

        }

        String roomType=scan.next();




        while((roomType.equalsIgnoreCase("King Bed") )) {
            System.err.println("Invalid Room type ,re-enter again");
            roomType = scan.next();
        }

            if((roomType.equalsIgnoreCase("King Bed"))){
                System.out.println(kingBed);












        }






    }
}
/*
5. Create a class called RoomReservation, write a program for the room reservation,
 your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user
    	entered no,
    	print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter
    			until user provides
    			 a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of
            the room.

            (if the user selected an invalid room, ask the user to reselect the room until
            user provides a
            valid entry)


 */
