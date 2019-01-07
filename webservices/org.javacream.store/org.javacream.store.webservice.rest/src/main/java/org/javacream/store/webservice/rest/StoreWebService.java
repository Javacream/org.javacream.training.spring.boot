package org.javacream.store.webservice.rest;

import org.javacream.store.api.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreWebService {

    @Autowired private StoreService storeService;

    @GetMapping(path="/store") public int retrieveStock(){
        return storeService.getStock("dies", "das");
    }
}
