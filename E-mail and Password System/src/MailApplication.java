// Written by Ahmet Tezcan, Berke Cakirlar, Eda Kalaycioglu, Gizem Dalkara
// Date 02-01-2021
// This application gives a mail to student about his/ her department and school.

public class MailApplication {
	    public static  void main(String[]args){ 
	        Mail mail1 = new Mail(); 
	        mail1.setAlternativeMail();
	        System.out.println("Your alternativeMail: "+ mail1.getAlternativeMail());
	        mail1.changePasscode();
	        
	    }
	}



