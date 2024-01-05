/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Enterprise.FoodBeverages;


//import Business.Organisation.Beverage.Reservation;
import Business.Organisation.HotelOrganisation.Hotel;
import Business.Organisation.HotelOrganisation.HotelOrder;
import Business.Organisation.HotelOrganisation.HotelReservation;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author anirudh
 */
public class FoodEnterprise {
    
    // plot pie chart for different company shares
    
    // plot bar graph of food versus numbers
    
    // most popular cuisine
    
public static void analyzeAndDisplayData(List<Hotel> hotels, List<HotelReservation> reservations, List<HotelOrder> orders, String targetCity, JPanel targetPanel) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    for (Hotel hotel : hotels) {
        if (hotel.getLocation().equals(targetCity)) {
            int reservationCount = (int) reservations.stream().filter(r -> r.getRestaurantId() == hotel.getId()).count();
            int orderCount = (int) orders.stream().filter(o -> o.getRestaurantId() == hotel.getId()).count();

            dataset.addValue(reservationCount, "Reservations", hotel.getName());
            dataset.addValue(orderCount, "Orders", hotel.getName());
        }
    }

    // Clear and set up the target panel
    targetPanel.removeAll();
    targetPanel.setLayout(new BorderLayout());

    // Check if the dataset is not empty
    if (!dataset.getColumnKeys().isEmpty()) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Hotel Reservation and Order Comparison in " + targetCity,
                "Hotel",
                "Count",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367)); // Set your preferred size

        targetPanel.add(chartPanel, BorderLayout.CENTER);
    } else {
        // Display a message if there's no data for the city
        JLabel noDataLabel = new JLabel("No data available for " + targetCity);
        targetPanel.add(noDataLabel, BorderLayout.CENTER);
    }

    targetPanel.revalidate();
    targetPanel.repaint();
}




    
    
}
