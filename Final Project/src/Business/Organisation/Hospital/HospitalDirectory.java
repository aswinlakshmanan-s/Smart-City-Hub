/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Hospital;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class HospitalDirectory {
    
    ArrayList <Hospital> hospitalList = new ArrayList<>();

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public ArrayList<Hospital> getHospitalsForCity(String city)
    {
        ArrayList<Hospital> cityHospitals = new ArrayList<>();
        for(Hospital hospital: hospitalList)
        {
            if(hospital.getLocation().equals(city))
                cityHospitals.add(hospital);
        }
        return cityHospitals;
    }

    public Hospital getHospitalByName(String hospitalName) {
        
        for(Hospital hospital: hospitalList)
        {
            if(hospital.getName().equals(hospitalName))
                return hospital;
        }
        return null;
    }
    
    
    
}
