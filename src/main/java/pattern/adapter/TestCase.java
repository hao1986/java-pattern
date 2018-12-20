package pattern.adapter;


/**
 * 适配器模式测试类
 * @author Alice
 *
 */
public class TestCase {

	public static void main(String[] args) {
		IBaseAdapter baseAdapter = new BaseAdapter();
		baseAdapter.executorIBaseAdapter();
		
		ConcreteAdapter concreteAdapter = new ConcreteAdapter(baseAdapter);
		concreteAdapter.exectorAdapter();
		
		dispaly(concreteAdapter);

	}
	
	public static void dispaly(IAdapter iAdapter) {
		iAdapter.exectorAdapter();
	}

}

