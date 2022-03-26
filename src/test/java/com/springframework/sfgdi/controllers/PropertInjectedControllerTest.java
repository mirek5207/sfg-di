package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertInjectedControllerTest {
    PropertInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new PropertInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}