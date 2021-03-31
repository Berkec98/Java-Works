import java.util.Scanner;

// This application receives course and professor information from the user, matches them and outputs them to the user.
// 26.01.2021
// It was made by Berke Cakirlar 20161701027

public class Main {
	 
	public static void main(String[] args) {
	      // I will create prof, course variables and taken their informations.
		
		Course course = new Course();
		Professor prof = new Professor();
	      
	       Scanner scan = new Scanner(System.in);  // Used Scanner to take input.
	       System.out.print("What is Professor Id? ");
	       prof.setId(scan.nextLine());
	       System.out.print("What is Professor Name? ");
	       prof.setName(scan.nextLine());
	       System.out.print("What is the Course Id? ");
	       course.setId(scan.nextLine());
	       System.out.print("What is the Course Name? ");
	       course.setName(scan.nextLine());
	      
	       course.setProfessor(prof); // I assign prof as the course professor.
	      
	       System.out.println(course); // We defined the output in the toString method. So we don't need to rewrite it here.
	      
	   }

	}


