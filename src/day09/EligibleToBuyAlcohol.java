package day09;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        int age= 20;

        boolean isEligible = age>=21;
        boolean isNotEligible = age<21;

        if (age>=21){
            System.out.println("Person is eligible to buy alcohol");
        } else{
            System.out.println("Person is not eligible to buy alcohol");
        }

    }
}
/*
3. Write a program that can check if the person is eligible to buy alcohol
 */



