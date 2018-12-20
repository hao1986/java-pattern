package pattern.Factory;

import pattern.Factory.service.Provider;

public class FtpProvider implements Provider {

	@Override
	public String getSender() {
		FtpSender ftpSender = new FtpSender();
		return ftpSender.send();
	}

}
