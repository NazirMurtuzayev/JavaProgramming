package day_30CustomClass.CustomClassTasks;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

   public double stateTax(){
        return salary() * stateTaxRate;
   }

   public double federalTax(){
        return  salary() *federalTaxRate;
   }



    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate = " + stateTaxRate +
                ", federalTaxRate =" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salaryAfterTax = $"+ (salary()-(stateTax()+federalTax())) +
                '}';
    }
}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */