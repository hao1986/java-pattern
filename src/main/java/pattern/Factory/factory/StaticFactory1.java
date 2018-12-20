package pattern.Factory.factory;

import pattern.Factory.MailSender;

public class StaticFactory1 {
	
	public static String getSender() {
		MailSender mailSender = new MailSender();
		return mailSender.send();
	}

}
