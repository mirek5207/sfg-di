package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertInjectedController {

    @Qualifier("propertyGreeetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
