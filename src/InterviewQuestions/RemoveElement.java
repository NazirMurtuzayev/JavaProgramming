package InterviewQuestions;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int [] arr= {10,20,30,40,50};
        int n =2;

        removeElement(arr,n);

    }



    public static int [] removeElement(int [] arr, int n){

        int [] newArr=new int [arr.length-1];
        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if(i!=n){
                newArr[j++]=arr[i];
            }

        }

        System.out.println(Arrays.toString(newArr));

        return newArr;

    }


}
