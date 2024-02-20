package com.java.lms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.lms.Repository.register_organizationRepository;

import com.java.lms.entity.Register_Organization;

@Component
public class RegisterOrganizationService {

    @Autowired
    register_organizationRepository roRepository;

    public List<Register_Organization> getAllRegister_Organization() {

        List<Register_Organization> list = (List<Register_Organization>) this.roRepository.findAll();

        return list;

    }


   

}
