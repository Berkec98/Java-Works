import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class letters {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = scan.nextLine();
		
		Map<Character,Integer> time = new TreeMap<Character,Integer>();
		for (int i=0; i<sentence.length(); i++) {
			char x = sentence.charAt(i);
			if (time.containsKey(x)) {
				time.replace(x,time.get(x)+1);
			}
			else {
				time.put(x, 1);
			}
		}
			for (Map.Entry <Character,Integer> entry : time.entrySet()) {
				System.out.println("There is " + entry.getKey() +" " +entry.getValue()+  " " + "letter");
			}
		}	
	}
	

