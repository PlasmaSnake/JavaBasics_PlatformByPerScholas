package WeekFour;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kid = new KidUsers();
		
		System.out.println("Testing Age set to 10:");
		kid.age = 10;
		kid.registerAccount();
		System.out.println("Testing Age set to 18:");
		kid.age = 18;
		kid.registerAccount();
		System.out.println("Testing Kids book type:");
		kid.bookType = "Kids";
		kid.requestBook();
		System.out.println("Testing Fiction book type:");
		kid.bookType = "Fiction";
		kid.requestBook();


		
		
		AdultUsers adult = new AdultUsers();
		System.out.println("\nTesting Age set to 5:");
		adult.age = 5;
		adult.registerAccount();
		System.out.println("Testing Age set to 23:");
		adult.age = 23;
		adult.registerAccount();
		System.out.println("Testing Kids book type:");
		adult.bookType = "Kids";
		adult.requestBook();
		System.out.println("Testing Fiction book type:");
		adult.bookType = "Fiction";
		adult.requestBook();

	}

}
