package com.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreeetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello, it is property";
    }
}
