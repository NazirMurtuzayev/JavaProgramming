package day_21ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

       String [] words={"Java Programming", "Cydeo School", "Wooden Sppon","Early Birds", "Angry Birds"};

       for(String each : words) {

           System.out.println(each.charAt(0)+"" +each.charAt(each.length()-1));
       }

        System.out.println("---------------------");

       String words1[]={"Nazir", "Vivab", "Vazir", "Nilab"};

        for (String each : words1) {
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));

        }







       }
}
