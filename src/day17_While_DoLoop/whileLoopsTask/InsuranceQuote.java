package day17_While_DoLoop.whileLoopsTask;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double price = 0.0;

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.nextLine().toLowerCase();

        while(!(gender.equals("male") || gender.equals("female"))) {
            System.err.println("Invalid");
            System.out.println("Enter your gender:");
            name = input.nextLine().toLowerCase();
        }
        System.out.println("Are your married?");
        String isMarried = input.nextLine();

        while(!(isMarried.equalsIgnoreCase("yes")|| isMarried.equalsIgnoreCase("no") )){
            System.err.println("Invalid");
            System.out.println("Are your married?");
            isMarried = input.next();
        }

        System.out.println("Enter your age");
        int age = input.nextInt();

        while(!(age >= 0 && age <=120)){
            System.err.println("Invalid");
            System.out.println("Enter your age");
            age = input.nextInt();
        }

        System.out.println("How many miles a day?");
        int miles = input.nextInt();

        while(!(miles >= 0 && miles <=50)){
            System.err.println("Invalid");
            System.out.println("Enter miles");
            miles = input.nextInt();
        }

        System.out.println("Full coverage or liability coverage?");
        String coverage = input.nextLine();

        while(!(coverage.equalsIgnoreCase("Full") || coverage.equalsIgnoreCase("liability"))){
            System.err.println("full or liability?");
            coverage = input.nextLine();
        }

        System.out.println("Accidents in the last 5 years?");
        String acc = input.nextLine();

        while (!(acc.equalsIgnoreCase("yes") || acc.equalsIgnoreCase("no"))){
            System.err.println("yes or no?");
            acc = input.nextLine();
        }

        System.out.println("anti-theft device?");
        String device = input.nextLine();

        while(!(device.equalsIgnoreCase("yes") || device.equalsIgnoreCase("no"))){
            System.err.println("yes or no?");
            device = input.nextLine();
        }

        if(coverage.equalsIgnoreCase("liability")) {
            if (age < 25) {
                price = 90;
            } else {
                price = 50;
            }

            if (miles <= 10) {
                price += 10;
            } else if (miles > 10 && miles <= 50) {
                price += 30;
            } else {
                price += 50;
            }
        }else if(coverage.equalsIgnoreCase("full")){
            if (age < 25) {
                price = 160;
            } else {
                price = 120;
            }

            if (miles <= 10) {
                price += 20;
            } else if (miles > 10 && miles <= 50) {
                price += 40;
            } else {
                price += 70;
            }

        }

        if(device.equalsIgnoreCase("yes")){
            // double a  = price * 5 / 100;
            double discount1 = price * 5 / 100;
            price -= discount1;
        }
        if(acc.equalsIgnoreCase("yes")){
            double extraCharge = price * 15 / 100;
            price += extraCharge;
        }else if(acc.equalsIgnoreCase("no")){
            double discount2 = price * 10 /100;
            price -= discount2;
        }
        if(isMarried.equalsIgnoreCase("yes")){
            double discount3 = price * 5 / 100;
            price -= discount3;
        }

        System.out.println("price = " + price);







    }
}

/*
6. Create a class called InsuranceQuote, write a program that can calculate the
insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter
    			until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until
					user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until
					user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until
					user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until
					user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until
					user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70







 */
/*
    If the car has anti-theft device ==> 5% discount
        If he/she had any accidents or claims in past 5 years ===> 15%
        extra charge
        If he/she never had any accidents or claims in past 5 years ==> 10%
        discount
        If he/she is married ==> 5% discount

 */
