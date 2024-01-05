/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.HotelOrganisation;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class HotelReservations {
    
    ArrayList <HotelReservation> reservationList = new ArrayList<>();

    public ArrayList<HotelReservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(ArrayList<HotelReservation> reservationList) {
        this.reservationList = reservationList;
    }
    
    
    
}
