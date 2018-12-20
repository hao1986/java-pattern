package pattern.producerAndConsumer;

import java.util.concurrent.LinkedBlockingQueue;

public class Consumer implements Runnable {
	
	private LinkedBlockingQueue<Person> queue;
	
	public Consumer(LinkedBlockingQueue<Person> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		Person person = null;;
		try {
			while(true){
			person = queue.take();
			System.out.println("consumer person = " + person.toString());
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
