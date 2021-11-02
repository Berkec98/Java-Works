import java.util.LinkedList;
import java.util.Queue;

public class classQueue {

	public static void main(String[] args) {
		
		Queue que = new LinkedList(); // FIRST IN FIRST OUT.
		
		que.add("Berke");
		que.add("Berke");
		que.add("Alex");
		que.add("Lewa");
		que.add("Messi");
		que.add("Ronaldo");
		
		que.offer("Goal"); // Eðer listenin karakter tipi ile parametredeki karakter tipi uyumlu ise ekler.
		
		System.out.println(que); // Berke Berke Alex Lewa Messi Ronaldo Goal
		
		System.out.println(que.element()); // Kuyruðun baþýndaki öðeyi listeler. Kuyruktan atmaz.
		System.out.println(que.peek()); // Kuyruðun baþýndaki öðeyi verir. Kuyruktan atmaz. Boþsa null verir. 
		System.out.println(que.remove()); // Kuyruðun baþýndaki öðeyi atar. Berke silindi.
		System.out.println(que.poll()); // Kuyruðun baþýndaki öðeyi atar. Berke silindi. Boþsa null verir.
	
		System.out.println(que); // Alex Lewa Messi Ronaldo Goal
		
	}

}
