/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.ShopRep;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class ShopRepDirectory {
    
        ArrayList <ShopRep> shopRepList = new ArrayList<>();

    public ArrayList<ShopRep> getShopRepList() {
        return shopRepList;
    }

    public void setShopRepList(ArrayList<ShopRep> shopRepList) {
        this.shopRepList = shopRepList;
    }
    

    public ShopRep canLogin(String username, String password)
    {
        for(ShopRep rep: shopRepList)
        {
            if(rep.getUsername().equals(username) && rep.getPassword().equals(password))
            {
                return rep;
            }
        }
        return null;
    }    
        

    
}
