package org.javacream.store.impl;

import org.javacream.store.api.StoreService;
import org.springframework.stereotype.Service;

@Service
public class SimpleStoreService implements StoreService {
    @Override
    public int getStock(String category, String id) {
        return 42;
    }
}
