/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Beverage;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author anirudh
 */
public class BeverageCompany {
    
    private int id;
    private String name;
    HashMap <String, Float> beverageMenu;
    private String location;
    private String address;
    private String specialty;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Float> getBeverageMenu() {
        return beverageMenu;
    }

    public void setBeverageMenu(HashMap<String, Float> beverageMenu) {
        this.beverageMenu = beverageMenu;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
        public void updateBeveragePrice(String beverageName, float newPrice) {
        if (beverageMenu.containsKey(beverageName)) {
            beverageMenu.put(beverageName, newPrice);
        } else {
            System.out.println("Beverage not found in the menu");
        }
    }
    
    
    
    
}
