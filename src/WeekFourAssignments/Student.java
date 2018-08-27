package WeekFourAssignments;

public class Student {
	
	String name;
	int[] grades;
	double GPA;
	Course course;
	
	public Student() {
		name = "Mike";
		grades = new int[] {40+(int)(Math.random()*61),50+(int)(Math.random()*51),100};
		GPA = calculateGPA(grades);
		course = new Course();
	}
	
	public Student(String name, int[] grades){
		this.name = name;
		this.grades = grades;
		GPA = calculateGPA(grades);
	}
	
	public Student(String name, int[] grades, Course course){
		this(name, grades);
		this.course = course;
	}
	
	public void addCourse(Course c) {
		course = c;
	}

	public static double calculateGPA(int[] grades){
		double average = 0;
		for (int s: grades) {
			average += s;
		}
		return average /= grades.length;
	}
	
}
