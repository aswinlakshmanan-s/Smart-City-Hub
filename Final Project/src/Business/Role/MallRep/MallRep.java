/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.MallRep;

import Business.Role.User.User;

/**
 *
 * @author anirudh
 */
public class MallRep extends User{
    private int mallId;
    public MallRep(User u) {
        super(u); 
    }

    public int getMallId() {
        return mallId;
    }

    public void setMallId(int mallId) {
        this.mallId = mallId;
    }
    
    

    @Override
    public String getRole() {
        return "MallRep"; 
    }
    
}
