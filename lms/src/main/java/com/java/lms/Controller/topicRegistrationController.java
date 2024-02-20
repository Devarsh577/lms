package com.java.lms.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.lms.Repository.topicRegistration_Repository;
import com.java.lms.Service.topicRegistrationService;
import com.java.lms.entity.Topic_Registration;

@Controller
public class topicRegistrationController {

    @Autowired
    topicRegistrationService tService;

    @Autowired
    topicRegistration_Repository tRepository;

    @GetMapping("/topic")
    public ResponseEntity<List<Topic_Registration>> getRegistered() {

        List<Topic_Registration> register = tService.getAlltopicRegister();

        System.out.println(register);
        if (register.size() <= 0) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(register);

    }
}
