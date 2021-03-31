// Thanks to this application, you can write student's grades practically.
// Written by Berke Cakirlar

public class Student {


	private String firstName;
	private String middleName;
	private String lastName;
	private int id;
	private int grade;
	
	public Student(String firstName, String middleName, String lastName, int id, int grade) {
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.id=id;
		this.grade=grade;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void yaz() {
		System.out.println(firstName + " " + middleName +" " + lastName +" " +id +" "+ grade);
	}

	}
	