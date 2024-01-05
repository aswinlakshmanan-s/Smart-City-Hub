/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.TheatreRep;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class TheatreRepDirectory {
    
        ArrayList <TheatreRep> theatreRepList = new ArrayList<>();

    public ArrayList<TheatreRep> getTheatreRepList() {
        return theatreRepList;
    }

    public void setTheatreRepList(ArrayList<TheatreRep> theatreRepList) {
        this.theatreRepList = theatreRepList;
    }
    
    public TheatreRep canLogin(String username, String password)
    {
        for(TheatreRep rep: theatreRepList)
        {
            if(rep.getUsername().equals(username) && rep.getPassword().equals(password))
            {
                return rep;
            }
        }
        return null;
    }
        
        

    
}
