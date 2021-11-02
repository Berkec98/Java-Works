import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class classTreeMap {

public static void main(String[] args) {
		
		TreeMap lhm = new TreeMap(); //key,value    Keyleri sýralýyor. Burada alfabetik olarak sýralayacak.
		lhm.put("Messi",82);
		lhm.put("Ronaldo",78);
		lhm.put("Neymar",63);
		lhm.put("Lewandowski",73);
		
		Set set = lhm.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() +" " + item.getValue()); 
			
			// Lewandowski 73 Messi 82 Neymar 63 Ronaldo 78
		}

	}

}
