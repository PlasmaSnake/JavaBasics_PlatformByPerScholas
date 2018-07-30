package WeekOne;
import java.util.Scanner;
public class ProblemOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Farenheit Temperature to convert to Celcius: ");
		System.out.println(convertFarenheitToCelcius(in.nextDouble()));
		//////////// End of Problem 1
		System.out.print("Enter inches to convert to meters: ");
		System.out.println(convertInchToMeter(in.nextDouble()));
		//////////// End of Problem 2
		System.out.print("Enter two numbers to calculate product. \nFirst Number: ");
		double n1 = in.nextDouble();
		System.out.print("Second Number: ");
		double n2 = in.nextDouble();
		System.out.println(product(n1, n2));
		////////////End of Problem 3
		System.out.print("Enter a number to multiply by 1 to 10: ");
		sequentialProduct((in.nextInt()));
		////////////End of Problem 4
		in.close();
	}
	
	private static double convertFarenheitToCelcius(double n1) {
		return ((n1-32)*(5.0/9));
	}
	
	private static double product(double n1, double n2) {
		return n1*n2;
	}
	
	private static double convertInchToMeter(double n1) {
		return n1*.0254;
	}
	
	private static void sequentialProduct(int n1) {
		for(int i = 1; i < 11; i++) {
			System.out.print(n1*i+ " ");
;		}
	}
}
