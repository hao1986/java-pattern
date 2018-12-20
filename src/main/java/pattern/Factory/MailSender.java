package pattern.Factory;

import pattern.Factory.service.Sender;

public class MailSender implements Sender {

	@Override
	public String send() {
		System.out.println("mailSender----");
		return "mailSender";
	}

}
