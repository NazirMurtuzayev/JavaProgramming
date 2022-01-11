package day_35Encapsulation.Tasks;

public class Pizza<numberOfCheeseTopping> {

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") && (size.equalsIgnoreCase("medium") && (size.equalsIgnoreCase("large")))) {
            return;
        }

        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            return;
        }


        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3) {
            numberOfCheeseTopping = 3;
        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4) {
            numberOfCheeseTopping = 4;
        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5) {
            numberOfCheeseTopping = 5;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }








    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0) {
            return;
        }

        if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 4) {
            numberOfPepperoniTopping = 4;
        } else if (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 5) {
            numberOfPepperoniTopping = 5;
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }
}
/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of
							cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of
							pepperoni topping is:

										small: 4
										medium: 5
 */