/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Beverage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 *
 * @author anirudh
 */
public class Reservations {
    
    ArrayList<Reservation> reservationList = new ArrayList<>();

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(ArrayList<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
    



    private BeverageCompany findBeverageCompanyById(List<BeverageCompany> beverageCompanies, int companyId) {
        for (BeverageCompany company : beverageCompanies) {
            if (company.getId() == companyId) {
                return company;
            }
        }
        return null;
    }
    
    
}
