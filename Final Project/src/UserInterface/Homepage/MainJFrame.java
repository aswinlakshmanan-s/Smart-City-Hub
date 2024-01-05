/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.Homepage;

import Business.ConfigureASystem;
import Business.EcoSystem;
import Business.Role.BeverageRep.BeverageRep;
import Business.Role.BeverageRep.BeverageRepDirectory;
import Business.Role.Customer.Customer;
import Business.Role.Customer.CustomerDirectory;
import Business.Role.HospitalRep.HospitalRep;
import Business.Role.HospitalRep.HospitalRepDirectory;
import Business.Role.HotelRep.HotelRep;
import Business.Role.HotelRep.HotelRepDirectory;
import Business.Role.MallRep.MallRep;
import Business.Role.MallRep.MallRepDirectory;
import Business.Role.MarketAnalyst.MarketAnalyst;
import Business.Role.MuseumRep.MuseumRep;
import Business.Role.ParkRep.ParkRep;
import Business.Role.PoliceRep.PoliceRep;
import Business.Role.ShopRep.ShopRep;
import Business.Role.TheatreRep.TheatreRep;
import Business.Role.VehicleRep.VehicleRep;
import UserInterface.Analyst.AnalyzeMarketJpanel;
import UserInterface.BeverageRep.BeverageRepDashboardJPanel;
import UserInterface.Customer.CustomerDashboardJPanel;
import UserInterface.HospitalRep.HospitalRepDahsboard;
import UserInterface.HotelRep.HotelRepDashboardJPanel;
import UserInterface.MallRep.MallRepDashboardJPanel;
import UserInterface.MuseumRep.MuseumRepDashboardJPanel;
import UserInterface.ParkRep.ParkRepDahsboardJPanel;
import UserInterface.PoliceRep.PoliceRepDashboardJPanel;
import UserInterface.ShopRep.ShopRepDashboardJPanel;
import UserInterface.TheatreRep.TheatreRepDashboardJPanel;
import UserInterface.VehicleRep.VehicleRepDashboardJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author anirudh
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    EcoSystem system;
    public MainJFrame() {
        initComponents();
        system = ConfigureASystem.configure();
        System.out.println("Customer username- "+system.getCustomerDirectory().getCustomerList().get(0).getUsername());
        System.out.println("Customer password- "+system.getCustomerDirectory().getCustomerList().get(0).getPassword());
        System.out.println("BeverageRep username- "+system.getBeverageRepDirectory().getBeverageRepList().get(0).getUsername());
        System.out.println("BeverageRep password- "+system.getBeverageRepDirectory().getBeverageRepList().get(0).getPassword());
        System.out.println("HospitalRep username- "+system.getHospitalRepDirectory().getHospitalRepList().get(0).getUsername());
        System.out.println("HospitalRep password- "+system.getHospitalRepDirectory().getHospitalRepList().get(0).getPassword());
        System.out.println("HotelRep username- "+system.getHotelRepDirectory().getHotelRepList().get(0).getUsername());
        System.out.println("HotelRep password- "+system.getHotelRepDirectory().getHotelRepList().get(0).getPassword());        
        System.out.println("MallRep username- "+system.getMallRepDirectory().getMallRepList().get(0).getUsername());
        System.out.println("MallRep password- "+system.getMallRepDirectory().getMallRepList().get(0).getPassword()); 
        System.out.println("MuseumRep username- "+system.getMuseumRepDirectory().getMuseumRepList().get(0).getUsername());
        System.out.println("MuseumRep password- "+system.getMuseumRepDirectory().getMuseumRepList().get(0).getPassword());
        System.out.println("ParkRep username- "+system.getParkRepDirectory().getParkRepList().get(0).getUsername());
        System.out.println("ParkRep password- "+system.getParkRepDirectory().getParkRepList().get(0).getPassword());
        System.out.println("PoliceRep username- "+system.getPoliceRepDirectory().getPoliceRepList().get(0).getUsername());
        System.out.println("PoliceRep password- "+system.getPoliceRepDirectory().getPoliceRepList().get(0).getPassword());
        System.out.println("ShopRep username- "+system.getShopRepDirectory().getShopRepList().get(0).getUsername());
        System.out.println("ShopRep password- "+system.getShopRepDirectory().getShopRepList().get(0).getPassword());
        System.out.println("TheatreRep username- "+system.getTheatreRepDirectory().getTheatreRepList().get(0).getUsername());
        System.out.println("TheatreRep password- "+system.getTheatreRepDirectory().getTheatreRepList().get(0).getPassword());
        System.out.println("VehicleRep username- "+system.getVehicleRepDirectory().getVehicleRepList().get(0).getUsername());
        System.out.println("VehicleRep password- "+system.getVehicleRepDirectory().getVehicleRepList().get(0).getPassword());
    }
    
            public static void changeScreen(JPanel jPanel)
    {
        jLayeredPane1.removeAll();
        jLayeredPane1.add(jPanel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        LandinPageJPanel = new AnalyzeMarketJpanel.jPanelGradient();
        lblTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        lblTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblTitle.setText("Welcome to SmartCity Hub");

        lblUsername.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblUsername.setText("Username: ");

        lblPassword.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblPassword.setText("Password: ");

        btnLogin.setBackground(new java.awt.Color(102, 0, 0));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(102, 0, 0));
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Dont have an account ? ");

        javax.swing.GroupLayout LandinPageJPanelLayout = new javax.swing.GroupLayout(LandinPageJPanel);
        LandinPageJPanel.setLayout(LandinPageJPanelLayout);
        LandinPageJPanelLayout.setHorizontalGroup(
            LandinPageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LandinPageJPanelLayout.createSequentialGroup()
                .addGroup(LandinPageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LandinPageJPanelLayout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addGroup(LandinPageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LandinPageJPanelLayout.createSequentialGroup()
                                .addGroup(LandinPageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUsername))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LandinPageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtPassword)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LandinPageJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegister))))
                    .addGroup(LandinPageJPanelLayout.createSequentialGroup()
                        .addGap(577, 577, 577)
                        .addComponent(lblTitle)))
                .addGap(0, 678, Short.MAX_VALUE))
            .addGroup(LandinPageJPanelLayout.createSequentialGroup()
                .addGap(673, 673, 673)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LandinPageJPanelLayout.setVerticalGroup(
            LandinPageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LandinPageJPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblTitle)
                .addGap(75, 75, 75)
                .addGroup(LandinPageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(LandinPageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(87, 87, 87)
                .addGroup(LandinPageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnRegister))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jLayeredPane1.add(LandinPageJPanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        RegisterJpanel panel = new RegisterJpanel(system);
        changeScreen(panel);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = txtPassword.getText();
//        ArrayList<Customer> customers = system.getCustomerDirectory().getCustomerList();
//        System.out.prifo

        
        Customer customer = system.getCustomerDirectory().canLogin(username, password);
        if( customer != null)
        {
            CustomerDirectory.currentCustomer = customer;
            CustomerDashboardJPanel panel = new CustomerDashboardJPanel(system);
            changeScreen(panel);
        }
        
        BeverageRep beverageRep = system.getBeverageRepDirectory().canLogin(username, password);
        
        if( beverageRep != null)
        {
            BeverageRepDirectory.currentRep = beverageRep;
            BeverageRepDashboardJPanel panel = new BeverageRepDashboardJPanel(system);
            changeScreen(panel);
        }
//        
        HospitalRep hospitalRep = system.getHospitalRepDirectory().canLogin(username, password);
        
        if( hospitalRep != null)
        {
            
            HospitalRepDirectory.currentHospitalRep = hospitalRep;
            HospitalRepDahsboard panel = new HospitalRepDahsboard(system);
            changeScreen(panel);
        }
//        
        HotelRep hotelRep = system.getHotelRepDirectory().canLogin(username, password);
        
        if( hotelRep != null)
        {
            HotelRepDirectory.currentHotelRep = hotelRep;
            HotelRepDashboardJPanel panel = new HotelRepDashboardJPanel(system);
            changeScreen(panel);
        }
//        
        MallRep mallRep = system.getMallRepDirectory().canLogin(username, password);
        
        if( mallRep != null)
        {
            MallRepDirectory.currentMallRep = mallRep;
            MallRepDashboardJPanel panel = new MallRepDashboardJPanel(system);
            changeScreen(panel);
        }
//        
//        MuseumRep museumRep = system.getMuseumRepDirectory().canLogin(username, password);
//        
//        if( museumRep != null)
//        {
//            MuseumRepDashboardJPanel panel = new MuseumRepDashboardJPanel(system);
//            changeScreen(panel);
//        }
//        
//        ParkRep parkRep = system.getParkRepDirectory().canLogin(username, password);
//        
//        if( parkRep != null)
//        {
//            ParkRepDahsboardJPanel panel = new ParkRepDahsboardJPanel (system);
//            changeScreen(panel);
//        }
//        
//        PoliceRep policeRep = system.getPoliceRepDirectory().canLogin(username, password);
//        
//        if( policeRep != null)
//        {
//            PoliceRepDashboardJPanel panel = new PoliceRepDashboardJPanel(system);
//            changeScreen(panel);
//        }
//        
//        ShopRep shopRep = system.getShopRepDirectory().canLogin(username, password);
//        
//        if( shopRep != null)
//        {
//            ShopRepDashboardJPanel panel = new ShopRepDashboardJPanel(system);
//            changeScreen(panel);
//        }
//        
//        TheatreRep theatreRep = system.getTheatreRepDirectory().canLogin(username, password);
//        
//        if( theatreRep != null)
//        {
//            TheatreRepDashboardJPanel panel = new TheatreRepDashboardJPanel(system);
//            changeScreen(panel);
//        }
//        
//        VehicleRep vehicleRep = system.getVehicleRepDirectory().canLogin(username, password);
//        
//        if( vehicleRep != null)
//        {
//            VehicleRepDashboardJPanel panel = new VehicleRepDashboardJPanel(system);
//            changeScreen(panel);
//        }
        MarketAnalyst analystRep = system.getAnalystDirectory().canLogin(username, password);
        
        if( analystRep!= null)
        {
            AnalyzeMarketJpanel panel = new AnalyzeMarketJpanel(system);
            changeScreen(panel);
        }
        

        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel LandinPageJPanel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
