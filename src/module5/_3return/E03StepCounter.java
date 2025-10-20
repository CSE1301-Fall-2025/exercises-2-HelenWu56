package module5._3return;

/*
 * A pedometer estimates that taking 2000 steps is the same as walking
 * one mile. Write a method convertToMiles that takes in a parameter
 * for the number of steps(integer) and returns the equivalent number of miles walked. 
 * Then, call the method from the main() method to test a few values.
 */
public class E03StepCounter {
    
	//add convertToMiles method here
    public static double convertToMiles(int numberOfSteps){
        return ((double)numberOfSteps)/2000;
    }

    public static void main(String[] args) {
       
        //System.out.println("500 steps is equal to " + convertToMiles(500) + " miles");
        double miles = convertToMiles(500);
        System.out.println(miles);
        //add 2 more method calls here for 2000 and 3000 steps.
        miles = convertToMiles(2000);
        System.out.println(miles);
        miles = convertToMiles(3000);
        System.out.println(miles);
    }
}
