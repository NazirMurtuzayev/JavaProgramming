package day_24CustomMethodTasksReturnMethod.tasks;

public class FrequencyOfArray {

  public static void main(String[] args) {

      int[] array ={1,1,1,1,1,2,2};

     int num= frequencyOfNum(array,1);
      System.out.println(num);

    }

    public static int frequencyOfNum (int[] array, int number){

        int frequency=0;

        for (int each:array) {

            if(each==number){
                frequency++;
            }

        }
        return frequency;
    }



}
/*
 5. create method that accepts one integer array and one
 integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */