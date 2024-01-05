/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.BeverageRep;

import Business.Organisation.Beverage.Reservation;
import Business.Organisation.Beverage.Reservations;
import Business.Role.User.User;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author anirudh
 */
public class BeverageRep extends User {

    private int beverageCompany;
    
    
    public BeverageRep(User u) {
        super(u); 
    }

    public int getBeverageCompany() {
        return beverageCompany;
    }

    public void setBeverageCompany(int beverageCompany) {
        this.beverageCompany = beverageCompany;
    }
    
        public ArrayList<Reservation> listReservations(Reservations allReservations) {
    // Filter the list of all reservations to only include those for this rep's hotel
    return (ArrayList<Reservation>) allReservations.getReservationList().stream()
            .filter(reservation -> reservation.getBeverageCompanyId()== this.beverageCompany)
            .collect(Collectors.toList());
    }

    
    
    @Override
    public String getRole() {
        return "BeverageRep"; 
    }
}
