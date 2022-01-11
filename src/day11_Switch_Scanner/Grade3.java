package day11_Switch_Scanner;

public class Grade3 {
    public static void main(String[] args) {
        char ch= 'B';
        String result= "";

        switch(ch){
            case 'A':
            result="Excellent";
            break;
            case 'B':
                result="Great";
                break;
            case 'C':
                result="Good";
                break;
            case 'D':
                result="Passed";
                break;
            case'F':
               result="Failed";
            default:
                result="Invalid";
        }

        System.out.println(result);

    }

}
