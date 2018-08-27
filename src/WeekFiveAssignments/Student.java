package WeekFiveAssignments;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int grade;
	private double GPA;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Student() {
		name = "Mike";
		grade = 12;
		GPA = 3.8d;
	}
	
	public Student(String name, int grade, double GPA){
		this.name = name;
		this.grade = grade;
		this.GPA = GPA;
	}
	public void getInfo() {
		System.out.printf("Hello my name is %s, and my grade is %s. My GPA is %.2f.\n", name, grade, GPA);
	}
}
