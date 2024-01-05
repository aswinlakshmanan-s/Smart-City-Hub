/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Recreation;

import Business.EcoSystem;
import Business.Organisation.Park.ParkVisitor;
import Business.Role.User.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.awt.BorderLayout;
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
public class ParksEnterprise {
    
    // demographic analysis
    
    // Overall Revenue generated
    
public static void plotAverageAgeOfParkGoers(List<ParkVisitor> parkVisitors, List<User> users, List<String> cities, JPanel targetPanel) {
    Map<String, List<Integer>> cityAges = new HashMap<>();
    for (ParkVisitor visitor : parkVisitors) {
        for (User user : users) {
            if (user.getId() == visitor.getCustomerId() && cities.contains(user.getLocation())) {
                cityAges.computeIfAbsent(user.getLocation(), k -> new ArrayList<>()).add(user.getAge());
            }
        }
    }

    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    for (String city : cities) {
        List<Integer> ages = cityAges.get(city);
        if (ages != null && !ages.isEmpty()) {
            double averageAge = ages.stream().mapToInt(Integer::intValue).average().orElse(0);
            dataset.addValue(averageAge, "Average Age", city);
        } else {
            dataset.addValue(0, "Average Age", city);
        }
    }

    JFreeChart barChart = ChartFactory.createBarChart(
            "Average Age of Park Goers per City",
            "City",
            "Average Age",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

    ChartPanel chartPanel = new ChartPanel(barChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(731, 321));

    // Update the target panel with the chart
    targetPanel.removeAll();
    targetPanel.setLayout(new BorderLayout());
    targetPanel.add(chartPanel, BorderLayout.CENTER);

    targetPanel.revalidate();
    targetPanel.repaint();
}

    
    
}
