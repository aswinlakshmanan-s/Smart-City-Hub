/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Shop;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class ShopDirectory {
    
    ArrayList<Shop> shopList = new ArrayList<>();

    public ArrayList<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(ArrayList<Shop> shopList) {
        this.shopList = shopList;
    }

    public ArrayList<Shop> shopsForACity(String city) {
        ArrayList<Shop> shops = new ArrayList<>();
        for(Shop shop: shopList)
        {
            if(shop.getLocation().equals(city))
                shops.add(shop);
                
        }
        return shops;
    }

    public Shop getCompanyByName(String shopName) {
        for(Shop shop: shopList)
        {
            if(shop.getName().equals(shopName))
            {
                return shop;
            }
        }
        return null;
    }


    
    
    
}
