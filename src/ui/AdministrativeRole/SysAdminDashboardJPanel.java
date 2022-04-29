/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import java.awt.BorderLayout;
import model.Organization.Organization;
import model.Organization.Organization.Type;
import model.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.WorkQueue.AdoptionRequest;
import model.WorkQueue.AnimalManagerRequest;
import model.WorkQueue.MedCareRequest;
import model.WorkQueue.VolunteerRequest;
import model.WorkQueue.WorkRequest;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author raunak
 */
public class SysAdminDashboardJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecoSystem;
    Network network;
    Enterprise enterprise;
    JFreeChart barChart;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public SysAdminDashboardJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecosystem;

        populateBar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jPanel_ourService = new javax.swing.JPanel();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Dashboard");

        jPanel_ourService.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnBack)
                        .addGap(29, 29, 29)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel_ourService, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(45, 45, 45)
                .addComponent(jPanel_ourService, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel_ourService;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    private void populateBar() {
        ArrayList<AdoptionRequest> adoptionRequests = new ArrayList<>();
        ArrayList<MedCareRequest> medCareRequests = new ArrayList<>();
        ArrayList<VolunteerRequest> volunteerRequests = new ArrayList<>();
        ArrayList<AnimalManagerRequest> animalManagerRequests = new ArrayList<>();

        Map<String, Integer> workReqMap = new HashMap<>();
        for (Network nw : ecoSystem.getNetworkList()) {
            for (WorkRequest workQRequest : nw.getWorkQueue().getWorkRequestList()) {

                if (workQRequest instanceof AdoptionRequest) {
                    adoptionRequests.add((AdoptionRequest) workQRequest);
                } else if (workQRequest instanceof MedCareRequest) {
                    medCareRequests.add((MedCareRequest) workQRequest);
                } else if (workQRequest instanceof VolunteerRequest) {
                    volunteerRequests.add((VolunteerRequest) workQRequest);
                }
            }
        }
                for (Network nw : ecoSystem.getNetworkList()) {
        for(Enterprise e: nw.getEnterpriseDirectory().getEnterpriseList()){
            for(WorkRequest wr : e.getWorkQueue().getWorkRequestList()){
                        if (wr instanceof AnimalManagerRequest) {
            animalManagerRequests.add((AnimalManagerRequest) wr);
        }
            }
        }
        //  network> Enterprise > = animal shelter > request = amreq
                }

        workReqMap.put("Adoption Services", adoptionRequests.size());
        workReqMap.put("Medical Care Services", medCareRequests.size());
        workReqMap.put("Volunteer Services", volunteerRequests.size());
        workReqMap.put("Animal Shelter Services", animalManagerRequests.size());

        barChart = ChartFactory.createPieChart("Our Service", createDataset(workReqMap), true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel_ourService.removeAll();
        jPanel_ourService.add(chartPanel, BorderLayout.CENTER);
        jPanel_ourService.validate();
    }

    private PieDataset createDataset(Map<String, Integer> workReqMap) {
        final DefaultPieDataset dataset = new DefaultPieDataset();
        for (String r : workReqMap.keySet()) {
            dataset.setValue(r, workReqMap.get(r));
        }
        return dataset;
    }

}
