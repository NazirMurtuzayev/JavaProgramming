package day20_Array.tasks;

import java.time.chrono.MinguoDate;

public class Classmates {
    public static void main(String[] args) {

        String []classmates={"Gorkmaz Verdiyev","Koray Ozbek","Natayya Ari","Kamala Guliyeva", "Togrul Huseynov",
                "Christina Kapatina","Edris Shenwari","Ernie Dance","Selma Senocak","Tatiana Karabiza"};

        for (String each : classmates) {

            System.out.println(each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1));

        }

    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
