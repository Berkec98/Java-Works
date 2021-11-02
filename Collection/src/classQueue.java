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
		
		que.offer("Goal"); // E�er listenin karakter tipi ile parametredeki karakter tipi uyumlu ise ekler.
		
		System.out.println(que); // Berke Berke Alex Lewa Messi Ronaldo Goal
		
		System.out.println(que.element()); // Kuyru�un ba��ndaki ��eyi listeler. Kuyruktan atmaz.
		System.out.println(que.peek()); // Kuyru�un ba��ndaki ��eyi verir. Kuyruktan atmaz. Bo�sa null verir. 
		System.out.println(que.remove()); // Kuyru�un ba��ndaki ��eyi atar. Berke silindi.
		System.out.println(que.poll()); // Kuyru�un ba��ndaki ��eyi atar. Berke silindi. Bo�sa null verir.
	
		System.out.println(que); // Alex Lewa Messi Ronaldo Goal
		
	}

}
