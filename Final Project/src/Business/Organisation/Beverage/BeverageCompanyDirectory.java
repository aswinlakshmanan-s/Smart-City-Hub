/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Beverage;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class BeverageCompanyDirectory {
    
    ArrayList<BeverageCompany> beverageCompanyList = new ArrayList<>();

    public ArrayList<BeverageCompany> getBeverageCompanyList() {
        return beverageCompanyList;
    }

    public void setBeverageCompanyList(ArrayList<BeverageCompany> beverageCompanyList) {
        this.beverageCompanyList = beverageCompanyList;
    }
    
    public ArrayList<BeverageCompany> bevCompaniesForACity(String city)
        {
            ArrayList<BeverageCompany> hotelsList = new ArrayList<>();
            for(BeverageCompany hotel: beverageCompanyList)
            {
                if(hotel.getLocation().equals(city))
                    hotelsList.add(hotel);
                
            }
            return hotelsList;
        }
        
        
        public BeverageCompany getCompanyByName(String name)
        {
            for(BeverageCompany hotel: beverageCompanyList)
            {
                if(hotel.getName().equals(name))
                    return hotel;
            }
            return null;
        }
        
        public BeverageCompany getCompanyById(int id)
        {
            for(BeverageCompany company: beverageCompanyList)
            {
                if(company.getId() == id)
                    return company;
            }
            return null;
        }
    
    
    
}
