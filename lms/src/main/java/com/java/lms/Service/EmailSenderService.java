package com.java.lms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.java.lms.Repository.register_organizationRepository;
import com.java.lms.entity.Register_Organization;

@Service
public class EmailSenderService {

    @Autowired
    register_organizationRepository repository;

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail, String subject, String body) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("devarshjoshi7@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);
        System.out.println("Mail Send Successfully....");
    }
}
