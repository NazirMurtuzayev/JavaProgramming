package day09;

public class EligibleToVote {
    public static void main(String[] args) {

        int age= 20;

        boolean isEligible = age>=18;
        boolean isNotEligible = age<18;

        if (age>=18){
            System.out.println("Person is eligible to vote");
        } else if (age<=18){
            System.out.println("Person is not eligible to vote");
        }

    }

}
  /*
  4. Write a program that can check if the person is eligible to vote
   */