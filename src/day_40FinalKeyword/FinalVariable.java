package day_40FinalKeyword;

public class FinalVariable {

   final String birthDay;
   final static String name;

   static {
       name="Batch 25";
   }

   public FinalVariable(String birthDay){
       this.birthDay=birthDay;
   }




    public static void main(String[] args) {

        final double pi=3.14;

        // pi =4.14; final variables can not be reassigned
        // pi=5.4

        final String name;

        name="Java";

        //name="Wooden Spoon"

        System.out.println(name);
        System.out.println("----------------");

        FinalVariable obj=new FinalVariable("May/01");

        //obj.birthday="June0/1;// final
        System.out.println(obj.birthDay);

        System.out.println("-------------");
       // FinalVariable.name="Python";

        System.out.println(FinalVariable.name);

    }
}
