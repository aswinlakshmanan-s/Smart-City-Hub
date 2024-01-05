/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Museum;

/**
 *
 * @author anirudh
 */
public class Museum {
    
    private int id;
    private String name;
    private String location;
    private String category;
    private float entryFee;
    private String timing;
    private String wheelChairAvailable;

    public String getWheelChairAvailable() {
        return wheelChairAvailable;
    }

    public void setWheelChairAvailable(String wheelChairAvailable) {
        this.wheelChairAvailable = wheelChairAvailable;
    }
    
    

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
    
    

    public float getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(float entryFee) {
        this.entryFee = entryFee;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
}
