/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.HotelRep;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class HotelRepDirectory {
    
        ArrayList <HotelRep> hotelRepList = new ArrayList<>();
        public static HotelRep currentHotelRep;

    public ArrayList<HotelRep> getHotelRepList() {
        return hotelRepList;
    }

    public void setHotelRepList(ArrayList<HotelRep> hotelRepList) {
        this.hotelRepList = hotelRepList;
    }
    
        public HotelRep canLogin(String username, String password)
    {
        for(HotelRep rep: hotelRepList)
        {
            if(rep.getUsername().equals(username) && rep.getPassword().equals(password))
            {
                return rep;
            }
        }
        return null;
    }
        
    public HotelRep returnRepforHotel(int id)
    {
        for(HotelRep rep: hotelRepList)
        {
            if(rep.getHotelId() == id)
            return rep;
        }
        return null;
    }
        
        

    
}
