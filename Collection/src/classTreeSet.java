import java.util.TreeSet;

public class classTreeSet {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();
		tree.add(4);
		tree.add(2);
		tree.add(11);
		tree.add(0);
		tree.add(3);
		tree.add(3); // wont be 
		
		System.out.println(tree + "  ");

	}

}

// Output [0, 2, 3, 4, 11]
// Çýktý küçükten büyüðe doðru sýralanarak çýktý.
// The output is sorted from smallest to largest.