package org.javacream.greeter.app;

import org.javacream.greeter.api.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class GreeterApplication {
    @Autowired
    private GreeterService greeterService;

    @PostConstruct private void start(){
        System.out.println(greeterService.greet("Hugo"));
    }
}
