package pattern.singleton;

/**
 * 线程锁方式创建单例
 * @author Alice
 *
 */
public class Singleton2 {
	
	private static Singleton2 singleton2 = null;
	
	private String message;
	
	private int i;
	
	private Singleton2() {
		System.out.println("Singleton2 create");
		message = "Singleton2 message";
		i= 0;
	}
	
	public static synchronized Singleton2 getInstance() {
			if(singleton2 == null){
				System.out.println("Singleton2 is null");
				singleton2 = new Singleton2();
			}

		return singleton2;
	}
	
	public static Singleton2 getInstance2() {
		synchronized (Singleton2.class) {
			if(singleton2 == null){
				System.out.println("getInstance2,Singleton2 is null");
				singleton2 = new Singleton2();
			}
		}
		return singleton2;
	}
	
	public String dispaly() {
		i++;
		System.out.println("Singleton dispaly "  + i);
		return "Singleton dispaly " + message;
	}
}
