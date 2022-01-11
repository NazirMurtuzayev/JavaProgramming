package day16_ForLoopStringPractices.ForLoopTasks;

public class FrequencyOfWord {
public static void main(String[] args) {

    String str="JavaJavaJavaJava";
    int frequency=0;

    for (int i = 0; i <= str.length()-4; i++){
        String eachSub=str.substring(i,i+4);
        //System.out.println(eachSub);
        if(eachSub.equals("Java")){
          frequency++;
        }
    }
    System.out.println(frequency);




}

}
/*
2. write a program that can return the frequency of the word Java from the sentence
ex:
sentence="JavaJavaJava"
output:3

Str="JavaJava";
substrings:
1.Java//susbtring(0,4)
2.avaJ//susbtring(1,5)
3.vaJa//susbtring(2,6)
4.aJav//susbtring(3,7)
5.Java//susbtring(4,8)
 */

