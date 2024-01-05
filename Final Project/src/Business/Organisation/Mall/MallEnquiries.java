/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Mall;

//import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class MallEnquiries {
    
    ArrayList<MallEnquiry> enquiryList = new ArrayList<>();

    public ArrayList<MallEnquiry> getEnquiryList() {
        return enquiryList;
    }

    public void setEnquiryList(ArrayList<MallEnquiry> enquiryList) {
        this.enquiryList = enquiryList;
    }
    
    public ArrayList<MallEnquiry> getEnquiriesForMall(int id)
    {
        ArrayList<MallEnquiry> specificEnquiries = new ArrayList<>();
        for(MallEnquiry enquiry: enquiryList)
        {
            if(enquiry.getMallId() == id)
                specificEnquiries.add(enquiry);
        }
        return specificEnquiries;
    }
    
    public String fetchQueryforCustomer(int id)
    {
        
        for(MallEnquiry enquiry: enquiryList)
        {
            if(enquiry.getCustomerId() == id)
                return enquiry.getProducts();
        }
        return null;
    }
    
    
    
}
