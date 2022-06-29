package com.java.fundamentals.inventory.app.junio.entities;

public class Item {
    
    private Product product;
    private float currentQuantity;
    private float minimumRequired;  
    private Store store;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(float currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public float getMinimumRequired() {
        return minimumRequired;
    }

    public void setMinimumRequired(float minimumRequired) {
        this.minimumRequired = minimumRequired;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
        
}
