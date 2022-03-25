package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertInjectedControllerTest {
    PropertInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new PropertInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}