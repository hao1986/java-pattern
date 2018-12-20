package format;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i=0; i < 10; i++){
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					DateUtilThread dateUtilThread = new DateUtilThread();
					System.out.println(Thread.currentThread().getName() + "----" + dateUtilThread.getStringDate(new Date()));
				}
			});
		}
		

	}

}
