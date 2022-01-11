package day20_Array;

public class AverageNumOfArrays {
    public static void main(String[] args) {
 
        
        int [] numbers={10,20,30,40,50,60};
        
        
        double sum=0; //10+20+30.....

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
            
        }

        double averageNumber=sum/ numbers.length;
        System.out.println("averageNumber = " + averageNumber);


        System.out.println("------------------");

        int[] studentsGrades={60,74,76,90};

        int sum1=0;

        for (int i1 = 0; i1 < studentsGrades.length; i1++) {
            sum1+=studentsGrades[i1];
        }
        int averageGrade=sum1/studentsGrades.length;
        System.out.println("averageGrade = " + averageGrade);
        
        
        
    }
}
