package day13_String.StringTasks;

public class ReplaceX {
    public static void main(String[] args) {

        String str="xcodeX";
        String result= str.replaceAll("x", "a").replaceAll("X","a");

        System.out.println(result);


    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
