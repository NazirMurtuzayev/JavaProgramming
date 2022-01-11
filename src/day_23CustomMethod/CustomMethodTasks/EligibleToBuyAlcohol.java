package day_23CustomMethod.CustomMethodTasks;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        eligibleToBuyAlcohol(17);
        eligibleToVote(19);

    }

    // 3. create a method that can check if a person is eligible to buy alcohol
    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }


    }

    //4. create a method that can check if a person is eligible to vote
    // Ex: eligibleToVote(19, "USA");
    //output:You are not eligible to vote!

    public static void eligibleToVote(int age){

        if (age >= 19) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }



    }



}





