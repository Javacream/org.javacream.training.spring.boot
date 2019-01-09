package org.javacream.jpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@SpringBootApplication
public class SimpleJpaApplication {

    public static void main(String[] args){
        SpringApplication.run(SimpleJpaApplication.class);
    }

}
