/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.HotelOrganisation;

import java.util.HashMap;

/**
 *
 * @author anirudh
 */
public class Hotel {
    
    private int id;
    private String name;
    private String location;
    private String address;
    private String cuisine;
    HashMap <String, Float> foodMenu;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public HashMap<String, Float> getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(HashMap<String, Float> foodMenu) {
        this.foodMenu = foodMenu;
    }
    
    
    
}
