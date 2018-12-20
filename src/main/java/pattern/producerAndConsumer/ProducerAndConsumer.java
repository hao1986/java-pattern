package pattern.producerAndConsumer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProducerAndConsumer {

	public static void main(String[] args) {
		LinkedBlockingQueue<Person> queue = new LinkedBlockingQueue<Person>(10);
		//ExecutorService executors = new ThreadPoolExecutor(4, 8, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
		ExecutorService executors = Executors.newFixedThreadPool(2);
		Consumer consumer = new Consumer(queue);
		executors.execute(consumer);

		for(int i=0; i < 15; i++){
			Person person = new Person();
			person.setId(i);
			person.setName("test");
			Producer producer = new Producer(queue, person); 
			executors.execute(producer);
	}
	}

}
