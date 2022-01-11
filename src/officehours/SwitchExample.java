package officehours;

public class SwitchExample {
    public static void main(String[] args) {

      String animal="CAT";
      String result="";

      switch(animal){
              case "DOG" :
              case "CAT" :
                  result="domestic animal";
                  break;
              case "Tiger" :
              result="wild animal";
              break;

          default:
             result="Unknown animal";




      }
        System.out.println(result);

    }
}
/*
 Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT :
                         DOG is domestic animal
                            * */
