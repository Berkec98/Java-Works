// Thanks to this application, you can write student's grades practically.
// Written by Berke Cakirlar


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
	
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				try {
				producer();
			}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
	
	      Thread th2 = new Thread(new Runnable() {
		public void run() {
			try {
			consumer();
		}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	});
            th1.start();
            th2.start();
            th1.join();
            th2.join();
	}
            
	
	private static void producer() throws InterruptedException {
		Random random = new Random ();
		
		while (true) {
			queue.put(random.nextInt(100));
		}
		}
		private static void consumer() throws InterruptedException {
			Random random = new Random();
			while (true) {
				Thread.sleep(100);
				
				if(random.nextInt(10) == 0) {
					Integer value = queue.take();
					System.out.println("Taken value: " + value + "; Queue size is: " + queue.size());
				}
		}

}
}