/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.Customer;

import Business.Role.User.User;

/**
 *
 * @author anirudh
 */
public class Customer extends User {
    
    public Customer(User u) {
        super(u); 
    }

    @Override
    public String getRole() {
        return "Customer"; 
    }
    
}
