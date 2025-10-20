package module5._2parameters;

/*
 * Exercise: Create a calculatePay method and use it to replace
 * the redundant code within the main method.
 */
public class E02PayrollCalculator {

	//add a new static method calculatePay here
	public static void calculatePay(String employee, double hourlyRate, double hoursWorked){
		double weeklyPay = hourlyRate * hoursWorked;
	    System.out.println(employee  + ":" + weeklyPay);
	}

	public static void main(String[] args) {

	      //Calculate weekly pay for Fred
	      	//employee = "Fred";
	      	//hourlyRate = 12.50;
	      	//hoursWorked = 20;
	      	//weeklyPay = hourlyRate * hoursWorked;
	      	//System.out.println(employee  + ":" + weeklyPay);
		//call calculatePay for employee Fred, hourly rate 12.50, and hours worked 20
		calculatePay("Fred", 12.50, 20);
	      
	      //Calculate weekly pay for Amir 
	      	//employee = "Amir";
	      	//hourlyRate = 15.0;
	      	//hoursWorked = 35;
	      	//weeklyPay = hourlyRate * hoursWorked;
	      	//System.out.println(employee  + ":" + weeklyPay);
		calculatePay("Amir", 15.0, 35);

		  //parts changing goes into paramter, same goes into the method
	}
}