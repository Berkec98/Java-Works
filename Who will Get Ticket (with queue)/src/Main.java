import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Queue <String> ticket_que = new LinkedList<String>();
		ticket_que.offer("Michael");
		ticket_que.offer("Berke");
		ticket_que.offer("Alex");
		ticket_que.offer("Onur");
		ticket_que.offer("Gurur");
		ticket_que.offer("Maria");
		ticket_que.offer("Ayse");
		ticket_que.offer("Eysan");
		ticket_que.offer("Little boy");
		
		Random random = new Random();
		int no_tickets = 1 + random.nextInt(8);
		System.out.println("I am in charge. Totally We have " + no_tickets +" tickets.");
		Thread.sleep(3000);
		while(no_tickets != 0) {
			System.out.println(ticket_que.poll()+ " could buy one ticket.");
			no_tickets--;
			Thread.sleep(1000);
		}
		System.out.println("Our tickets are over. Thank you!");
		
	}

}
