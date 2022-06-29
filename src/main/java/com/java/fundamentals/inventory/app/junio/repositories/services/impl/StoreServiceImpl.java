package com.java.fundamentals.inventory.app.junio.repositories.services.impl;

import com.java.fundamentals.inventory.app.junio.entities.Store;
import com.java.fundamentals.inventory.app.junio.repositories.StoreRepository;
import com.java.fundamentals.inventory.app.junio.repositories.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventory.app.junio.repositories.services.StoreService;

public class StoreServiceImpl implements StoreService {
    
    private StoreRepository storeRepository;
    
    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store[] findAll() {                
        return storeRepository.findAll();
    }

    @Override
    public Store findById(short storeId) {        
        return storeRepository.findById(storeId);
    }

    @Override
    public Store update(Store storeToUpdate) {
        return storeRepository.updateStore(storeToUpdate);
    }
            
}
