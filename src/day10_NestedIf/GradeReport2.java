package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 65;
        String result = "";

        if(score>=0 && score<=100) {
            // 5 possibilities: A,B,C,D,F
            if(score>=90){
                result = "Excellent";
            }else if(score>=80){
                result="Great";
            }else if(score>=70){
                result="Good";
            }else if(score>=60) {
                result="Passed";
            }else{
                result ="Failed";
            }
        }else { //if the score is not valid
            //1
            System.out.println("Invalid score");

        }
        System.out.println(result);






    }
}
