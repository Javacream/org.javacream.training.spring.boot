package org.javacream.store.api;

public interface StoreService {
    public int getStock(String category, String id);
    public void setStock(String category, String id, int stock);
}
