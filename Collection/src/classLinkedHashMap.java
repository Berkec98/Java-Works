import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class classLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap(); //key,value Value'leri sýralýyor. 
		lhm.put("Messi",82);
		lhm.put("Ronaldo",78);
		lhm.put("Neymar",63);
		lhm.put("Lewandowski",73);
		
		Set set = lhm.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() +" " + item.getValue()); 
			
			// Messi 82 Ronaldo 78 Neymar 63 Lewandowski 73
		}

	}

}
