/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Vehicle;

/**
 *
 * @author anirudh
 */
public class Vehicle {
    
    private int id;
    private String name;
    private String location;
    private String category;
    private String noOfSeats;
    private float hourlyPrice;
    private int availability;

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNoOfSeats(String noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setHourlyPrice(float hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }
    
    
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public String getNoOfSeats() {
        return noOfSeats;
    }

    public float getHourlyPrice() {
        return hourlyPrice;
    }
    
    
    
    
}
