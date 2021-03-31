public class Course {
	// I have defined the variables.
		   String id;
		   String name;
		   Professor professor;
		  
		   // Getter and Setters 
		   public String getId() {
		       return id;
		   }
		   public void setId(String id) {
		       this.id = id;
		   }
		   public String getName() {
		       return name;
		   }
		   public void setName(String name) {
		       this.name = name;
		   }
		   public Professor getProfessor() {
		       return professor;
		   }
		   public void setProfessor(Professor professor) {
		       this.professor = professor;
		   }

		  // I used toString method to show all objects as strings 
		   public String toString() {
		       return "ID of the professor of this course is " + professor.getId() + " , "  + "name of the professor of this course is " + professor.getName() +"."+ " Course ID is " + id + "," + " course name is " + name +"." ; 
 		   }
		}


