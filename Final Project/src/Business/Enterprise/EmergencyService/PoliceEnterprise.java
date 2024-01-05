/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.EmergencyService;

import Business.Organisation.Police.Report;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
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
public class PoliceEnterprise {
    
public static void plotReportData(ArrayList<Report> reports, List<String> cities, JPanel targetPanel) {
    Map<String, Integer> cityReportCount = new HashMap<>();
    for (Report report : reports) {
        cityReportCount.put(report.getLocation(), cityReportCount.getOrDefault(report.getLocation(), 0) + 1);
    }

    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    for (String city : cities) {
        dataset.addValue(cityReportCount.getOrDefault(city, 0), "Number of Reports", city);
    }

    JFreeChart lineChart = ChartFactory.createLineChart(
            "Police Reports by City",
            "City",
            "Number of Reports",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

    ChartPanel chartPanel = new ChartPanel(lineChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

    // Clear the existing content of the panel and add the chart
    targetPanel.removeAll();
    targetPanel.setLayout(new BorderLayout());
    targetPanel.add(chartPanel, BorderLayout.CENTER);

    // Refresh the panel to display the new chart
    targetPanel.revalidate();
    targetPanel.repaint();
}
    
    
}
