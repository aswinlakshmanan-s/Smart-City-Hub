/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Mall;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class MallDirectory {
    ArrayList <Mall> mallList = new ArrayList<>();

    public ArrayList<Mall> getMallList() {
        return mallList;
    }

    public void setMallList(ArrayList<Mall> mallList) {
        this.mallList = mallList;
    }

    public ArrayList<Mall> mallsForACity(String city)
        {
            ArrayList<Mall> mallsList = new ArrayList<>();
            for(Mall mall: mallList)
            {
                if(mall.getLocation().equals(city))
                    mallsList.add(mall);
                
            }
            return mallsList;
        }
        
        
        public Mall getCompanyByName(String name)
        {
            for(Mall mall: mallList)
            {
                if(mall.getName().equals(name))
                    return mall;
            }
            return null;
        }
        
        public Mall getCompanyById(int id)
        {
            for(Mall mall: mallList)
            {
                if(mall.getId() == id)
                    return mall;
            }
            return null;
        }
    
    
    
}
