package day05_Concatenation;

public class MyShippingAddress {

    public static void main(String[] args) {

        String name = " Nazir Murtuzayev ",
                buildingNumber = " 172 ",
                streetName = " Bay 31 st ",
                city = " Brooklyn ",
                state = " NY ",
                zipCode = " 11214 " ;




        String address = name + "\n"+buildingNumber + " " + streetName + "\n"+city + ",  " + state + " "+zipCode;
        System.out.println(address);


    }

}
