package org.javacream.store.impl;

import org.javacream.store.api.StoreService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class SimpleStoreService implements StoreService {
    private Map<String, Map<String, Integer>> store;

    @PostConstruct public void init(){
        store = new HashMap<>();
    }
    @Override
    public int getStock(String category, String id) {
        Map<String, Integer> ids = store.get(category);
        if(ids == null){
            return 0;
        }
        Integer result = ids.get(id);
        if (result == null){
            return 0;
        }
        return result;
    }

    @Override
    public void setStock(String category, String id, int stock) {
        Map<String, Integer> ids = store.get(category);
        if(ids == null){
            ids = new HashMap<>();
            store.put(category, ids);
        }
        ids.put(id, stock);
    }
}
