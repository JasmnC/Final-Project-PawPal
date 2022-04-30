/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AnimalManagerRole;


import model.UserAccount.UserAccount;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;
import model.Enterprise.AnimalShelterEnterprise;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.WorkQueue.AdoptionRequest;
import model.WorkQueue.AnimalManagerRequest;

/**
 *
 * @author raunak
 */
public class AdoptionRequestJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private UserAccount userAccount;
    private AnimalShelterEnterprise enterprise;
    private Network network;
    private Animal animal;
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public AdoptionRequestJPanel(JPanel workArea, UserAccount account, Animal animal, AnimalShelterEnterprise enterprise, Network network) {
        initComponents();
        
        this.workArea = workArea;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.network = network;
        this.animal = animal;
        
        populateRequestTable();
    }

    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblAnimalAdoptionWorkQueue.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : network.getWorkQueue().getWorkRequestList()){
            if(request instanceof AdoptionRequest && request.getAnimal() == animal){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getSender().getName();
            row[3] = request.getSender().getOrgainization();
            row[4] = request.getStatus();
            
            model.addRow(row);
            }
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimalAdoptionWorkQueue = new javax.swing.JTable();
        btnApproveAnimalAdoptionRequest = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnRejectAnimalAdoptionRequest = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAnimalAdoptionWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Applicant", "Applicant Name", "Organization", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAnimalAdoptionWorkQueue);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 890, 350));

        btnApproveAnimalAdoptionRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_approved.png"))); // NOI18N
        btnApproveAnimalAdoptionRequest.setText("Approve");
        btnApproveAnimalAdoptionRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveAnimalAdoptionRequestActionPerformed(evt);
            }
        });
        add(btnApproveAnimalAdoptionRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Adoption Request");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        btnRejectAnimalAdoptionRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_reject.png"))); // NOI18N
        btnRejectAnimalAdoptionRequest.setText("Reject");
        btnRejectAnimalAdoptionRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectAnimalAdoptionRequestActionPerformed(evt);
            }
        });
        add(btnRejectAnimalAdoptionRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 96, -1));

        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveAnimalAdoptionRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveAnimalAdoptionRequestActionPerformed
        
        int selectedRow = tblAnimalAdoptionWorkQueue.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return;
        }
        
        AdoptionRequest request = (AdoptionRequest) tblAnimalAdoptionWorkQueue.getValueAt(selectedRow, 0);
        
        if (request.getStatus().equals("Rejected")){
            JOptionPane.showMessageDialog(null, "This request has been rejected", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        request.setStatus("Approved");
        request.getAnimal().setAdoptor(request.getSender());
        
        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()){
            if (wr instanceof AnimalManagerRequest && wr.getAnimal() == request.getAnimal()){
                wr.setStatus("Adopted");
            }
        }
        populateRequestTable();        
        
    }//GEN-LAST:event_btnApproveAnimalAdoptionRequestActionPerformed

    private void btnRejectAnimalAdoptionRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectAnimalAdoptionRequestActionPerformed
        
        int selectedRow = tblAnimalAdoptionWorkQueue.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return;
        }
        
        AdoptionRequest request = (AdoptionRequest) tblAnimalAdoptionWorkQueue.getValueAt(selectedRow, 0);
        request.setStatus("Rejected");
        populateRequestTable();
        
    }//GEN-LAST:event_btnRejectAnimalAdoptionRequestActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBack1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveAnimalAdoptionRequest;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnRejectAnimalAdoptionRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAnimalAdoptionWorkQueue;
    // End of variables declaration//GEN-END:variables
}
