/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.HospitalRep;

import Business.Organisation.Hospital.Appointment;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class HospitalRepDirectory {
        ArrayList <HospitalRep> hospitalRepList = new ArrayList<>();
        public static HospitalRep currentHospitalRep;

    public ArrayList<HospitalRep> getHospitalRepList() {
        return hospitalRepList;
    }

    public void setHospitalRepList(ArrayList<HospitalRep> hospitalRepList) {
        this.hospitalRepList = hospitalRepList;
    }
        
    
    public HospitalRep canLogin(String username, String password)
    {
        for(HospitalRep rep: hospitalRepList)
        {
            if(rep.getUsername().equals(username) && rep.getPassword().equals(password))
            {
                return rep;
            }
        }
        return null;
    }

    public HospitalRep returnRepforBeverageCompany(int id) {
        
        for(HospitalRep rep: hospitalRepList)
        {
            if(rep.getHospitalId() == id)
            {
                return rep;
            }
        }
        return null;
        
    }
    

    

    
}
