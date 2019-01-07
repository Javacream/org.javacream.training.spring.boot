package org.javacream.training.webservices.rest.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Scope("singleton")
public class PingBusiness {
    @PostConstruct
    public void init(){
        System.out.println("initializing " + this);
    }

    public String ping(){
        return "Ping calculated from " + this;
    }

    public String pong(){
        return "Pong calculated from " + this;
    }

}
