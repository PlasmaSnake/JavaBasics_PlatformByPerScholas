package WeekFour;

public class Circle {
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		float input = 4f;
		System.out.printf("Radius: %.4f The area is %.4f and the circumference is %.4f",
				input, circle.calculateCircleArea(input), circle.calculateCircumference(input));
	}
	
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getPi() {
		return pi;
	}
	public void setPi(float pi) {
		this.pi = pi;
	}

	private float radius;
	float pi;
	
	public Circle(){
		radius = 1.5f;
		pi = 3.5f;
	}
	Circle(float radius) { this.radius = radius;}
	public Circle(float radius, float pi) { 
		this(radius); 
		this.pi = pi;
	}
	public float calculateCircleArea(float radius) {
		return radius*radius*pi;
	}
	
	public float calculateCircumference(float radius) {
		return 2*pi*radius;
	}
}