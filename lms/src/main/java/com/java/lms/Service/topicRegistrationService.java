package com.java.lms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.lms.Repository.topicRegistration_Repository;
import com.java.lms.entity.Topic_Registration;

@Component
public class topicRegistrationService {

    @Autowired
    topicRegistration_Repository tRepository;

    public List<Topic_Registration> getAlltopicRegister() {

        List<Topic_Registration> list = (List<Topic_Registration>) this.tRepository.findAll();

        return list;

    }
}
