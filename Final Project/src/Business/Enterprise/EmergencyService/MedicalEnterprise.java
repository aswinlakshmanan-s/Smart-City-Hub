/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.EmergencyService;

import Business.Organisation.Hospital.Appointment;
import Business.Organisation.Hospital.Hospital;
import java.awt.BorderLayout;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JFrame;
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
public class MedicalEnterprise {
    
    
        public static void performAnalysisForCity(List<Appointment> appointments, List<Hospital> hospitals, String targetCity, JPanel panel) {
    // Map hospital IDs to their locations
    Map<Integer, String> hospitalLocations = hospitals.stream()
            .collect(Collectors.toMap(Hospital::getId, Hospital::getLocation));

    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    // Filter appointments by city and count symptoms
    Map<String, Long> symptomCount = appointments.stream()
            .filter(a -> hospitalLocations.getOrDefault(a.getHospitalId(), "").equals(targetCity))
            .collect(Collectors.groupingBy(Appointment::getSymptom, Collectors.counting()));

    // Add data to the dataset
    symptomCount.forEach((symptom, count) -> dataset.addValue(count, "Symptoms", symptom));

    // Create a bar chart with the data
    JFreeChart barChart = ChartFactory.createBarChart(
            "Symptom Report for " + targetCity,
            "Symptom",
            "Number of Reports",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

    // Create a ChartPanel to hold the chart
    ChartPanel chartPanel = new ChartPanel(barChart);
    
    // The following line assumes you want to replace the existing contents of the panel
    panel.removeAll();
    
    // Add the chart to the existing panel
    panel.setLayout(new BorderLayout()); // Set layout
    panel.add(chartPanel, BorderLayout.CENTER);
    
    // Revalidate and repaint the panel to display the chart
    panel.revalidate();
    panel.repaint();
}

    
}
