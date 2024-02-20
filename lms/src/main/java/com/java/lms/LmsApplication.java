package com.java.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.java.lms.Service.EmailSenderService;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class LmsApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

	

	
}
