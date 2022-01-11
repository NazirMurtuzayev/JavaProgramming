package day13_String.StringTasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

      Scanner input=new Scanner(System.in);
        System.out.println("Split or no split:");
        String splitOrNo=input.nextLine();

        System.out.println("Number of people entered:");
        int numberOfPeople= input.nextInt();

        System.out.println("Check amount: ");
        int checkAmount= input.nextInt();

        input.nextLine();

        System.out.println("How was the service quality: ");
        String serviceQuality=input.nextLine();

        double totalTip=1;
        // Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
        if(serviceQuality.equals("Excellent")){
            totalTip=checkAmount*0.25;
        }else if(serviceQuality.equals("Great")) {
            totalTip = checkAmount * 0.2;
        }else if(serviceQuality.equals("Good")){
            totalTip=checkAmount*0.15;
        }else if(serviceQuality.equals("Fair")){
            totalTip=checkAmount*0.1;
        }else if(serviceQuality.equals("Poor")){
            totalTip=checkAmount*0.5;
        }

        double tipPerPerson=totalTip/numberOfPeople;
        double totalPayment=checkAmount+totalTip;
        double totalPerPerson= totalPayment/numberOfPeople;



            if(splitOrNo.equalsIgnoreCase("yes")){

            System.out.println("Number of people entered: "+numberOfPeople);
            System.out.println("Total to pay: "+totalPayment);
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: "+totalPerPerson);
            System.out.println("Tip per person:"+tipPerPerson);

        }else{
                System.out.println("Total to pay: "+totalPayment);
                System.out.println("Total tip: "+totalTip);

        }






    }
}
/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party
and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number)
	(each person = & in output) Check amount: (number) Service Quality:
	(String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method

 */
