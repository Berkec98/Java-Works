
public class Student {
	protected String surname; // We set our variables about student and mail as protected.
	protected String name;
    protected String university;
    protected String Department;
    protected String Passcode;
    protected String mail;
    protected int defaultPasscodeLength = 7;
    protected String AlternativeMail;
    protected String Schoolsuffix = ".education.com";
    
    // Getters and Setters of our variables.
    
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getPasscode() {
		return Passcode;
	}
	public void setPasscode(String passcode) {
		Passcode = passcode;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getDefaultPasscodeLength() {
		return defaultPasscodeLength;
	}
	public void setDefaultPasscodeLength(int defaultPasscodeLength) {
		this.defaultPasscodeLength = defaultPasscodeLength;
	}
	public String getSchoolsuffix() {
		return Schoolsuffix;
	}
	public void setSchoolsuffix(String schoolsuffix) {
		Schoolsuffix = schoolsuffix;
	}
	public String getAlternativeMail() {
		return AlternativeMail;
	}
	public void setAlternativeMail(String alternativeMail) {
		AlternativeMail = alternativeMail;
	}
    

}
