/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_gui.bsuir.pokos.dao.entity;

/**
 *
 * @author Vladislav
 */
public class Sneakers {
    private int ID;
    private String manufacture;
    private String country;
    private String model;
    private int size;
    private String colors;

    public Sneakers(int ID, String manufacture, String country, String model, int size, String colors) {
        this.ID = ID;
        this.manufacture = manufacture;
        this.country = country;
        this.model = model;
        this.size = size;
        this.colors = colors;
    }
    
    public Sneakers()
    {
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
    
    
}
