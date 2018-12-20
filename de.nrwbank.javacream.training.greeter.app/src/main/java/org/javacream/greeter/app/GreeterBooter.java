package org.javacream.greeter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.javacream.greeter")
public class GreeterBooter {

    public static void main(String[] args){
        SpringApplication.run(GreeterBooter.class);
    }
}
