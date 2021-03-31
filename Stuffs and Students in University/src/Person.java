
public class Person {
	private String firstName; /* All variables */
	private String lastName;
	private int age;
	private String gender;
	
	public Person(String firstName, String lastName, int age, String gender) { /* Constructor of Person */
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.gender=gender;
	}
	/* The method which will write the informations */
	public void showInfos() {
		System.out.println("Person's first name is " + firstName + ", " + "last name is " + lastName + ". " 
				+ gender + " is " + age + " years old.");
	}
	/* Getters and Setters */	
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}
		/* I decided to possible strings. */
		public void setGender(String gender) {
			if (gender == "He" || gender =="She") {
			this.gender = gender;
		}
			else {
				System.out.println("Invalid gender choice.");
			}
		
	}
}

