package day_31Constructor;

public class Offer {

    public String location;
    public String companyName;
    public String jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH, isFullTime;


    public void setInfo(String location, String companyName,String jobTitle, double salary,
                        boolean hasBenefit, boolean hasPTO,
                        boolean isWFH, boolean isFullTime) {
        this.location = location; // "this" keyword by default it is going to call local variable, so we use it to call instance variable
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    } ////to set attributes, which are info of objectsString jobTitle, double salary,

    public String toString() { // it executes every time ,it prevents objects prints hashcode
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
1. Create a custom class named Offer
     Attributes:
     location, companyName, jobTitle, salary, hasBenefit, hasPTO,
      isWFH, isFullTime

     Actions:
         setInfo(): sets all the instance variables
        toString(): returns the full info of the Offer Object
 */