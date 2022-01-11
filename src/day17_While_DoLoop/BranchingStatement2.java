package day17_While_DoLoop;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (int i = 'A'; i < 'E'; i++) {

            if(i=='C'){
                break;
            }



            System.out.println(i);//A B
        }

        System.out.println("----------------------");
        for (int i = 1; i <11 ; i++) {
            if(i%2!=0){
                continue;

            }
            System.out.println(i);
        }

        System.out.println("-------------");
        for (int i = 1; i <11 ; i++) {
            if(i%2==0){
                continue; // skip the current iteration
            }

            System.out.println(i);
        }




    }
}
