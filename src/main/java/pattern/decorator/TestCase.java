package pattern.decorator;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecoratorInstance1 instance1 = new DecoratorInstance1();
		instance1.setType("test DecoratorInstance1");
		
		
		DecoratorInstance2 instance2 = new DecoratorInstance2();
		instance2.setName("after");
		instance2.setIDecorator(instance1);
		
		System.out.println(instance2.getMerchantInfoByCode("2", "startTime", "endTime"));
		System.out.println(instance2.getMerchantInfoById("3"));
		
		
	}

}
