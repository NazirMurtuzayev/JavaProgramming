package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int n = 5; // 1~7

        System.out.println("=========================");

        String day;

        if(n==1){
            day="Monday";
            // System.out.println("Monday");
        }else if(n==2){
            day= "Tuesday";
            //System.out.println("Tuesday");
        }else if(n==3){
            day="Wednesday";
            //System.out.println("Wednesday");
        }else if(n==4){
            day= "Thursday";
            //System.out.println("Thursday");
        }else if(n==5){
            day= "Friday";
            //System.out.println("Friday");
        }else if(n==6){
            day="Saturday";
            //System.out.println("Saturday");
        }else{
            day= "Sunday";
            //System.out.println("Sunday");
        }

        System.out.println("day = "+day);

        System.out.println("----------------");

        String result = (n==1)? "Monday" :(n==2)? "Tuesday" : (n==3)? "Wednesday" : (n==4)? "Thursday" : (n==5)?
                "Friday": (n==6)? "Saturday" : "Sunday";

                  System.out.println(result);





    }
}
