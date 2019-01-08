package org.javacream.store.webservice.rest;

import org.javacream.store.api.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreWebService {

    @Autowired private StoreService storeService;

    @GetMapping(path="/store/{cat}/{id}", produces = "text/plain") public int retrieveStock(@PathVariable("cat") String category, @PathVariable("id") String id){
        System.out.println("retrieving stock for cat=" + category + ", id=" + id + " from path");
        return storeService.getStock(category, id);
    }
    @GetMapping(path="/store/{cat}/{id}", produces = "text/html") public String retrieveStock2(@PathVariable("cat") String category, @PathVariable("id") String id){
        System.out.println("retrieving stock for cat=" + category + ", id=" + id + " from path and produces text/html");
        return "" + storeService.getStock(category, id);
    }

    @GetMapping(path="/store") public int retrieveStockWithQueryParams(@RequestParam("cat") String category, @RequestParam("id") String id){
        System.out.println("retrieving stock for cat=" + category + ", id=" + id + " from query");
        return storeService.getStock(category, id);
    }


}
