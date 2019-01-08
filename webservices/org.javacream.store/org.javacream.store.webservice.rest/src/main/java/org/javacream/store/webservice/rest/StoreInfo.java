package org.javacream.store.webservice.rest;

public class StoreInfo {
    private String category;
    private String id;
    private int stock;

    public StoreInfo(){

    }
    public StoreInfo(String category, String id, int stock) {
        this.category = category;
        this.id = id;
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
