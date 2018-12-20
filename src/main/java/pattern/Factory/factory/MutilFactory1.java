package pattern.Factory.factory;

import pattern.Factory.MailSender;

public class MutilFactory1 {
	
	public String getSender(){
		MailSender mailSender = new MailSender();
		return mailSender.send();
		
	}

}
