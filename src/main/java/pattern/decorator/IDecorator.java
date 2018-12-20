package pattern.decorator;

public interface IDecorator {
	
	String getMerchantInfoById(String id);
	
	String  getMerchantInfoByCode(String code, String startTime, String endTime);
	
	String getMerchantInfoByTime(String startTime, String endTime);

}
