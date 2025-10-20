package module5._2parameters;

/*
 * Exercise: Add a method called calculateShipping that has
 * one parameter. Then, use this method to replace the redundant
 * code within the main method.
 */
public class E05ShippingCostCalculator {
	public static void calculateShipping(double weight){
		double cost;
		if (weight < 15.0){
			cost = 9.95;
		}
		else{
			cost = 12.95;
		}
		System.out.println(cost);
	}
	
	public static void main(String[] args) {

		// double weight1, weight2, weight3;
		// double cost1, cost2, cost3;

		// weight1 = 22.0;  
		// weight2 = 10.0;
		// weight3 = 12.0;

		//calculate cost for item#1
			// if (weight1 < 15.0) {
			// 	cost1 = 9.95;
			// } else {
			// 	cost1 = 12.95;
			// }
			// System.out.println(cost1);
		calculateShipping(22.0);

		//calculate cost for item#2
			// if (weight2 < 15.0) {
			// 	cost2 = 9.95;
			// } else {
			// 	cost2 = 12.95;
			// }
			// System.out.println(cost2);
		calculateShipping(10.0);

		//calculate cost for item#3
			// if (weight3 < 15.0) {
			// 	cost3 = 9.95;
			// } else {
			// 	cost3 = 12.95;
			// }
			// System.out.println(cost3);
		calculateShipping(12.0);

	}
}
