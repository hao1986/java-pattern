package pattern.singleton;

/**
 * 饿汉式创建单例
 * @author Alice
 *
 */
public class Singleton1 {
	
	private static Singleton1 singleton = new Singleton1();
	
	public static Singleton1 getInstance() {
		System.out.println("singleton getInstance");
		return singleton;
	}
	
	private Singleton1() {
		System.out.println("singleton create");
	}

}
