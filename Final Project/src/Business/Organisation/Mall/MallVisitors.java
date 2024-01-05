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
public class MallVisitors {

ArrayList<MallVisitor> visitorList = new ArrayList<>();

    public ArrayList<MallVisitor> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(ArrayList<MallVisitor> visitorList) {
        this.visitorList = visitorList;
    }
    
    public ArrayList<MallVisitor> getVissitorsForMall(int id)
    {
        ArrayList<MallVisitor> specificMallVisitors = new ArrayList<>();
        for(MallVisitor visitor: visitorList)
        {
            if(visitor.getMallId() == id)
                specificMallVisitors.add(visitor);
        }
        return specificMallVisitors;
    }


    
    
}
