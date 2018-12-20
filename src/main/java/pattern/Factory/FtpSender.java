package pattern.Factory;

import pattern.Factory.service.Sender;

public class FtpSender implements Sender {

	@Override
	public String send() {
		System.out.println("FtpSender----");
		return "FtpSender";
	}

}
