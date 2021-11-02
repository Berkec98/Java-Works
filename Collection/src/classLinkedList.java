import java.util.LinkedList;

public class classLinkedList {

	public static void main(String[] args) {
		// ArrayList ile algoritmalar� farkl�. Aramak i�in ArrayList daha mant�kl�. 
		// Silme, ekleme i�lemlerinde LinkedList daha h�zl�. 
		
		LinkedList cities = new LinkedList();
		
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("New York");
		cities.add("Roma");
		cities.add("Paris");
		cities.add("Madrid");
		cities.add("Madrid");
		
		cities.add(1,"Izmir"); // 1.index'e Izmir'i eklemi� oldum.
		cities.remove(1); // 1.indexte bulunan �ehiri silmis oldum.
		
		// Farkl� bir metod ile output almak istedim.
		
		cities.forEach(i -> System.out.println(i));

	}

}
