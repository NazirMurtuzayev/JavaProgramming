package day_30CustomClass.CustomClassTasks;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;




    public void  setInfo(String serverName, int serverEmployeeID, double serverHourlyRate, boolean isFullTime){

        name = serverName;
        employeeID = serverEmployeeID;
        hourlyRate = serverHourlyRate;
        fullTime = isFullTime;

    }

    public void takeOrder(){
        System.out.println("server's"+name+"is taking an order");
    }
    public void cleanTable(){
        System.out.println("server's"+name+"is cleaning the table");
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
/*
Restaurant Task:
		6.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

	        Actions: (all void methods)

	            setInfo(): sets all of the instance variables with some values taken from the parameters.
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

		6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
 */