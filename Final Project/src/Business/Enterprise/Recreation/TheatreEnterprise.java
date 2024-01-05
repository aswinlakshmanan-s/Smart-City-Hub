/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Recreation;

import Business.EcoSystem;
import Business.Organisation.Theatre.Booking;
import Business.Organisation.Theatre.Theatre;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
public class TheatreEnterprise {
    
    // pie chart indication different popularity levels
    
    // Demographic analysis
    
    public static void analyzeAndPlotBestSellingMovie(EcoSystem system, String city, JPanel targetPanel) {
    // Step 1: Filter bookings by city
    List<Booking> filteredBookings = new ArrayList<>();
    for (Booking booking : system.getBookings().getBookingList()) {
        Theatre theatre = findTheatreById(system, booking.getTheatreId());
        if (theatre != null && theatre.getLocation().equals(city)) {
            filteredBookings.add(booking);
        }
    }

    // Step 2: Aggregate sales data
    Map<String, Integer> movieSales = new HashMap<>();
    for (Booking booking : filteredBookings) {
        movieSales.put(booking.getMovieName(), 
            movieSales.getOrDefault(booking.getMovieName(), 0) + booking.getTotalPrice());
    }

    // Step 3: Identify the best-selling movie
//    String bestSellingMovie = Collections.max(movieSales.entrySet(), 
//                                     Map.Entry.comparingByValue()).getKey();
//
//    System.out.println("Best Selling Movie in " + city + ": " + bestSellingMovie);

    // Step 4: Plotting
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    for (Map.Entry<String, Integer> entry : movieSales.entrySet()) {
        dataset.addValue(entry.getValue(), "Revenue", entry.getKey());
    }

    JFreeChart barChart = ChartFactory.createBarChart(
        "Best Selling Movies in " + city,
        "Movie",
        "Revenue",
        dataset,
        PlotOrientation.VERTICAL,
        true, true, false
    );

    ChartPanel chartPanel = new ChartPanel(barChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));

    // Update the target panel with the chart
    targetPanel.removeAll();
    targetPanel.setLayout(new BorderLayout());
    targetPanel.add(chartPanel, BorderLayout.CENTER);

    targetPanel.revalidate();
    targetPanel.repaint();
}

    private static Theatre findTheatreById(EcoSystem system, int theatreId) {
    // Assuming the EcoSystem class has a method to get all theatres or a theatre directory
    for (Theatre theatre : system.getTheatreDirectory().getTheatreList()) {
        if (theatre.getId() == theatreId) {
            return theatre;
        }
    }
    return null;
}
    
}
