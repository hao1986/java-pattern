package pattern.singleton;

/**
 * 单例模式测试类
 * @author Alice
 *
 */
public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton1.getInstance());
		
		for(int i=0; i< 3; i++){
			Runnable singletonRunnable = new Singleton2Thread(i);
		  new Thread(singletonRunnable).start();
		}
		
		for(int i=0; i< 3; i++){
			Runnable singleton3Runnable = new Singleton3Thread(i);
		  new Thread(singleton3Runnable).start();
		}

	}
	
	

}

class Singleton3Thread implements Runnable{
	int index;
	
	public Singleton3Thread(int i) {
		// TODO Auto-generated constructor
		index = i;
	}

	@Override
	public void run() {
		System.out.println(Singleton3.INSTANCE + "~~~" + index);
	}
	
}


class Singleton2Thread implements Runnable{
	
	int index;

	public Singleton2Thread(int i) {
		index = i;
	}

	@Override
	public void run() {
		//System.out.println(index + "~~~" + Singleton2.getInstance());
		//System.out.println(Singleton2.getInstance().dispaly());
		System.out.println(index + "~~~" + Singleton2.getInstance2());
		System.out.println(Singleton2.getInstance2().dispaly());
	}
	
	
}
