/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.TheatreRep;

import Business.Role.User.User;

/**
 *
 * @author anirudh
 */
public class TheatreRep extends User {
    private int theatreId;
    public TheatreRep(User u) {
        super(u); 
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    
    
    @Override
    public String getRole() {
        return "TheatreRep"; 
    }
}
