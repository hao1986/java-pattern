package pattern.Factory.factory;

import pattern.Factory.FtpSender;

public class StaticFactory2 {
	
	public static String getSender(){
		FtpSender ftpSender = new FtpSender();
		return ftpSender.send();
	}

}
