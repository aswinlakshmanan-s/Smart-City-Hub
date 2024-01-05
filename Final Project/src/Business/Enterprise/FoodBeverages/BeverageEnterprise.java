/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.FoodBeverages;

import Business.Organisation.Beverage.BeverageCompany;
import Business.Organisation.Beverage.Reservation;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author anirudh
 */
public class BeverageEnterprise {
    
    // plot pie chart for different company shares
    
    // plot bar graph of drinks versus numbers
    
        public void calculateAndPlotMarketShare(List<BeverageCompany> beverageCompanies, List<Reservation> reservationList, String city, JPanel targetPanel) {
    Map<Integer, Integer> companyReservations = new HashMap<>();
    for (BeverageCompany company : beverageCompanies) {
        if (company.getLocation().equals(city)) {
            companyReservations.put(company.getId(), 0); // Initialize reservations count
        }
    }

    // Count reservations for each company in the city
    for (Reservation reservation : reservationList) {
        BeverageCompany company = findBeverageCompanyById(beverageCompanies, reservation.getBeverageCompanyId());
        if (company != null && company.getLocation().equals(city)) {
            companyReservations.put(company.getId(), companyReservations.get(company.getId()) + 1);
        }
    }

    // Create a dataset for the pie chart
    DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
    int totalReservationsInCity = companyReservations.values().stream().mapToInt(Integer::intValue).sum();

    for (BeverageCompany company : beverageCompanies) {
        if (company.getLocation().equals(city)) {
            int companyReservationsCount = companyReservations.get(company.getId());
            double marketShare = (totalReservationsInCity > 0) ? (double) companyReservationsCount / totalReservationsInCity * 100 : 0;
            dataset.setValue(company.getName(), marketShare);
        }
    }

    // Create the pie chart
    JFreeChart chart = ChartFactory.createPieChart(
        "Market Share in " + city, // Title
        dataset,                  // Data
        true,                     // Include legend
        true,
        false);

    // Prepare the chart panel
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(560, 367)); // Adjust the size as needed

    // Update the target panel with the new chart
    targetPanel.removeAll();
    targetPanel.setLayout(new BorderLayout());
    targetPanel.add(chartPanel, BorderLayout.CENTER);
    targetPanel.validate();
    targetPanel.repaint();
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
