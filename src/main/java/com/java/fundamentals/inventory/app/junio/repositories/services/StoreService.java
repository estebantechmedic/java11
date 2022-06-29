package com.java.fundamentals.inventory.app.junio.repositories.services;

import com.java.fundamentals.inventory.app.junio.entities.Store;

public interface StoreService {
    
    Store[] findAll();    
    Store findById(short storeId);  
    Store update(Store storeToUpdate);
    
}
