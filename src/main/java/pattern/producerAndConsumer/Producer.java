package pattern.producerAndConsumer;

import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable {
	
	private LinkedBlockingQueue<Person> queue;
	
	private Person person;

	public Producer(LinkedBlockingQueue<Person> queue, Person person) {
		super();
		this.queue = queue;
		this.person = person;
	}

	@Override
	public void run() {
		try {
			System.out.println("producer size = " + queue.size());
			System.out.println("producer person = " + person.toString());
			queue.put(person);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
