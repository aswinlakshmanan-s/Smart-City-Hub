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
public class Mall {
    
    private int id;
    private String name;
    private String location;
    private String address;
    private String timings;
    private String popularfor;
    private String wheelChair;

    public String getWheelChair() {
        return wheelChair;
    }

    public void setWheelChair(String wheelChair) {
        this.wheelChair = wheelChair;
    }
    
    
    
    ArrayList <String> outlets;

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    public ArrayList<String> getOutlets() {
        return outlets;
    }

    public void setOutlets(ArrayList<String> outlets) {
        this.outlets = outlets;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPopularfor() {
        return popularfor;
    }

    public void setPopularfor(String popularfor) {
        this.popularfor = popularfor;
    }
    
    
    
}
