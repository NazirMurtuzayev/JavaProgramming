package officehours.constuctor;

public class BaklavaObject {

    public static void main(String[] args) {

        BaklavaRecipe br1=new BaklavaRecipe("pistachio");
        br1.price=40.50;
        br1.amountLB=2;
        System.out.println(br1);

        BaklavaRecipe br2=new BaklavaRecipe("walnut",3,50.70);
        System.out.println(br2);

        br1.feedback();
        br1.order();
        BaklavaRecipe.order();


    }

}
