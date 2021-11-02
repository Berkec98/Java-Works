import java.util.*;

public class classSortedSet {
	public static void main(String[] args)
    {
	        SortedSet countri = new TreeSet();  // TreeSet olarak tanýmlandý. Treeset > SortedSet daha iyi geçiþ yapar ve deðer arar.
            countri.add("Brazil");
            countri.add("Argentina");
            countri.add("Turkey");
 
            countri.add("Turkey");
            System.out.println(countri); // Argentina, Brazil, Turkey = Alfabetik

            countri.remove("Argentina"); // Argentina silindi.

            Iterator i = countri.iterator(); // Iterator output version.
            while (i.hasNext())
            System.out.println(i.next()); // Brazil Turkey
}
}