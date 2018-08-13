package WeekFour;

public class Shape {
	double radius;
	double height;
	double width;
	double angle;
	
	public Shape(double radius) { this.radius = radius;}
	public Shape(double h, double w) { this.height = h; this.width = w;}
	
	public void test() {
		System.out.printf("%.2f %.2f %.2f %.2f\n", radius, height, width, angle);
	}
}
