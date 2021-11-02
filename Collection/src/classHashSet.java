import java.util.HashSet;
import java.util.Iterator;

public class classHashSet {
public static void main (String[] args) {
		
		HashSet hash = new HashSet();
		hash.add("berke");
		hash.add(15);
		hash.add(true);
		hash.add(null);
		hash.add(10.2);
		
		Iterator iter = hash.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}

// Output null 10.2 berke 15 true

// HashSet kullanýmýnda output rastgele çýktý. Output is randomly when using HashSet.

