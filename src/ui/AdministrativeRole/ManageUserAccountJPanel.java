/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;


import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Role.Role;
import model.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;

    public ManageUserAccountJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecosystem;
        
        cmbNetworkList.removeAllItems();
        cmbEnterprise.removeAllItems();
        cmbOrg.removeAllItems();
        cmbRoles.removeAllItems();
        
        populateNetworkCombo();
        populateUserAccountsTable();

        
//        this.business = business;
//        this.container = container;
//
//        popOrganizationComboBox();
//        
//        Organization organization = (Organization) cmbEnterprise.getSelectedItem();
//        if (organization != null) {
//            populateEmployeeComboBox(organization);
//            populateRoleComboBox(organization);
//        }
//
//        popUserAccountsTable();
    }

//    public void popOrganizationComboBox() {
//        cmbEnterprise.removeAllItems();
//
//        for (Organization organization : business.getOrganizationDirectory().getOrganizationList()) {
//            cmbEnterprise.addItem(organization);
//        }
//    }
//
//    public void populateEmployeeComboBox(Organization organization) {
//        cmbOrg.removeAllItems();
//
//        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
//            cmbOrg.addItem(employee);
//        }
//    }
//
//    private void populateRoleComboBox(Organization organization) {
//        cmbRoles.removeAllItems();
//        for (Role role : organization.getSupportedRole()) {
//            cmbRoles.addItem(role);
//        }
//    }
//
    
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblUsersList = new javax.swing.JLabel();
        cmbOrg = new javax.swing.JComboBox();
        lblEmployee = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox();
        lblCreateUser = new javax.swing.JLabel();
        lblOrganizationPicker = new javax.swing.JLabel();
        lblOrganization = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        cmbNetworkList = new javax.swing.JComboBox();
        cmbEnterprise = new javax.swing.JComboBox();
        txtUserName = new javax.swing.JTextField();
        pwdUser = new javax.swing.JPasswordField();
        btnCreateUser = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(224, 227, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role", "Organization", "Enterprise", "Network"
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
        jScrollPane1.setViewportView(tblUsers);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 890, 250));

        btnBack.setBackground(new java.awt.Color(245, 245, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_role.png"))); // NOI18N
        lblTitle.setText("Manage Users");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        lblUsersList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsersList.setText("Users List:");
        add(lblUsersList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 81, -1, -1));

        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });
        add(cmbOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 242, -1));

        lblEmployee.setText("Organization:");
        add(lblEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        cmbRoles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 242, -1));

        lblCreateUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCreateUser.setText("New User:");
        add(lblCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        lblOrganizationPicker.setText("Network:");
        add(lblOrganizationPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        lblOrganization.setText("Enterprise:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        lblUserName.setText("User Name:");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        cmbNetworkList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetworkList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkListActionPerformed(evt);
            }
        });
        add(cmbNetworkList, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 242, -1));

        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseActionPerformed(evt);
            }
        });
        add(cmbEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 242, -1));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 255, -1));

        pwdUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdUserActionPerformed(evt);
            }
        });
        add(pwdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 255, -1));

        btnCreateUser.setBackground(new java.awt.Color(245, 245, 255));
        btnCreateUser.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnCreateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_add.png"))); // NOI18N
        btnCreateUser.setText("Create");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });
        add(btnCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, -1, -1));

        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        
