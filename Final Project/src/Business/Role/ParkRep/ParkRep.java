/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.ParkRep;

import Business.Role.User.User;

/**
 *
 * @author anirudh
 */
public class ParkRep extends User {
    private int parkId;
    public ParkRep(User u) {
        super(u); 
    }

    public int getParkId() {
        return parkId;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
    }
    
    

    @Override
    public String getRole() {
        return "ParkRep"; 
    }
    
}
