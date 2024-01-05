/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Transport;

import Business.EcoSystem;
import Business.Organisation.Vehicle.Rental;
import Business.Organisation.Vehicle.Vehicle;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author anirudh
 */
public class RentalEnterpise {
    
    
    // popular category of cars (pie chart)
    
    // average hours for booking (not sure where this is going)
    
public static void analyzeAndPlotHighestRentedCategory(EcoSystem system, String city, JPanel targetPanel) {
    // Step 1: Filter rentals by city
    Map<String, Integer> categoryCount = new HashMap<>();
    for (Rental rental : system.getRentals().getRentalList()) {
        Vehicle vehicle = findVehicleByName(system, rental.getVehicleName());
        if (vehicle != null && vehicle.getLocation().equals(city)) {
            String category = vehicle.getCategory();
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
        }
    }

    // Step 2: Identify the highest rented category
    String highestRentedCategory = Collections.max(categoryCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    System.out.println("Highest Rented Vehicle Category in " + city + ": " + highestRentedCategory);

    // Step 3: Plotting
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    for (Map.Entry<String, Integer> entry : categoryCount.entrySet()) {
        dataset.addValue(entry.getValue(), "Count", entry.getKey());
    }

    JFreeChart barChart = ChartFactory.createBarChart(
        "Vehicle Rental Categories in " + city,
        "Category",
        "Number of Rentals",
        dataset,
        PlotOrientation.VERTICAL,
        true, true, false
    );

    ChartPanel chartPanel = new ChartPanel(barChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

    // Update the target panel with the chart
    targetPanel.removeAll();
    targetPanel.setLayout(new BorderLayout());
    targetPanel.add(chartPanel, BorderLayout.CENTER);

    targetPanel.revalidate();
    targetPanel.repaint();
}

        
private static Vehicle findVehicleByName(EcoSystem system, String vehicleName) {
    for (Vehicle vehicle : system.getVehicleCompany().getVehicleList()) {
        if (vehicle.getName().equals(vehicleName)) {
            return vehicle;
        }
    }
    return null; // Return null if no matching vehicle is found
}        
        
    
}
