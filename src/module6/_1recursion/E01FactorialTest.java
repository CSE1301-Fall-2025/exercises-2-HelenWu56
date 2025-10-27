package module6._1recursion;

/*
 * Exercise: Use the debugger to examine how this recursive method works.
 * Add examples for the factorial of 4 and the factorial of 1.
 */
public class E01FactorialTest {

	public static int factorial(int n) {
		if(n == 0) { //base case
			return 1; //0! = 1 返回数值1
		} else { //recursive call
			return n * factorial(n - 1); //n=1时先计算factorial(0),这个调用会返回1,再计算1*1=1,返回1 
		}
	}//recursion y calling method

	public static int factorialLoop(int n) {
		int result = 1; //multification so not start at 0
		while(n != 0) { 
			result = result * n;
			n--;
		}
		return result;
	}//repetition with loop: no call to the same method, not recursive



	//substitution method
	//调用顺序
	//factorial(4) = 4 * factorial(3)
	//factorial(3) = 3 * factorial(2)
	//factorial(2) = 2 * factorial(1)
	//factorial(1) = 1 * factorial(0)
	//factorial(0) = 1

	//返回顺序
	//factorial(1) = 1 * 1 = 1
	//factorial(2) = 2 * 1 = 2
	//factorial(3) = 3 * 2 = 6
	//factorial(4) = 4 * 6 = 24

	//4! = 4 * 3 * 2 * 1 =  24
	//4! = 4 * 3! =  24
	//n! = n * (n-1)!
	//step into debugger, not step over
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
		//System.out.println(factorialLoop(4));
	}
}
