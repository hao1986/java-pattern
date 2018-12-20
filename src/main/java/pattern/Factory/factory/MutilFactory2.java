package pattern.Factory.factory;

import pattern.Factory.FtpSender;

public class MutilFactory2 {
	
	public String getSender(){
		FtpSender ftpSender = new FtpSender();
		return ftpSender.send();
	}

}
