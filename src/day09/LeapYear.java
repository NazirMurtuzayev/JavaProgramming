package day09;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;

        boolean leapYear= 2000%4==0;

        if(leapYear){
            System.out.println("Year" +year+" is leap year");
        }
        if(!leapYear){
            System.out.println("Year" +year+" is Not leap year");
        }


        System.out.println("---------------------");

        if(leapYear) {
            System.out.println("Year" + year + " is leap year");
        }else{System.out.println("Year" +year+" is Not leap year");

        }



    }

}
