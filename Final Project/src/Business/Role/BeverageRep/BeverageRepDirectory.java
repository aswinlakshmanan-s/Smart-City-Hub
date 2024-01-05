/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.BeverageRep;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class BeverageRepDirectory {
    
    public static BeverageRep currentRep;
    
    ArrayList <BeverageRep> beverageRepList = new ArrayList<>();

    public ArrayList<BeverageRep> getBeverageRepList() {
        return beverageRepList;
    }

    public void setBeverageRepList(ArrayList<BeverageRep> beverageRepList) {
        this.beverageRepList = beverageRepList;
    }
    
    public BeverageRep canLogin(String username, String password)
    {
        for(BeverageRep rep: beverageRepList)
        {
            if(rep.getUsername().equals(username) && rep.getPassword().equals(password))
            {
                return rep;
            }
        }
        return null;
    }

    public BeverageRep returnRepforBeverageCompany(int id) {
        
        for(BeverageRep rep: beverageRepList)
        {
            if(rep.getBeverageCompany() == id)
            {
                return rep;
            }
        }
        return null;
    }
    
    
    
}
