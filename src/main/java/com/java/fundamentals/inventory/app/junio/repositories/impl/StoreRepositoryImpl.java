package com.java.fundamentals.inventory.app.junio.repositories.impl;

import com.java.fundamentals.inventory.app.junio.entities.Store;
import com.java.fundamentals.inventory.app.junio.repositories.StoreRepository;

public class StoreRepositoryImpl implements StoreRepository {
    
    private Store[] stores = new Store[3];
    
    public StoreRepositoryImpl() {
        
        Store store1 = new Store();
        store1.setId((short)1);
        store1.setName("Tienda1");
        store1.setAddress("Calle 1");
        store1.setStatus(true);
        
        stores[0] = store1;
        
        Store store2 = new Store();
        store2.setId((short)2);
        store2.setName("Tienda2");
        store2.setAddress("Calle 2");
        store2.setStatus(true);
        
        stores[1] = store2;
        
        Store store3 = new Store();
        store3.setId((short)3);
        store3.setName("Tienda3");
        store3.setAddress("Calle 3");
        store3.setStatus(true);
        
        stores[2] = store3;
        
    }

    @Override
    public Store createStore(Store storeToCreate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Store findById(short storeId) {
        
        Store foundStore = null;
        for (Store store : stores) {
            if(store.getId() == storeId) {
                foundStore = store;
                break;
            }            
        }
        return foundStore;               
    }

    @Override
    public Store[] findAll() {
        return stores;        
    }

    @Override
    public Store updateStore(Store storeToUpdate) {
        Store foundStore = findById(storeToUpdate.getId());
        foundStore.setName(storeToUpdate.getName());
        foundStore.setAddress(storeToUpdate.getAddress());
        //foundStore.setStatus(storeToUpdate.getStatus());
        
        return foundStore;
    }

    @Override
    public void deleteStore(short storeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
}
