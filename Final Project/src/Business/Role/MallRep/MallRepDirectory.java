/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.MallRep;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class MallRepDirectory {
    
        ArrayList <MallRep> mallRepList = new ArrayList<>();
      public static MallRep currentMallRep;
    public ArrayList<MallRep> getMallRepList() {
        return mallRepList;
    }

    public void setMallRepList(ArrayList<MallRep> mallRepList) {
        this.mallRepList = mallRepList;
    }
    
            public MallRep canLogin(String username, String password)
    {
        for(MallRep rep: mallRepList)
        {
            if(rep.getUsername().equals(username) && rep.getPassword().equals(password))
            {
                return rep;
            }
        }
        return null;
    }

    public MallRep returnRepforBeverageCompany(int id) {
        
        for(MallRep rep: mallRepList)
        {
            if(rep.getMallId() == id)
            {
                return rep;
            }
        }
        return null;
        
        
    }
        
        

    
}
