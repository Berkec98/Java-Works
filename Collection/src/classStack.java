import java.util.Stack;

public class classStack {

	public static void main(String[] args) {
		
		Stack stack = new Stack(); // LAST IN FIRST OUT
		System.out.println(stack.empty()); // true
		
		stack.push("Berke");
		stack.push("Onur");
		stack.push("Gurur");
		stack.push("Mehmet");
		stack.push("Oktay");
		
		stack.pop(); // It deleted Oktay.
		stack.peek(); // Show the last element.Mehmet
		
			System.out.println(stack); // Berke Onur Gurur Mehmet

	}

}
