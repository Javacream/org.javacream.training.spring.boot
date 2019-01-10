package org.javacream.store.webservice.rest;

import org.javacream.store.api.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
public class StoreWebService {
    @Autowired private StoreService storeService;

    @GetMapping(path="/store/{cat}/{id}", produces = MediaType.APPLICATION_JSON_VALUE) public StoreResult retrieveStock(@PathVariable("cat") String category, @PathVariable("id") String id){
        System.out.println("retrieving stock for cat=" + category + ", id=" + id + " from path");
        return new StoreResult(storeService.getStock(category, id));
    }
    @PostMapping(path="/store", consumes = MediaType.APPLICATION_JSON_VALUE) public void setStockWithEntry(@RequestBody StoreInfo info){
        System.out.println("setting stock for cat=" + info.getCategory() + ", id=" + info.getId() + " with stock=" + info.getStock());
        storeService.setStock(info.getCategory(), info.getId(), info.getStock());
    }

}
