
public class tryca {

	public static void main(String[]args) {
		try {
			int num = 30/0;    // First exception.
			int[]b = {0,1,2,3,4};    //Second exception.
			System.out.println(b[10]);   //Third exception.
		}
		catch(ArithmeticException e) {
			System.out.println("The number can't be divided by 0!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are over the height of Array!");
		}
		catch(Exception e) {
			System.out.println("Unknown Error!");
		}
		finally {
			System.out.println("I hope you didn't make a mistake.");
		}
	}
}


