package com.java.lms.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.lms.Repository.register_organizationRepository;

import com.java.lms.Service.RegisterOrganizationService;

import com.java.lms.entity.Register_Organization;

@Controller
public class RegisterOrganizationController {

    @Autowired
    register_organizationRepository register_organizationRepository;

    @Autowired
    RegisterOrganizationService rOrganizationService;

    @GetMapping("/register")
    public ResponseEntity<List<Register_Organization>> getRegistered() {

        List<Register_Organization> register = rOrganizationService.getAllRegister_Organization();
        Date date = new Date();

        
        System.out.println(register);
        if (register.size() <= 0) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(register);

    }
}
