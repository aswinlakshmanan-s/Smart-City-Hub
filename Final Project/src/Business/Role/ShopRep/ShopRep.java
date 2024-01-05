/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.ShopRep;

import Business.Role.User.User;

/**
 *
 * @author anirudh
 */
public class ShopRep extends User {
    private int shopId;
    public ShopRep(User u) {
        super(u); 
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    
    
    

    @Override
    public String getRole() {
        return "ShopRep"; 
    }
    
}
