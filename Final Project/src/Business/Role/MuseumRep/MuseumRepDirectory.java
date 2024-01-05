/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.MuseumRep;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class MuseumRepDirectory {
    
        ArrayList <MuseumRep> museumRepList = new ArrayList<>();

    public ArrayList<MuseumRep> getMuseumRepList() {
        return museumRepList;
    }

    public void setMuseumRepList(ArrayList<MuseumRep> museumRepList) {
        this.museumRepList = museumRepList;
    }
    
    
    public MuseumRep canLogin(String username, String password)
    {
        for(MuseumRep rep: museumRepList)
        {
            if(rep.getUsername().equals(username) && rep.getPassword().equals(password))
            {
                return rep;
            }
        }
        return null;
    }
        
        

    
}
