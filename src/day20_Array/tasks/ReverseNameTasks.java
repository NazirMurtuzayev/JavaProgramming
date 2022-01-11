package day20_Array.tasks;

public class ReverseNameTasks {
    public static void main(String[] args) {
    String [] names= {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "MaΩnas Kalenov", "Gulsen Sohret"};

        for (String each : names) {  //"Elminur Ablimit"

           String reversed="";

            for (int i=each.length()-1;i>=0;  i--) {
                reversed+=each.charAt(i);
            }


        System.out.println(reversed);
        }

    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines

 */
