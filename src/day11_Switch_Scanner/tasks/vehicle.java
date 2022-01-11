package day11_Switch_Scanner.tasks;

import java.util.*;
public class vehicle {

    public static void main(String[] args) {


            //WRITE YOUR CODE HERE:

            Scanner scan=new Scanner(System.in);

            System.out.println("Enter vehicle's year:");

            int year=scan.nextInt();

            if(year>=1995 && year<=2017){
                System.out.println("Your vehicle needs to be recalled!");
            }else{
                System.out.println("Your vehicle is fine, enjoy!");
            }


            scan.close();








    }
}
