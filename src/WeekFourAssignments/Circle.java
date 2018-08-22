package WeekFourAssignments;

public class Circle {
	
	public static void main(String[] args) {		
		display();
	}
	
	static void display() {
		System.out.printf("Printing area: %.2f"
				+ "\nPrinting Circumference: %.2f",
		calculateCircleArea(4f),
		calculateCircumference(4f));
	}
	
	private static float radius;
	private static float pi = 3.5f;
	
	public Circle() {
		radius = 1.5f;
	}
	
	private Circle(float radius) {
		this.radius = radius;
	}
	public Circle(float radius, float pi) {
		this(radius);
		this.pi = pi;
	}
	
	public static float calculateCircleArea(float r) {
		return r * r * pi;
	}
	public static float calculateCircumference(float r) {
		return 2 * r * pi;
	}
}
