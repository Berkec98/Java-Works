import java.util.LinkedList;

public class classLinkedList {

	public static void main(String[] args) {
		// ArrayList ile algoritmalarý farklý. Aramak için ArrayList daha mantýklý. 
		// Silme, ekleme iþlemlerinde LinkedList daha hýzlý. 
		
		LinkedList cities = new LinkedList();
		
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("New York");
		cities.add("Roma");
		cities.add("Paris");
		cities.add("Madrid");
		cities.add("Madrid");
		
		cities.add(1,"Izmir"); // 1.index'e Izmir'i eklemiþ oldum.
		cities.remove(1); // 1.indexte bulunan þehiri silmis oldum.
		
		// Farklý bir metod ile output almak istedim.
		
		cities.forEach(i -> System.out.println(i));

	}

}
