package officehours.practice_jan19;

public class Fruit {
    Juice juice;

public Fruit (String color){
      juice = new Juice(color);
   }
}

class Juice {
    String color;

    public Juice(String color){
        this.color = color;

    }



    public static void main(String[] args) {
        new Fruit("Blue");
        new Juice("red");


    }
}
