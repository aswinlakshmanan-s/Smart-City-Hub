/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.VehicleRep;

import Business.Role.User.User;

/**
 *
 * @author anirudh
 */
public class VehicleRep extends User {
    private int companyId;
    public VehicleRep(User u) {
        super(u); 
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    
    
    @Override
    public String getRole() {
        return "VehicleRep"; 
    }
    
    
}
