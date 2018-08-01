package WeekOne;

import java.util.Scanner;
public class ProblemSetThree {
	static boolean isRunning = false;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		isRunning = true;
		
		while (isRunning) {
		System.out.print("Enter an option:\nAdd - 1\n"
				+ "Subtract - 2\n"
				+ "Multiply - 3\n"
				+ "Quit - 4\n");
		int select = in.nextInt();
		optionSelector(select);
		}
		in.close();
	}

	public static void optionSelector(int option){
		if (option == 1) optionAdd();
		if (option == 2) optionSubtract();
		if (option == 3) optionMultiply();
		if (option == 4) isRunning = false;
		if (option < 1 || option > 4) 
			System.out.println("False input.");
	}
	
	public static void optionAdd() {
		System.out.println("Enter two numbers to be added: ");
		int n1 = in.nextInt(), n2 = in.nextInt();
		System.out.printf("%d + %d is %d\n", n1,n2,n1+n2 );
	}
	
	public static void optionSubtract() {
		System.out.println("Enter two numbers to be subtracted: ");		
		int n1 = in.nextInt(), n2 = in.nextInt();
		System.out.printf("%d - %d is %d\n", n1,n2,n1-n2 );
	}
	
	public static void optionMultiply() {
		System.out.println("Enter two numbers to be multiplied: ");		
		int n1 = in.nextInt(), n2 = in.nextInt();
		System.out.printf("%d * %d is %d\n", n1,n2,n1*n2 );
	}
}