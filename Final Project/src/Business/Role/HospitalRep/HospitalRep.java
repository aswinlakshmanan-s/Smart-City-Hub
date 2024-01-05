/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.HospitalRep;

import Business.Role.User.User;

/**
 *
 * @author anirudh
 */
public class HospitalRep extends User {
    private int hospitalId;
    public HospitalRep(User u) {
        super(u); 
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }
    
    

    @Override
    public String getRole() {
        return "HospitalRep"; 
    }
    
}
