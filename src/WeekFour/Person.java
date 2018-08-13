package WeekFour;

public class Person {
	String name = new String();
	int age = 0;
	String company = new String();
	String job = new String();
	String hobby = new String();
	
	public Person(String name, int age, String company, String job, String hobby) {
		this.name = name;
		this.age = age;
		this.company = company;
		this.job = job;
		this.hobby = hobby;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;}
	public String getJob() {return job;}
	public void setJob(String job) {this.job = job;}
	public String getHobby() {return hobby;}
	public void setHobby(String hobby) {this.hobby = hobby;}
	
	public void displayInfo() {
		System.out.printf("Person: %s\n"
				+ "Age: %d\n"
				+ "Company: %s\n"
				+ "Occupation: %s\n"
				+ "Hobby: %s\n", 
				name, age, company, job, hobby);
	}
	
}
