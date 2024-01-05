/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.PoliceRep;

import Business.Role.User.User;

/**
 *
 * @author anirudh
 */
public class PoliceRep extends User{
    private int departmentId;
    public PoliceRep(User u) {
        super(u); 
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    
    

    @Override
    public String getRole() {
        return "PoliceRep"; 
    }
    
}
