import java.util.HashMap;
import java.util.Map;

public class classHashMap {

	public static void main(String[] args) {
		
		HashMap hashM = new HashMap();
		
		hashM.put(0, "Fenerbahce"); // First key, after value. We can write two times FB. But Can't 0 two times.
		hashM.put(2, "Galatasaray"); // Keylere göre, alfabetik veya kücükten büyüðe sýralanýr.
		hashM.put(1, "Besiktas");
		hashM.put(3, "Trabzon");
		
		
		
		System.out.println(hashM); // 0=Fenerbahce, 1=Besiktas, 2=Galatasaray, 3=Trabzon
		
		// hashM.clear(); - delete all elements.
					
	}

}
