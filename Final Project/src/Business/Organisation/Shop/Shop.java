/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Shop;

import java.util.HashMap;

/**
 *
 * @author anirudh
 */
public class Shop {
    
    private int id;
    private String name;
    private String location;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
//    private String category;
    HashMap<String, Float> shopMenu;

    public HashMap<String, Float> getShopMenu() {
        return shopMenu;
    }

    public void setShopMenu(HashMap<String, Float> shopMenu) {
        this.shopMenu = shopMenu;
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

//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
    
    
    
}
