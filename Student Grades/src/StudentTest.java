import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentTest {
	public static void  main(String[] args) {
		Student a = new Student ("Berke","Can","Cakirlar",101,90);
		Student b = new Student ("Sedat","Onur","Cakirlar",102,95);
		Student c = new Student ("Mehmet","Oktay","Cakirlar",103,40);
		Student d = new Student ("Alex","de","Souza",104,10);
		Student e = new Student ("Gheorghe","Ianis","Hagi",105,55);
		Student f = new Student ("Ahmet","Mehmet","Usta",106,63);
		Student g = new Student ("Ayse","Yagmur","Nesne",107,71);
		Student h = new Student ("Aslı","Reyhan","Yön",108,23);
		Student x = new Student ("Alpan","Ege","Turp",109,94);
		Student z = new Student ("Mario","Gomez","Garcia",110,33);
	
   
	ArrayList<Student> list = new ArrayList<>();
	    list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
		list.add(x);
		list.add(z);

		for (Student i : list) {
		      i.yaz();
		
	
		}
				
	}
}


