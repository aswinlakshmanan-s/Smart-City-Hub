/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.HotelRep;

import Business.Organisation.HotelOrganisation.HotelReservation;
import Business.Organisation.HotelOrganisation.HotelReservations;
import Business.Role.User.User;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author anirudh
 */
public class HotelRep extends User {
    private int hotelId;
    public HotelRep(User u) {
        super(u); 
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public ArrayList<HotelReservation> listReservations(HotelReservations allReservations) {
    // Filter the list of all reservations to only include those for this rep's hotel
    return (ArrayList<HotelReservation>) allReservations.getReservationList().stream()
            .filter(reservation -> reservation.getRestaurantId() == this.hotelId)
            .collect(Collectors.toList());
    }
    
    
    @Override
    public String getRole() {
        return "HotelRep"; 
    }
    
}
