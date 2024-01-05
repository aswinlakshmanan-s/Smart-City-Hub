/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.MarketAnalyst;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class MarketAnalystDirectory {
    
    ArrayList<MarketAnalyst> analystList = new ArrayList<>();

    public ArrayList<MarketAnalyst> getAnalystList() {
        return analystList;
    }

    public void setAnalystList(ArrayList<MarketAnalyst> analystList) {
        this.analystList = analystList;
    }
    
        public MarketAnalyst canLogin(String username, String password)
    {
        for(MarketAnalyst rep: analystList)
        {
            if(rep.getUsername().equals(username) && rep.getPassword().equals(password))
            {
                return rep;
            }
        }
        return null;
    } 
    
}
