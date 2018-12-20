package pattern.decorator;

public abstract class AbstractDecorator implements IDecorator {
	
	private IDecorator iDecorator;
	
	public void setIDecorator(IDecorator iDecorator) {
		this.iDecorator = iDecorator;
	}

	@Override
	public String getMerchantInfoById(String id) {
		System.out.println("AbstractDecorator getMerchantInfoById");
		return iDecorator.getMerchantInfoById(id);
	}

	@Override
	public String getMerchantInfoByCode(String code, String startTime, String endTime) {
		System.out.println("AbstractDecorator getMerchantInfoByCode");
		return iDecorator.getMerchantInfoByCode(code, startTime, endTime);
	}

	@Override
	public String getMerchantInfoByTime(String startTime, String endTime) {
		System.out.println("AbstractDecorator getMerchantInfoByTime");
		return iDecorator.getMerchantInfoByTime(startTime, endTime);
	}

}
