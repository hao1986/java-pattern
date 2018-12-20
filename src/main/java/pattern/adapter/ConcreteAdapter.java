package pattern.adapter;

/**
 * 适配目标接口实现类
 * @author Alice
 *
 */
public class ConcreteAdapter implements IAdapter {
	
	/**
	 * 包含被适配接口的引用
	 */
	private IBaseAdapter iBaseAdapter;
	
	/**
	 * 根据被适配类，构造目标适配类
	 * @param iBaseAdapter
	 */
	public ConcreteAdapter(IBaseAdapter iBaseAdapter) {
		this.iBaseAdapter = iBaseAdapter;
	}

	@Override
	public void exectorAdapter() {
		System.out.println("start exector IBaseAdapter");
		iBaseAdapter.executorIBaseAdapter();
		System.out.println("end exector IBaseAdapter");
	}

}
