import java.util.HashMap;
import java.util.Map;

public class hm {
	public static void main(String[]args) {
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(05,"I am ");
		hashMap.put(04,"Berke ");
		hashMap.put(02,"I ");
		hashMap.put(03,"love ");
		hashMap.put(01,"Java");
		
		// System.out.println(hashMap); // {1=Java, 2=I , 3=love , 4=Berke , 5=I am } It started to write at the lowest value.
		
		for(Map.Entry<Integer,String> ent : hashMap.entrySet()) {
			 System.out.println(ent.getKey()); // 1 2 3 4 5
			 System.out.print(ent.getValue()); // Java I love Berke I am 
		}
	}	
	}