//        String userName = txtUserName.getText();
//        String password = txtPassword.getText();
//        
//        Network network = (Network) cmbNetworkList.getSelectedItem();
//        
//        if (network != null) {
//            if (cmbEnterprise.getSelectedItem() != null) {
//                String selectedEntOption = (String) cmbEnterprise.getSelectedItem();
//                String enterpriseName = selectedEntOption.split("\\s\\|\\s")[1];            
//                Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);
//
//                if (cmbOrg.getSelectedItem()!= null) {
//                    String selectedOrgOption = cmbOrg.getSelectedItem().toString();
//                    String orgName = selectedOrgOption.split("\\s\\|\\s")[1];
//                    Organization organization = enterprise.getOrganizationDirectory().getOrganizationByName(orgName);
//
//                    if (organization != null){
//                        if((!userName.equals("")) || (!userName.equals(""))){
//                            if(ecoSystem.getUserAccountDirectory().userNameIsUnique(userName)){
//                                Role role = (Role) cmbRoles.getSelectedItem();
//                                ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, role, network, enterprise, organization);
//                                JOptionPane.showMessageDialog(null, "User Account added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
//                                txtUserName.setText("");
//                                txtPassword.setText("");
//                                for (UserAccount ua : ecoSystem.getUserAccountDirectory().getUserAccountList()){
//                                    System.out.println(ua);
//                                }
//                                    } else {                            
//                                        JOptionPane.showMessageDialog(null, "Username already existed", "Warning", JOptionPane.WARNING_MESSAGE);
//                                    } 
//                                } else {
//                                JOptionPane.showMessageDialog(null, "Username & Password cannot be empty","Warning",JOptionPane.WARNING_MESSAGE);
//                                }
//                        } else {
//                        JOptionPane.showMessageDialog(null, "Please select where you wish to add the account", "Warning", JOptionPane.WARNING_MESSAGE);
//                    }
//                } else {
//                JOptionPane.showMessageDialog(null, "Network cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
//            }  
//        } 
//    }
        

        try{
            
            String userName = txtUserName.getText();
            String password = String.valueOf(pwdUser.getPassword());

            Network network = (Network) cmbNetworkList.getSelectedItem();

            String selectedEntOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedEntOption.split("\\s\\|\\s")[1];            
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            String selectedOrgOption = cmbOrg.getSelectedItem().toString();
            String orgName = selectedOrgOption.split("\\s\\|\\s")[1];
            Organization organization = enterprise.getOrganizationDirectory().getOrganizationByName(orgName);

            if((!userName.isEmpty()) && (!password.isEmpty())){
                if(ecoSystem.getUserAccountDirectory().userNameIsUnique(userName)){
                    Role role = (Role) cmbRoles.getSelectedItem();
                    ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, role, network, enterprise, organization);
                    JOptionPane.showMessageDialog(null, "User Account added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    txtUserName.setText("");
                    pwdUser.setText("");
                    populateUserAccountsTable();
                } else {                            
                    JOptionPane.showMessageDialog(null, "Username already existed", "Warning", JOptionPane.WARNING_MESSAGE);
                } 
            } else {
                JOptionPane.showMessageDialog(null, "Username & Password cannot be empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
        
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Network / Enterprise / Organization cannot be empty","Warning",JOptionPane.WARNING_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseActionPerformed

        populateOrgCombo();

    }//GEN-LAST:event_cmbEnterpriseActionPerformed

    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
        // TODO add your handling code here:

        populateRoleCombo();

    }//GEN-LAST:event_cmbOrgActionPerformed

    private void cmbNetworkListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkListActionPerformed

        populateEnterpriseCombo();

    }//GEN-LAST:event_cmbNetworkListActionPerformed

    private void pwdUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdUserActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetworkList;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JComboBox cmbRoles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateUser;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblOrganizationPicker;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUsersList;
    private javax.swing.JPasswordField pwdUser;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateNetworkCombo() {
    
        cmbNetworkList.removeAllItems();

        if (!ecoSystem.getNetworkList().isEmpty()){
            for (Network n : ecoSystem.getNetworkList()){
                cmbNetworkList.addItem(n);
            }
        }
    }

    private void populateEnterpriseCombo() {
        
        cmbEnterprise.removeAllItems();
        
        Network network = (Network) cmbNetworkList.getSelectedItem();
        
        if (network != null ){
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                cmbEnterprise.addItem(e.getType() + " | " + e);
            }
        }
    }

    private void populateOrgCombo() {
        
        cmbOrg.removeAllItems();
        
        Network network = (Network) cmbNetworkList.getSelectedItem();
                
        if (cmbEnterprise.getSelectedItem() != null) {
            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];            
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);
            
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
                cmbOrg.addItem(o.getType() + " | " + o);
            }
        }
    }

    private void populateRoleCombo() {

        cmbRoles.removeAllItems();
        
        Network network = (Network) cmbNetworkList.getSelectedItem();
        
        if (cmbEnterprise.getSelectedItem() != null) {
            String selectedEntOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedEntOption.split("\\s\\|\\s")[1];            
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);
        
            if (cmbOrg.getSelectedItem()!= null) {
                String selectedOrgOption = cmbOrg.getSelectedItem().toString();
                String orgName = selectedOrgOption.split("\\|\\s")[1];
                Organization organization = enterprise.getOrganizationDirectory().getOrganizationByName(orgName);

                for (Role role : organization.getSupportedRole()) {
                    cmbRoles.addItem(role);
                }
                
            }
        }
    }
    
    public void populateUserAccountsTable() {

        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        model.setRowCount(0);

        for (UserAccount ua : ecoSystem.getUserAccountDirectory().getUserAccountList()){
                Object row[] = new Object[5];
                row[0] = ua;
                row[1] = ua.getRole();
                row[2] = ua.getOrgainization();
                row[3] = ua.getEnterprise();
                row[4] = ua.getNetwork();
                model.addRow(row);
            }
        }
}
