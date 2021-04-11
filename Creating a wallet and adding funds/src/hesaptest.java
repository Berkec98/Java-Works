import java.util.Scanner;

public class hesaptest {
	public static void main(String[] args) {
		hesap hesap1 = new hesap ("Berke",0);
		hesap hesap2 = new hesap ("Onur",500);
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Write the money to be added to the account:");
		double depositAmount = input.nextDouble();
		System.out.println( depositAmount + " adding...");
		hesap1.deposit(depositAmount);
		
		System.out.println(hesap1.getName() + " balance: " + hesap1.getBalance());
		System.out.println(hesap2.getName() + " balance: " + hesap2.getBalance());
		
		
	}
}
