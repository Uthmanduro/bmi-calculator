package com.example.bmi_calculator.controller;

import com.example.bmi_calculator.model.Bmi;
import com.example.bmi_calculator.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.bmi_calculator.model.Person;

@RestController
public class UserController {

    private userService service;

    @Autowired
    public UserController(userService service) {
        this.service = service;
    }

    @PostMapping("/calculate-bmi")
    public Bmi calculateBMI(@RequestBody Person person) {
        return service.calculateBMI(person);
    }
}
