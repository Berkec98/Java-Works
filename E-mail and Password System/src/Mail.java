

import java.util.Scanner; 
	public class Mail extends Student{
	    
	    //ask first name, last name, university and we recorded.
	    public Mail(){
	        
	        System.out.println("Welcome to Mail Application!");
	        System.out.print("What is your name?");
	        Scanner in= new Scanner(System.in);
	        setName(in.nextLine());
	        System.out.print("What is your surname?");
	        setSurname(in.nextLine());
	        System.out.print("What is the name of the university? (without space)");
            setUniversity(in.nextLine());

	    //call a method asking for department and return for  the department
	    this.setDepartment(setDepartment());
	    System.out.println("Department: "+this.getDepartment());
	    //call a random passcode conversion method
	    this.setPasscode(RandomPasscode(getDefaultPasscodeLength()));
	    System.out.println("Your Passcode: "+ this.getPasscode());
	    //combine items together to form mail
	    setMail(getName().toLowerCase()+ "."+getSurname().toLowerCase()+"."+ getDepartment().toLowerCase() +"@"+getUniversity().toLowerCase()+"uni"  + getSchoolsuffix());
	    System.out.println("Your mail: "+getMail());
	    }
	    
	    //ask for the department
	    private String setDepartment(){
	    	// The list case of deparments
	        System.out.print("Department Code\n1 for Engineering\n2 for Law\n3 for Architecture\n4 for Business\n5 for Medicine\nEnter University Department code:");
	        Scanner in= new Scanner(System.in);
	        int departmentselection = in.nextInt();
        
	        if (departmentselection == 1){ return "Engineering"; }
	        else if (departmentselection == 2){return "Law";}
	        else if (departmentselection == 3){return "Architecture";}
	        else if (departmentselection == 4){return "Business";}
	        else if (departmentselection == 5){return "Medicine";}
	        else if (departmentselection > 5) { throw new ArithmeticException("Access denied - You must choose a code between 1 and 5"); }
	        else {return "You entered the wrong code. Please try again!";} 
	        }
				     	
	    //generate a random passcode
	    private String RandomPasscode(int length){
	        String PasscodeSet = "AB.DHJG;.=)+^'??!!!FTYZ567894021$/#";
	        char[] Passcode = new char[length];
	        for (int i=0; i<length;i++){
	            int Random = (int)(Math.random() * PasscodeSet.length());
	            Passcode[i]= PasscodeSet.charAt(Random);
	        }
	        return new String(Passcode);
	    }
	    //define an the alternative mail

	    public void setAlternativeMail() {
	        AlternativeMail =  getAlternativeMail();
	        AlternativeMail = getSurname().toLowerCase()+ "."+getName().toLowerCase()+ "@"+getUniversity().toLowerCase()+getSchoolsuffix();
	    }
	    public String getAlternativeMail(){
	        return AlternativeMail;
	    }

	    //If user want to change passcode, we allow that he can.
	    public void changePasscode(){
	    	System.out.println("Do you want new passcode? Yes or No");
	    	Scanner in= new Scanner(System.in);
	    	 String passanswer =in.nextLine();
	    	 if ("yes".equals(passanswer) || "Yes".equals(passanswer)  ) {
	        System.out.println("You can write your new passcode.");
	        String newpass =in.nextLine();
	        System.out.println("Your new passcode is " + newpass + ". Thanks for using!");	 
	    }
	    	 else {
	    		 System.out.println("Thanks for using our application!");
	    	 }
	    	 
	    }
	}
	    

