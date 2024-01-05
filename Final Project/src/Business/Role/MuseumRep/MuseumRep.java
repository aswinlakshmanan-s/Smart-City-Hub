/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.MuseumRep;

import Business.Role.User.User;

/**
 *
 * @author anirudh
 */
public class MuseumRep extends User {
    private int museumId;
    public MuseumRep(User u) {
        super(u); 
    }

    public int getMuseumId() {
        return museumId;
    }

    public void setMuseumId(int museumId) {
        this.museumId = museumId;
    }

    
    
    @Override
    public String getRole() {
        return "MuseumRep"; 
    }
    
}
