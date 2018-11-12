package com.activenture.mib.config;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

@Component
public class MailClient {
	
	@Autowired
	private JavaMailSender mailSender;
	 
	
	
	public void preparedAndSendMail(String recipient, String body) throws MessagingException {
		MimeMessageHelper helper;
		MimeMessage msg=mailSender.createMimeMessage();
		
		helper=new MimeMessageHelper(msg, true);
		helper.setSubject("Test Subject");
		helper.setTo(recipient);
		helper.setText(body, true);
		
		mailSender.send(msg);
		
	}

}
