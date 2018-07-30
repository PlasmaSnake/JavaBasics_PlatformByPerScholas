package WeekTwo;

// Week Two In-Class lab exercises
// 1. Method Overloading
// 2. Math (random) and Type Broadening
public class Exercises {

	public static void main(String[] args) {
	// 	System.out.println(max(1,2)); //test for max [wont work]
		System.out.printf("Random Character: %s", randCharGenerator() );
		
	}
	
	//Method Overloading 
	public static double max(int num1, double num2) {
		if (num1 < num2) return num2;
		return num1;
	}
	
	public static double max(double num1, int num2) {
		if (num1 < num2) return num2;
		return num1;
	}
	//End Method Overloading 
	
	//Random number generator that produces a character from just A-Z
	public static char randCharGenerator() {
		int randomNumber = 65 + (int)(Math.random()*27);
		// char version of randomNumber
		//return (char)('a' + (Math.random()*('z'-'a'+1)));
		return (char)randomNumber;
	}
	//End Math and Type Broadening Exercise
}
