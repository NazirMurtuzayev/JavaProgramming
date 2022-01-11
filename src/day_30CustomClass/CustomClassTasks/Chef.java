package day_30CustomClass.CustomClassTasks;

public class Chef {
    public static void main(String[] args) {

       Server server=new Server();
       server.setInfo("Amir",56,15.8, server.fullTime);

        System.out.println(server);

    }
}
/*
6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
 */