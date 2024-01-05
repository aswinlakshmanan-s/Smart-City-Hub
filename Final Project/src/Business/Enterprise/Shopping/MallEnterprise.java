/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Shopping;

import Business.Organisation.Mall.Mall;
import Business.Organisation.Mall.MallVisitor;
import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.data.category.DefaultCategoryDataset;
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
public class MallEnterprise {
    
    // bar graph indicating number of visitors
    
    // pie chart indicating malls with popularity
    
    public static void analyzePeakHours(List<MallVisitor> visitors, List<Mall> malls, String city, JPanel targetPanel) {
    Map<Integer, String> mallLocations = new HashMap<>();
    for (Mall mall : malls) {
        mallLocations.put(mall.getId(), mall.getLocation());
    }

    Map<Integer, Map<Integer, Integer>> hourlyVisits = new HashMap<>();

    // Initialize hourly visit count for each mall in the city
    for (Mall mall : malls) {
        if (mall.getLocation().equals(city)) {
            Map<Integer, Integer> hourlyCount = new HashMap<>();
            for (int hour = 0; hour < 24; hour++) {
                hourlyCount.put(hour, 0);
            }
            hourlyVisits.put(mall.getId(), hourlyCount);
        }
    }

    // Count visits for each hour
    for (MallVisitor visitor : visitors) {
        if (mallLocations.getOrDefault(visitor.getMallId(), "").equals(city)) {
            String[] dateTime = visitor.getTime().split(" ")[1].split(":");
            int hour = Integer.parseInt(dateTime[0]);
            Map<Integer, Integer> hourlyCount = hourlyVisits.get(visitor.getMallId());
            hourlyCount.put(hour, hourlyCount.getOrDefault(hour, 0) + 1);
        }
    }

    // Create dataset and plot bar graph
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    for (Integer mallId : hourlyVisits.keySet()) {
        Map<Integer, Integer> hourlyCount = hourlyVisits.get(mallId);
        for (Integer hour : hourlyCount.keySet()) {
            Integer count = hourlyCount.get(hour);
            dataset.addValue(count, "Mall ID: " + mallId, hour.toString());
        }
    }

    JFreeChart barChart = ChartFactory.createBarChart(
            "Peak Visiting Hours in " + city,
            "Hour of the Day",
            "Number of Visitors",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

    ChartPanel chartPanel = new ChartPanel(barChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(849, 308));

    // Update the target panel with the chart
    targetPanel.removeAll();
    targetPanel.setLayout(new BorderLayout());
    targetPanel.add(chartPanel, BorderLayout.CENTER);

    targetPanel.revalidate();
    targetPanel.repaint();
}
    
    
    
}
