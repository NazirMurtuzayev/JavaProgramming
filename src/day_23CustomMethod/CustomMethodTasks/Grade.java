package day_23CustomMethod.CustomMethodTasks;

public class Grade {

    public static void main(String[] args) {
        gradeOfStudent(59);
    }

    public static void gradeOfStudent(int score){

        if(score>=60 && score<=100){
            if(score==90){
                System.out.println('A');
            }else if(score==80){
                System.out.println('B');
            }else if(score==70){
                System.out.println("C");
            }else{
                System.out.println("D");
            }

        }else{
            System.out.println("Failed");
        }

    }

}
/*
5. create a method that can calculate
the grade of the student based on the score
 */