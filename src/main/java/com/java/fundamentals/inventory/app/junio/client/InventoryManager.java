package com.java.fundamentals.inventory.app.junio.client;

import com.java.fundamentals.inventory.app.junio.entities.Store;
import com.java.fundamentals.inventory.app.junio.repositories.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventory.app.junio.repositories.services.StoreService;
import com.java.fundamentals.inventory.app.junio.repositories.services.impl.StoreServiceImpl;
import java.util.Arrays;

public class InventoryManager {
    
    private static StoreService storeService = new StoreServiceImpl(new StoreRepositoryImpl());
    
    public static void main(String[] args) {
                
        //storeService = new StoreServiceImpl(new StoreRepositoryImpl());
        
        System.out.println("El argumento que se esta recibiendo es: " + args[0]);

        if(args[0].equals("findAllStores"))
            findAllStores();
        else if(args[0].equals("findById"))
            findById();
        else if(args[0].equals("updateStore"))
            updateStore();
        else
            System.out.println("No se reconoce el argumento para llamar a alguna operacion");
                
    }
    
    public static void findAllStores() {
        //StoreService storeService = new StoreServiceImpl();
        Store[] foundStores = storeService.findAll();
        
        /*for (int i = 0; i < foundStores.length; i++) {
            Store foundStore = foundStores[i];
            System.out.println("Tienda encontrada: " + foundStore);
        }*/
        for (Store foundStore : foundStores) {
            System.out.println("Tienda encontrada: " + foundStore);            
        }        
    }
    
    public static void findById() {
        //StoreService storeService = new StoreServiceImpl();
        Store foundStore = storeService.findById((short)2);
        System.out.println("La tienda encontrada es: " + foundStore);
    }
    
    public static void updateStore() {
                        
        Store storeToUpdate = storeService.findById((short)1);
        storeToUpdate.setId((short)1);
        storeToUpdate.setName("Tienda Actualizada");
        storeToUpdate.setAddress("Calle Actualizada");
        
        Store updatedStore = storeService.update(storeToUpdate);
        
        System.out.println("La tienda modificada es: " + updatedStore );
    }
}
