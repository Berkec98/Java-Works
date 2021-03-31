
public class Student extends Person{ /* It inherits person */
	private String level; /* Extra variable for student */
	
	public Student(String firstName, String lastName, int age, String gender, String level) {
 	   super(firstName,lastName,age,gender); /* Super method to using same variables */
 	   this.level=level;

}
	 public void showInfos() {
		   super.showInfos(); /* I call super method because of first name,last name,age and gender informations */
		   System.out.println( "She is an " + this.level + " student.");
		   /* We must add this because super method does not include level */
	 }

	 /* Getter and Setter of level variables */
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) { /* I decided to possible values */
		if(level == "undergraduate" || level == "graduate") {
        this.level = level; }
        else {
        	System.out.println("Invalid level choice. ");
        }
	}
}
	
