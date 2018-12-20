package pattern.singleton;

/**
 * 枚举方式创建的单例
 * @author Alice
 *
 */
public enum Singleton3 {
	INSTANCE;
	
	/**
	 * 初始化，私有无参构造方法
	 */
	private Singleton3(){
		System.out.println("Singleton3 create");
		display();
	}
	
	
	/**
	 * 私有方法
	 */
	private void display() {
		System.out.println("Singleton3 display");
	}

}
