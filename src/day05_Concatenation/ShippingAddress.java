package day05_Concatenation;


public class ShippingAddress {

    /*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */


    public static void main(String[] args) {


        String name = " James King",
                buildingNumber = " 11821B",
                streetName = " Jones Branch Dr",
                city = " McLean",
                state = " VA",
                zipCode = " 22031A";

        // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " ,  " + state + " " + zipCode);


        String address = name + "\n"+buildingNumber + " " + streetName + "\n"+city + " " + state + " "+zipCode;
        System.out.println(address);





    }
}


