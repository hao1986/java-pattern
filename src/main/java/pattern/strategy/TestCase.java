package pattern.strategy;

/**
 * 策略模式测试类
 * @author Alice
 *
 */
public class TestCase {

	public static void main(String[] args) {
		IAction1 action1 = new Action1();
		IAction2 action2 = new Action2();
		
		ConcreteRole concreteRole = new ConcreteRole();
		
		concreteRole.setIAction1(action1);
		concreteRole.setIAction2(action2);
		
		concreteRole.display();
	}

}
