/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Police;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class Reports {
    
    ArrayList<Report> reportList = new ArrayList<>();

    public ArrayList<Report> getReportList() {
        return reportList;
    }

    public void setReportList(ArrayList<Report> reportList) {
        this.reportList = reportList;
    }

    public ArrayList<Report> findReportsForRep(int id) {
        ArrayList<Report> reports = new ArrayList<>();
        for(Report rep:reportList)
        {
            if(rep.getDepartmentId() == id)
                reports.add(rep);
        }
        return reports;
    }

    public Report finReportbyReporterName(EcoSystem system,String selectedItem) {
        for(Report rep:reportList)
        {
            if(system.getCustomerDirectory().getCustomerById(rep.getCustomerId()).getName().equals(selectedItem))
                return rep;
        }
        return null;
    }
    
    
    
}
