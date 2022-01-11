package day_35Encapsulation.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy candy1=new Candy("Skittles",1,1.99,false);
        Candy candy2=new Candy("Baby Ruth",2,1.99,true);
        Candy candy3=new Candy("Starburst",3,1.99,false);
        Candy candy4=new Candy("Lifesaver",4,1.99,false);
        Candy candy5=new Candy("SweetTarts",6,1.99,false);


        ArrayList<Candy>candies=new ArrayList<>();

        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));


        for (Candy candy : candies) {
            System.out.println(candy.getBrand()+" : "+candy.getPrice());
        }



    }
}
/*
1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and
                 price of each candy
 */
