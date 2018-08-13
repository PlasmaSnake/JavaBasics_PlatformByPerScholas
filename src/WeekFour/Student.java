package WeekFour;

public class Student {

	public static void main(String[] args) {
		
	}
	
	private String id;
	private String lastName;
	private String firstName;
	private String email;
	private String phone;
	
	public Student() {}
	public Student(String id, String last, String first, String email, String phone){
		this.id = id;
		this.lastName = last;
		this.firstName = first;
		this.email = email;
		this.phone = phone;
	}

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
}
