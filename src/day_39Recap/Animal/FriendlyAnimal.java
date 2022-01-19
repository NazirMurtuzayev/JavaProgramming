package day_39Recap.Animal;

public class FriendlyAnimal extends Animal {

  public static boolean isWild=false;
  public static boolean isFriendly=true;
  public static boolean isPlayable=true;



    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void play(){
        System.out.println(getName()+"a"+isFriendly+" and playing ");
    }
    public void pet(){
        System.out.println(getName() + isFriendly+" and a pet ");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed()+ '\'' +
                ", size='" + getSize()+ '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*
2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */