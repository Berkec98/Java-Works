
public class Employee extends Person { /* It inherits person */
         private String job; /* Extra variable for employee */
      
	public Employee(String firstName, String lastName, int age, String gender, String job) { /* Constructor of Employee */
    	   super(firstName,lastName,age,gender);
    	   this.job=job;
       }
    	   public void showInfos() {
    		   super.showInfos();  /* I call super method because of first name,last name,age and gender informations */
    		   System.out.println("He serves the university as a " + this.job + "."); 
    		   /* We must add this because super method does not include job */
    	   
    	   }
    	   /* Getter and Setter for job variable */
    	   public String getJob() {
   			return job;
   		}
   		public void setJob(String job) {
   			this.job = job;
       }
}
         

