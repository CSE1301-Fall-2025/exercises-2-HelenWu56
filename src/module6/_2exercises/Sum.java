package module6._2exercises;

public class Sum {


	public static int sum(int n){
		if (n <= 0) {
			return 0;
		}
		else{
			return sum(n-1) + n;
		}
	}

	public static void main(String[] args) {
		//test your method here
		System.out.println(sum(5));
		System.out.println(sum(1));
		System.out.println(sum(0));
	}
}
