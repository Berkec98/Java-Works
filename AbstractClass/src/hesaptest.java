import java.util.Scanner;

public class hesaptest {

	public static void main(String[]args) {
		hesap account1 = new hesap ("Berke", 0.00);
		hesap account2 = new hesap("Onur", 300.00);
		
		System.out.println(account1.getName() + " balance: " + account1.getBalance());
		System.out.println(account2.getName() + " balance: " + account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account2: ");
		double depositAmount = input.nextDouble();
		System.out.println("2.hesaba ekleniyor ... " + depositAmount);
		account2.deposit(depositAmount);
		
		System.out.println(account1.getName() + " new balance " + account1.getBalance());
		System.out.println(account2.getName() + " new balance " + account2.getBalance());
	}
}
