import java.util.Vector;

public class classVector {

	public static void main(String[] args) {
		Vector vec = new Vector();  // Buraya Vector(4) yazsam Capacity 4 olur. +4 eklenerek ilerler..
		vec.add(1);
		vec.add(4);
		vec.add(2);
		vec.add(10);
		vec.add(7);
		vec.add(8);
		
		System.out.println(vec.size()); // 6
		System.out.println(vec.capacity()); // Vector'ün default kapasitesi 10'dur. 
		                                   // Eðer eleman sayýsý 11 olursa capacity 20 olur. Capacity+10 eklenerek artar.
		System.out.println(vec.firstElement()); // 1
		System.out.println(vec); // 1 4 2 10 7 8 Output is proportional to the order in which they were added.

	}

}
