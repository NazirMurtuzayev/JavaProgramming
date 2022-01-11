package day_33Statics.StaticInstanceTasks;

public class Address {

    public String street;
    public String city;
    public String state;
    public int zipcode;

    public static String country="USA";
    public static String planet="Earth";


    public Address(String street, String city, String state, int zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }



    public void setInfo(String streetOf, String cityOf, String stateOf, int zipcodeOf){

       street = streetOf;
       city = cityOf;
       state = stateOf;
       zipcode = zipcodeOf;

    }



    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                "\n, city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }




}
/*
5. Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */
