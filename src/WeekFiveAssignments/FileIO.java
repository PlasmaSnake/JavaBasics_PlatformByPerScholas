package WeekFiveAssignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FileIO {
	public static void main(String[] args) {
		
		File file = new File("/Users/plasm/Desktop/hello");
		File f2 = new File("/Users/plasm/Desktop/courseCode");
		File f3 = new File("/Users/plasm/Desktop/courseName");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			Stack<String> temp = new Stack<>();
			
			while ((line = reader.readLine()) != null){
				System.out.println(line);
				temp.push(line);
			}
			System.out.println();
			while(!temp.isEmpty()) {
				System.out.println(temp.peek());
				temp.pop();
			}
			reader.close();
			System.out.println();
			///////////Problem Two /////////////////////
			reader = new BufferedReader(new FileReader(f2));

			List<String> courseCodes = new ArrayList<>();
			List<String> courseNames = new ArrayList<>();
			
			fileToList(f2, courseCodes);
			fileToList(f3, courseNames);
			
			for (int i = 0; i < courseCodes.size(); i++) {
				System.out.printf("%s - %s\n", courseCodes.get(i), courseNames.get(i));
			}
			///////////Problem Three /////////////////////
			File names = new File("/Users/plasm/Desktop/names");
			File grades = new File("/Users/plasm/Desktop/grades");
			File gpas = new File("/Users/plasm/Desktop/gpas");
			Student s1 = createStudent();
			storeStudentName(names, s1);
			storeStudentGrade(grades, s1);
			storeStudentGPA(gpas, s1);
			
			///////////Problem Four /////////////////////
			List<String> studentNames = new ArrayList<>();
			List<String> studentGrades = new ArrayList<>();
			List<String> studentGPAs = new ArrayList<>();
			fileToList(names, studentNames);
			fileToList(grades, studentGrades);
			fileToList(gpas, studentGPAs);
			
			List<Student> studentList = new ArrayList<>();
			studentList = saveStudentList(studentNames, studentGrades, studentGPAs);
			for(Student s: studentList) {
				s.getInfo();
			}	
			listToCSV(studentList);
			
		}
		
		catch (IOException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static void fileToList(File fileName, List<String> list) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line = "";
		while ((line = reader.readLine()) != null){
			list.add(line);
		}
		reader.close();
	}
	
	static Student createStudent() {
		Scanner in = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter a Student's name. " );
		s1.setName(in.nextLine());
		System.out.println("Enter the grade. " );
		s1.setGrade(in.nextInt());
		System.out.println("Enter the GPA. " );
		s1.setGPA(in.nextDouble());
		in.close();
		return s1;
	}
	static void storeStudentName(File fileName, Student s1) throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
		if(fileName.exists()) writer.append("\n");
		writer.append(s1.getName());
		writer.close();
	}
	static void storeStudentGrade(File fileName, Student s1) throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
		if(fileName.exists()) writer.append("\n");
		writer.append(Integer.toString(s1.getGrade()));
		writer.close();
	}
	static void storeStudentGPA(File fileName, Student s1) throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
		if(fileName.exists()) writer.append("\n");
		writer.append(Double.toString(s1.getGPA()));
		writer.close();
	}
	
	static List<Student> saveStudentList(List<String> names, List<String> grades, List<String> GPAs) {
		List<Student> students = new ArrayList<>();
		try {
			for (int i = 0; i < names.size(); i ++) {
				Student s = new Student(names.get(i), Integer.parseInt(grades.get(i)), Double.parseDouble(GPAs.get(i)));
				students.add(s);
			} // Assumes names.size = length.size = gpas.size
		} catch (Exception e) {
			System.out.println(e);
		}
		return students;
	}
	
	static void listToCSV(List<Student> sList) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/plasm/Desktop/students.csv"));
		writer.append("Name,Grade,GPA\n");
		for(int i = 0; i < sList.size(); i++) {
			writer.append(sList.get(i).getName() + ","
					+ sList.get(i).getGrade() + ","
					+ sList.get(i).getGPA()+"\n");
		}
		
		writer.close();
	}
}
