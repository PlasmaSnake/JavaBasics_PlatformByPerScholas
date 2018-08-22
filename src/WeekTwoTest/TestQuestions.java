package WeekTwoTest;

public class TestQuestions {
	public static void main(String[] args) {
		//caseCheck((float)1.234325421, (float)1.2343);
		//cozaLozaWoza();
	}
	
	public static void caseCheck(float n1, float n2) {
		String numberOne = Float.toString(n1);
		String numberTwo = Float.toString(n2);
		System.out.printf("Numbers %s and %s are: ", numberOne, numberTwo);
		for(int i = 3; i < Math.min(numberOne.length(), numberTwo.length()); i+=2) {
			String subOne = numberOne.substring(0,i+1);
			String subTwo = numberTwo.substring(0,i+1);
			if (subOne.equals(subTwo)) System.out.printf("\nEqual up to %d decimal points. %s %s", i-1, subOne, subTwo);
		}
		System.out.print("\n");
	}
	
	public static void cozaLozaWoza() {
		for (int i = 1; i < 111; i++) {
			if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) System.out.print(i);
			if (i % 3 == 0) System.out.print("Coza");
			if (i % 5 == 0) System.out.print("Loza");
			if (i % 7 == 0) System.out.print("Woza");
			
			System.out.print(" ");
			if (i % 11 == 0) System.out.print("\n");
		}
	}
}
