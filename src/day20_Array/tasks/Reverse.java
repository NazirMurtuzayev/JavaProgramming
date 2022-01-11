package day20_Array.tasks;

public class Reverse {
    public static void main(String[] args) {
        String []classmates= {"Gorkmaz Verdiyev","Koray Ozbek","Natayya Ari","Kamala Guliyeva", "Togrul Huseynov",
                "Christina Kapatina","Edris Shenwari","Ernie Dance","Selma Senocak","Tatiana Karabiza"};


        for (String each : classmates) {

           String reversed="";

           for (int i = each.length()-1; i >= 0; i--) {
               reversed += each.charAt(i);
           }


                System.out.println(reversed);




        }
        System.out.println("-----------------");

        String []classmates1={"Gorkmaz Verdiyev","Koray Ozbek","Natayya Ari","Kamala Guliyeva", "Togrul Huseynov",
                "Christina Kapatina","Edris Shenwari","Ernie Dance","Selma Senocak","Tatiana Karabiza"};

        for (String each : classmates) {
            String reversed="";

            for (int i1=each.length()-1;i1>=0;  i1--) {
                reversed+=each.charAt(i1);
            }

            System.out.println(reversed);
        }




    }


}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
