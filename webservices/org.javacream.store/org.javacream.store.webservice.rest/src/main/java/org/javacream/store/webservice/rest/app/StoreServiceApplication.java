package org.javacream.store.webservice.rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.javacream.store")
public class StoreServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(StoreServiceApplication.class);
    }
}
