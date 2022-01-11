package day_23CustomMethod.CustomMethodTasks;

public class DollarToLira {
    public static void main(String[] args) {

        dollarToLira(100);
    }


    public static void dollarToLira(double dollarAmount){

         double lira=dollarAmount * 13.85;

        System.out.println(dollarAmount+"dollar equals to "+lira+"lira");

    }
}
