/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author anirudh
 */
public class Appointments {
    
    ArrayList<Appointment> appointmentList = new ArrayList<>();

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
    
    public ArrayList<Appointment> findAppointmentsForRep(int id)
    {
        ArrayList<Appointment> appointments = new ArrayList<>();
        for(Appointment appointment: appointmentList)
        {
            if(appointment.getHospitalId() == id)
                appointments.add(appointment);
        }
        return appointments;
    }
    
    public Appointment findAppointmentForCustomer(int id)
    {
        for(Appointment appointment: appointmentList)
        {
            if(appointment.getCustomerId() == id)
                return appointment;
        }
        return null;
    }
      
    
    
    
}
