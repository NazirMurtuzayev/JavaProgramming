package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElementArrayList {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(6,1,2,3,4,5,6,6,6,7));

        ArrayList<Integer>unique=new ArrayList<>();


        for (Integer each : list) {
            int frequency= Collections.frequency(list,each);
            if(frequency==1){
                unique.add(each);
                break;



            }



        }
        System.out.println(unique);



    }
}
