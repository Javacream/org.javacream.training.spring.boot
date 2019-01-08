package org.javacream.store.webservice.rest;

import org.javacream.store.api.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class StoreWebService {

    @Autowired private StoreService storeService;

    @GetMapping(path="/store/{cat}/{id}", produces = MediaType.APPLICATION_JSON_VALUE) public StoreResult retrieveStock(@PathVariable("cat") String category, @PathVariable("id") String id){
        System.out.println("retrieving stock for cat=" + category + ", id=" + id + " from path");
        return new StoreResult(storeService.getStock(category, id));
    }

    @GetMapping(path="/store") public int retrieveStockWithQueryParams(@RequestParam("cat") String category, @RequestParam("id") String id){
        System.out.println("retrieving stock for cat=" + category + ", id=" + id + " from query");
        return storeService.getStock(category, id);
    }

    @PostMapping(path="/store/{cat}/{id}/{stock}") public void setStock(@PathVariable("cat") String category, @PathVariable("id") String id, @PathVariable("stock") int stock){
        System.out.println("setting stock for cat=" + category + ", id=" + id + " with stock=" + stock);
        storeService.setStock(category, id, stock);
    }
    @PostMapping(path="/store", consumes = MediaType.APPLICATION_JSON_VALUE) public void setStockWithEntry(@RequestBody StoreInfo info){
        System.out.println("setting stock for cat=" + info.getCategory() + ", id=" + info.getId() + " with stock=" + info.getStock());
        storeService.setStock(info.getCategory(), info.getId(), info.getStock());
    }

}
