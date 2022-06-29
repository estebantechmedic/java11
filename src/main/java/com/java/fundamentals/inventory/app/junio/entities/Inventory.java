package com.java.fundamentals.inventory.app.junio.entities;

public class Inventory {
    
    private String codigo;
    private Item[] items;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
    
    
    
}
