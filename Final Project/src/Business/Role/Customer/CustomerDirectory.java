/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role.Customer;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class CustomerDirectory {
    
    ArrayList<Customer> customerList = new ArrayList();
    public static Customer currentCustomer;

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    
    public Customer canLogin(String username, String password)
    {
        for(Customer customer: customerList)
        {
            if(customer.getUsername().equals(username) && customer.getPassword().equals(password))
            {
                return customer;
            }
        }
        return null;
    }
    
    
    
    
    public Customer getCustomerById(int id)
    {
        for(Customer customer: customerList)
        {
            if(customer.getId() == id)
                return customer;
        }
        return null;
    }
    
    
    public Customer getCustomerByName(String name)
    {
        for(Customer customer: customerList)
        {
            if(customer.getName().equals(name))
                return customer;
        }
        return null;
    }
}
