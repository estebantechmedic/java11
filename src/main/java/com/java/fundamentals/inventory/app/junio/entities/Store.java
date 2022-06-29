package com.java.fundamentals.inventory.app.junio.entities;

public class Store {
    
    private short id;
    private String name;
    private String address;
    private boolean status;
    private String administratorName;
    private Inventory inventory;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Store{" + "id=" + id + ", name=" + name + ", address=" + address + ", status=" + status + ", administratorName=" + administratorName + ", inventory=" + inventory + '}';
    }
    
    
    
}
