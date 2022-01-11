package day_23CustomMethod.CustomMethodTasks;

public class DollarToEuro {

    public static void main(String[] args) {
        dollarToEuro(100);
    }


        public static void dollarToEuro(double dollarAmount){
            double euro = dollarAmount * 0.89;
            System.out.println(dollarAmount+" dollar equal to "+euro+" euro");
        }



}

/*
9. create a method that can convert dollar to euro
 */
