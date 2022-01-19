package day_39Recap.Animal;

public class WildAnimal extends Animal {

    public static boolean isWild=true;
    public static boolean isFriendly=false;
    public static boolean isPlayable=false;



    public WildAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void hunt(){
        System.out.println(getName()+"is a"+isWild+" and hunting");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
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
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */