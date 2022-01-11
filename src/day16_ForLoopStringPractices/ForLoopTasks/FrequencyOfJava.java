package day16_ForLoopStringPractices.ForLoopTasks;

public class FrequencyOfJava {
    public static void main(String[] args) {

        String sentence = "javajava";

        int count = 0;
        for(int i= 0 ; i <= sentence.length()-4; i++){ //i:0 , 1, 2,3, 4

            String word = sentence.substring(i, i+4);
            if(word.equalsIgnoreCase("java")){
                count++;
            }

        }

        System.out.println(count);
    }
}
/*
4. write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

 */