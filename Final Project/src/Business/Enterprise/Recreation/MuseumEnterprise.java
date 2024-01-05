/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Recreation;

import Business.Organisation.Museum.Museum;
import Business.Organisation.Museum.MuseumVisitor;
import java.awt.BorderLayout;
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
public class MuseumEnterprise {
    
    // most popular museum
    
    // demographic analysis
    
public static void plotAverageMuseumGoers(List<Museum> museums, List<MuseumVisitor> museumVisitors, List<String> cities, JPanel targetPanel) {
    Map<String, Integer> cityVisitorCounts = new HashMap<>();
    Map<String, Integer> cityMuseumCounts = new HashMap<>();

    for (Museum museum : museums) {
        cityMuseumCounts.put(museum.getLocation(), cityMuseumCounts.getOrDefault(museum.getLocation(), 0) + 1);
        for (MuseumVisitor visitor : museumVisitors) {
            if (visitor.getMuseumId() == museum.getId()) {
                cityVisitorCounts.put(museum.getLocation(), cityVisitorCounts.getOrDefault(museum.getLocation(), 0) + 1);
            }
        }
    }

    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    for (String city : cities) {
        int totalVisitors = cityVisitorCounts.getOrDefault(city, 0);
        int numberOfMuseums = cityMuseumCounts.getOrDefault(city, 0);
        double averageVisitors = (numberOfMuseums != 0) ? (double) totalVisitors / numberOfMuseums : 0;
        dataset.addValue(averageVisitors, "Average Visitors", city);
    }

    JFreeChart lineChart = ChartFactory.createLineChart(
            "Average Museum Goers per City",
            "City",
            "Average Visitors",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

    ChartPanel chartPanel = new ChartPanel(lineChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(508, 369));

    // Clear the existing content of the panel and add the chart
    targetPanel.removeAll();
    targetPanel.setLayout(new BorderLayout());
    targetPanel.add(chartPanel, BorderLayout.CENTER);

    // Refresh the panel to display the new chart
    targetPanel.revalidate();
    targetPanel.repaint();
}

    
    
}
