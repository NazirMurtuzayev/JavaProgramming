package day05_Concatenation;

public class CarInfo {

    /*
    1. Create a class called CarInfo.java
2. Declare the following variables:
1.year
2.make
3.model
4.miles
5.color
6.price
3. Use concatenation to print the full info of the car in
the following format:
Year  Make  Model,  Miles,  Color,  Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
     */

    public static void main(String[] args) {

        String name= "2019",
                make= "Hundai",
                model= "Sonata",
                miles = "20000",
                color = "Black",
                price= "16000";


        System.out.println(name + " " + make + " " + model + " , " + miles + " , "+ color + " , " + "$" + price );




    }
}
