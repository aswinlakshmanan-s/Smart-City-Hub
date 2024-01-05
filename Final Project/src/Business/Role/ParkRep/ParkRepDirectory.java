/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.ParkRep;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class ParkRepDirectory {
    
        ArrayList <ParkRep> parkRepList = new ArrayList<>();

    public ArrayList<ParkRep> getParkRepList() {
        return parkRepList;
    }

    public void setParkRepList(ArrayList<ParkRep> parkRepList) {
        this.parkRepList = parkRepList;
    }
    
        public ParkRep canLogin(String username, String password)
    {
        for(ParkRep rep: parkRepList)
        {
            if(rep.getUsername().equals(username) && rep.getPassword().equals(password))
            {
                return rep;
            }
        }
        return null;
    }
        
        

}
