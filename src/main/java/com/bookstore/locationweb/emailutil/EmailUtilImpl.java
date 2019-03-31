package com.bookstore.locationweb.emailutil;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;


@Component
public class EmailUtilImpl implements EmailUtil{
	
	@Autowired
	private JavaMailSenderImpl sender;

	@Override
	public void sendEmail(String toAddress, String subject, String body) {
		// TODO Auto-generated method stub
		
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper= new MimeMessageHelper(message);
		try {
			helper.setTo(toAddress);
			helper.setText(body);
			helper.setSubject(subject);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sender.send(message);
		
	}

}
