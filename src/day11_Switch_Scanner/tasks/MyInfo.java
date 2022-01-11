package day11_Switch_Scanner.tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= scan.nextInt();


        System.out.println("Enter your gender");
        String gender=scan.next();

        scan.nextLine();

        System.out.println("Enter a full name");
        String fullName= scan.nextLine();

        System.out.println("Enter your phone number");
        long phone= scan.nextLong();

        System.out.println("Enter your zip code");
        int zipCode= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter the school name");
        String schoolName= scan.nextLine();

        System.out.println("Enter your city name");
        String cityName= scan.nextLine();

        System.out.println(" Enter your state name");
        String stateName= scan.next();

        System.out.println("Enter your building number");
        int buildingNumber= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();

        scan.close();

        System.out.println("Full name: "+fullName);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Phone number: "+phone);
        System.out.println("Address \n\t"+buildingNumber+ " "+streetName+"\n\t"+cityName
        +", "+stateName+" "+zipCode);
        System.out.println("School name: "+schoolName);




    }
}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age int (nextINT() )
            2. Enter your gender (String- One word ONLY)  nextINT() (nextline())
            3. Enter your full name (String- Multiple words)(nextline())
            4. Enter your phone number (long) (nextLong() )
            5. Enter your zip code (int) nextINT()  (nextline())
            6. Enter your School name (String- Can be Multiple words)(nextline())
            7. Enter your city name(nextline())
            8. Enter your state name (String- One word ONLY)nextINT()
            9. Enter your building number (int)nextINT() (nextline())
            10. Enter your Street name  (nextline())

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name
 */
