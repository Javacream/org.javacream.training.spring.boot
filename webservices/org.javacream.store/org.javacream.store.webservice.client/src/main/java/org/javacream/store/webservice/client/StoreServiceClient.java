package org.javacream.store.webservice.client;

import org.javacream.store.webservice.rest.StoreResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class StoreServiceClient {

    @Autowired  private RestTemplate restTemplate;

    @PostConstruct public void init(){
        StoreResult result = restTemplate.getForObject("http://localhost:8080/store/books/ISBN1", StoreResult.class);
        System.out.println("STOCK: " + result.getStock());
    }
}
