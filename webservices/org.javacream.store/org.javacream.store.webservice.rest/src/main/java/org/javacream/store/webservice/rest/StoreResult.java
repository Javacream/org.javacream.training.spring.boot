package org.javacream.store.webservice.rest;


public class StoreResult {
    private int stock;

    public StoreResult(int stock) {
        this.stock = stock;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
