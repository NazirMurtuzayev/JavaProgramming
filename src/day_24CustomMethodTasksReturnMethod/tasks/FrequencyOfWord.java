package day_24CustomMethodTasksReturnMethod.tasks;

public class FrequencyOfWord {
    public static void main(String[] args) {


        int frequency=frequencyOfWord("Java java java python python", "Java");

        System.out.println(frequency);




    }



    public static int frequencyOfWord(String sentence,String word) {

        int frequency=0;

        for (int i = 0; i <sentence.length()-3 ; i++) {

            String s=sentence.substring(i,i+4);

            if(word.equalsIgnoreCase(s)){
                frequency++;
            }


        }

        return frequency;
    }




}
/*
1.  create a method named frequencyOfWord that passes two
parameters: string sentence and String word, then returns the
frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */