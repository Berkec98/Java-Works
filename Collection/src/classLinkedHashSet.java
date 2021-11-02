
import java.util.LinkedHashSet;

public class classLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet names = new LinkedHashSet();
		names.add("Berke");
		names.add("Onur");
		names.add("Oktay");
		names.add("Gurur");
		names.add("Berke");
		
	    System.out.println(names + "  ");
		}

	}

// Output = [Berke,Onur, Oktay, Gurur]. 
// Berke nesnesi iki kez tekrarlanmadý. Output ekleme sýrasýyla orantýlý çýktý.
// The Berke object was not repeated twice. Output is proportional to the order in which they were added.

