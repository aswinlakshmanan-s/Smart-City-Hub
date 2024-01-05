/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Police;

import Business.Organisation.HotelOrganisation.Hotel;
import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class PoliceDepartmentDirectory {
    
    ArrayList<PoliceDepartment> departmentList = new ArrayList<>();

    public ArrayList<PoliceDepartment> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<PoliceDepartment> departmentList) {
        this.departmentList = departmentList;
    }

    public ArrayList<PoliceDepartment> policeForACity(String city) {
        ArrayList<PoliceDepartment> pds = new ArrayList<>();
        for(PoliceDepartment pd : departmentList)
        {
            if(pd.getLocation().equals(city))
                pds.add(pd);
                
        }
        return pds;
    }

    public PoliceDepartment getDepByName(String depName) {
    for(PoliceDepartment pd : departmentList)
    {
        if(pd.getName().equals(depName))
            return pd;

    }
    return null;
    }
    
    
    
}
