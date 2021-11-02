import java.util.ArrayList;
import java.util.Iterator;

public class classArrayList {

	public static void main(String[] args) {
		
		ArrayList cities = new ArrayList();
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("New York");
		cities.add("Roma");
		cities.add("Paris");
		cities.add("Madrid");
		cities.add("Madrid");
		
		cities.add(1,"Izmir"); // 1.index'e Izmir'i eklemi� oldum.
		cities.remove(1); // 1.indexte bulunan �ehiri silmis oldum.
			
		Iterator iter = cities.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
// Output Istanbul Ankara New York Roma Paris Madrid Madrid
// Output ekleme s�ras�yla orant�l� ��kt�.
// Output is proportional to the order in which they were added.