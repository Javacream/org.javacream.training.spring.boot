package org.javacream.training.webservices.rest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@Scope("request")
public class PingWebService {
    @Autowired private PingBusiness pingBusiness;
    @PostConstruct public void init(){
        System.out.println("initializing " + this);
    }

    @GetMapping(path = "/ping")
    public String ping(){
        return pingBusiness.ping() + " served by " + this;
    }

    @GetMapping(path = "/pong")
    public String pong(){
        return pingBusiness.pong() + " served by " + this;
    }

}
