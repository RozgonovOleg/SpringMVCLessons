package com.example.servingwebcontent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationMailSender {
	@Autowired
	private JavaMailSender mailSender;
	@Value("${spring.mail.username}")
	private String username;

	public void send(String emailTo, String subject, String message) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		
		//mailMessage.setFrom("username");
		mailMessage.setTo("vawow15316@4qmail.com");
		mailMessage.setSubject(subject);
		mailMessage.setText(message);
		
		mailSender.send(mailMessage);
	}

}
