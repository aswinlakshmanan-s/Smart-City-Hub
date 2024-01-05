/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Beverage;

/**
 *
 * @author anirudh
 */
public class Reservation {
    
    private int customerId;
    private int beverageCompanyId;
    private int noOfGuests;
    private String time;

    public int getBeverageCompanyId() {
        return beverageCompanyId;
    }

    public void setBeverageCompanyId(int beverageCompanyId) {
        this.beverageCompanyId = beverageCompanyId;
    }
    
    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getNoOfGuests() {
        return noOfGuests;
    }

    public void setNoOfGuests(int noOfGuests) {
        this.noOfGuests = noOfGuests;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
    
}
