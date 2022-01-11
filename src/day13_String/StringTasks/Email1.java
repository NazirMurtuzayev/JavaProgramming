package day13_String.StringTasks;

public class Email1 {
    public static void main(String[] args) {

        String emailAddress="Nazir_Murtuzayev@gmail.com";
        String firstName=emailAddress.substring(0, emailAddress.indexOf("_"));
        String lastName=emailAddress.substring(emailAddress.indexOf("_")+1, emailAddress.indexOf("@"));
        String rest=emailAddress.substring(emailAddress.indexOf("@"));
           emailAddress=lastName+"_"+firstName+rest;
        System.out.println(emailAddress);
    }
}
/*
7. Create a class called EmailTask1.
       Assume that email address is constructed by person's first name and
       followed by an underscore and last name.
        Write a program that can swap first name with last name in the email
        (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.
            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */