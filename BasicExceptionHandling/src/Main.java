import java.util.*;

public class Main {

	 public static void main(String [] args) {
		  int[] nums = new int[5];
		/* int [] numer = {4,8,16,32};
		 int [] denom = {2,0,4,4};
		 for (int i = 0; i< numer.length; i++) {
		 */
		 
		 try {
			System.out.println("In try.");
			nums[10] = 25;
		 
		
			 /* System.out.println(numer[i] / denom [i]);
			
			  System.out.println("Before throw.");
			   throw new ArithmeticException();
			 
			  System.out.println("In try 1.");
			   nums[10] = 25;
			   nums[3] = 25;
			   errorMethod(nums);
			   System.out.println("In try 2.");
			   System.out.println("Something important!");  
			   
		 catch (ArithmeticException ex) {
			  System.out.println("You can't divide by zero.");
			 System.out.println(ex);
		 }
		 catch(ArrayIndexOutOfBoundsException ex) {
			 System.out.println("In catch 1.");
		*/
		 }
		 catch (Exception ex) {
			 System.out.println("In exception.");
			 return;
			// System.out.println("In catch 2.");
 }
		 finally {
			 System.out.println("Finally block!");
		 }
		/* System.out.println("Rest of program.");
	 }
	  public static void errorMethod(int[] nums) {
		 nums[10] = 25;*/
	 }
}

