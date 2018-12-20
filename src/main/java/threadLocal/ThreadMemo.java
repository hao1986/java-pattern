package threadLocal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMemo {

	private static ThreadLocal<Demo> threadLocal = new ThreadLocal<Demo>(){
		@Override
		protected Demo initialValue() {
			Demo demo=new Demo();
			demo.setName("liusl");
			demo.setSex("nv");
			return demo;
		}
		
	};
	
	public static Demo getName(){
		return threadLocal.get();
		
	}
	public static void main(String[] args) {
		List<Future<String>> list = new ArrayList<Future<String>>();
		ExecutorService services = Executors.newFixedThreadPool(3);
		for(int i=0; i< 3; i++){
		Future<String> future = services.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return ThreadMemo.getName().getName();
			}
		});
		System.out.println(future.isDone());
		list.add(future);
		}
		
		for(Future<String> future:list){
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				System.out.println("InterruptedException e");
			} catch (ExecutionException e) {
				System.out.println("ExecutionException e");
			}
			System.out.println(future.isDone());
		}

	}

}

class Demo{
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", sex=" + sex + "]";
	}
}
