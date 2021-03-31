// You have 100 credits. You can shop. At the end of 5 shopping, we will give you a random gift. Berke Cakirlar

import java.util.Scanner;

public class deneme {
 public static void main(String[]args) {
	 int usercredit = 100;
	 int compcredit = 25;
	 int pricredit = 5;
	 int phocredit = 15;
	 int total = 0;
	 
	 System.out.println("Welcome to Shopping Cart");
	 System.out.println("You have 100 credit.");
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Choose your process.");
	 System.out.println("1- I want to buy a computer.");
	 System.out.println("2- I want to buy a printer.");
	 System.out.println("3- I want to buy a phone.");
	 System.out.println("4- I want to add credit."); 
	 while (true) {
	 int process = scan.nextInt();
	 switch (process) {
	 case 1:
		 System.out.println("You bought a computer. Thank you");
		 usercredit -= compcredit;
		 total +=1;
		 System.out.println("Your new credit is " + (usercredit));
		 System.out.println("You bought " + total + " items");
		 break;
	 case 2:
		 System.out.println("You bought a printer. Thank you");
		 usercredit -= pricredit;
		 total +=1;
		 System.out.println("Your new credit is " + (usercredit));
		 System.out.println("You bought " + total + " items");
		 break;
	 case 3:
		 System.out.println("You bought a phone. Thank you");
		 usercredit -= phocredit;
		 total +=1;
		 System.out.println("Your new credit is " + (usercredit));
		 System.out.println("You bought " + total + " items");
		 break;
	 case 4:
		 System.out.println("How many credit do you want to add? ");
		 int extra = scan.nextInt();
		 usercredit += extra;
		 System.out.println("Your new credit is " + (usercredit));
		 
		 break;
    default:
    	System.out.println("You choose a invalid process.");
    	break;
	 }
    	if (total == 5) {
    		System.out.println("Congrats, you have a random gift.");
    		int gifts = (int)(Math.random() * 3) + 1;
    		 if (gifts == 1) {
    			 System.out.println("You win a computer!");
    		 }
    		 else if (gifts == 2) {
    			 System.out.println("You win a printer!");
    		 }
    		 else if (gifts == 3) {
    			 System.out.println("You win a phone!");
    		 }
    	
    	
    	}
	 }
 }
}
    	
   	
	 






