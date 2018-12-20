package pattern.decorator;

public class DecoratorInstance1 implements IDecorator {
	
	private String type;
	
	public DecoratorInstance1() {
		System.out.println("init DecoratorInstance1");
	}
	
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getMerchantInfoById(String id) {
		System.out.println("DecoratorInstance1 getMerchantInfoById " + type);
		return "DecoratorInstance1 getMerchantInfoById";
	}

	@Override
	public String getMerchantInfoByCode(String code, String startTime, String endTime) {
		System.out.println("DecoratorInstance1 getMerchantInfoByCode " + type);
		return "DecoratorInstance1 getMerchantInfoByCode";
	}

	@Override
	public String getMerchantInfoByTime(String startTime, String endTime) {
		System.out.println("DecoratorInstance1 getMerchantInfoByTime " + type);
		return "DecoratorInstance1 getMerchantInfoByTime";
	}

}
