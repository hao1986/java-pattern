package pattern.Factory.factory;

import org.apache.commons.lang.StringUtils;

import pattern.Factory.FtpSender;
import pattern.Factory.MailSender;

public class NormalFactory {
	
	public String getSender(String type) {
		if(StringUtils.isNotEmpty(type)){
			if("mail".equals(type)){
				MailSender mailSender = new MailSender();
				return mailSender.send();
			}else if("ftp".equals(type)){
				FtpSender ftpSender = new FtpSender();
				return ftpSender.send();
			}
		}
		return null;
	}

}
