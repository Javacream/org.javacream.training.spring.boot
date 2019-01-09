package org.javacream.store.webservice.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StoreServiceClientStarter {
    public static void main(String[] args){
        SpringApplication.run(StoreServiceClientStarter.class);
    }

    @Bean public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
