/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.HotelOrganisation;

//import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anirudh
 */
public class HotelDirectory {
    
    ArrayList <Hotel> hotelList = new ArrayList<>();

    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(ArrayList<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
    
        private static Hotel findHotelById(List<Hotel> hotels, int hotelId) {
        for (Hotel hotel : hotels) {
            if (hotel.getId() == hotelId) {
                return hotel;
            }
        }
        return null;
    }
        
        
        public ArrayList<Hotel> hotelsForACity(String city)
        {
            ArrayList<Hotel> hotelsList = new ArrayList<>();
            for(Hotel hotel: hotelList)
            {
                if(hotel.getLocation().equals(city))
                    hotelsList.add(hotel);
                
            }
            return hotelsList;
        }
        
        
        public Hotel getHotelByName(String name)
        {
            for(Hotel hotel: hotelList)
            {
                if(hotel.getName().equals(name))
                    return hotel;
            }
            return null;
        }
        
        

    
    
    
}
