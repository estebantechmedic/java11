package com.java.fundamentals.inventory.app.junio.repositories;

import com.java.fundamentals.inventory.app.junio.entities.Store;

public interface StoreRepository {
    
    Store createStore(Store storeToCreate);
    
    Store findById(short storeId);
    
    Store[] findAll();
    
    Store updateStore(Store storeToUpdate);
        
    void deleteStore(short storeId);
    
}
