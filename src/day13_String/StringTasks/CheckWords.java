package day13_String.StringTasks;

public class CheckWords {
    public static void main(String[] args) {

        String w1= "sabira";
        String w2= "nazir";
        String w3= "nazir";

        int l1=w1.length();
        int l2=w2.length();
        int l3=w3.length();



        if(l1==l2 &&  l2==l3){
            System.out.println("All words are same length");
        }else if(l1!=l2 && l1!=l3 && l2!=l3){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }




    }
}
/*
5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
      - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */