package WeekFourAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class mainStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Bob",new int[]{95,80,40});
		Student s2 = new Student("Hammond",new int[]{95,100,99});
		Student s3 = new Student("Rich",new int[]{84,80,78});
		// Part One
		displayStudent(s1);
		displayStudent(s2);
		displayStudent(s3);
		// Part Two to Five
		Student[] studentArray = new Student[] {s1,s2,s3};
		System.out.printf("Average GPA of students: %.2f\n", calculateAverageGPA(studentArray));
		Course c1 = new Course("CS150", "Data Structures", "Dan Hope");
		Course c2 = new Course("CS225", "Computer Architecture", "Sam Ho");
		Course c3 = new Course("CS130", "Algorithms", "John Doe");
		Course[] courses = new Course[] {c1,c2,c3};
		displayCourses(courses);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount of students you'd like to see: ");
		int numStudents = in.nextInt();
		Student[] userStudents = new Student[numStudents];
		
		for (int i = 0; i < numStudents; i++) {
			userStudents[i] = new Student();
			displayStudent(userStudents[i]);
			System.out.printf("Enter a course (1-3) to add for student #%d: ", i+1);
			int courseNum = in.nextInt()-1;
			userStudents[i].course = courses[courseNum];
		}
		System.out.printf("Average GPA of 2nd group of students: %.2f\n", calculateAverageGPA(userStudents));
		
		for (int i = 0; i < userStudents.length; i++) {
			getInfo(userStudents[i]);
			getCourse(userStudents[i]);
		}
		
	}
	public static void displayStudent(Student s) {
		System.out.printf(s.name + ": Grades " + Arrays.toString(s.grades)+ " GPA: %.2f\n", s.GPA );
	}
	
	public static double calculateAverageGPA(Student[] students){
		double average = 0;
		for (Student s: students) {
			average += s.GPA;
		}
		return average /= students.length;
	}
	public static void getInfo(Student s) {
		System.out.printf("Hello my name is %s, and my grades are %s. My GPA is %.2f.\n", s.name, Arrays.toString(s.grades), s.GPA);
	}
	
	public static void getCourse(Student s) {
		System.out.printf("I'm currently taking %s - %s - %s \n", s.course.id, s.course.name, s.course.instructor);
	}
	public static void displayCourses(Course[] courseArray) {
		int i = 1;
		for(Course c: courseArray) {
			System.out.printf("%d) %s | %s | %s\n", i, c.id, c.name, c.instructor);
			i++;
		}
	}
}