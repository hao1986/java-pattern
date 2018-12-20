package pattern.Factory;

import pattern.Factory.service.Provider;

public class MailProvider implements Provider {

	@Override
	public String getSender() {
		MailSender mailSender = new MailSender();
		return mailSender.send();
	}

}
