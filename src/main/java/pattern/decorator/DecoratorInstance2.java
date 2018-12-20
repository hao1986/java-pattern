package pattern.decorator;

public class DecoratorInstance2 extends AbstractDecorator {
	
	private String name;
	
	public DecoratorInstance2() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getMerchantInfoByCode(String code, String startTime, String endTime) {
		System.out.println("DecoratorInstance2 getMerchantInfoByCode ");
		return name;
	}
}
