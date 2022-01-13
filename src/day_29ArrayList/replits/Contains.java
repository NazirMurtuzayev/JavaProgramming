package day_29ArrayList.replits;

import java.util.ArrayList;
import java.util.Scanner;

public class Contains {
    public static String search(ArrayList<String> r, String find) {
        // complete the method




        for(String each : r){
            each+=r.size();


            if(r.contains(find)){
                return each;

            }
            if(!r.contains(find)){
                return "search failed";
            }


        }

        return find;





    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }
}
