/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Admin;

import Business.Business;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajaygoel
 */
public class AddSupplierUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form AddSupplierUserAccount
     */
    private JPanel userProcessContainer;
    private Business business;

    AddSupplierUserAccount(JPanel userProcessContainer, Business business) {
        initComponents();
        this.business = business;
        this.userProcessContainer=userProcessContainer;
        populateSuppliers();
        populateRoles();
    }
    
    public void populateSuppliers(){
        SupplierComboBox.removeAll();
        for(Supplier s: business.getSupplierDirectory().getSupplierDirectory())
        {
            SupplierComboBox.addItem(s);
        }
        
    }
    
    public void populateRoles(){
        
        RoleComboBox.removeAll();
        RoleComboBox.addItem(UserAccount.ADMIN_ROLE);
        RoleComboBox.addItem(UserAccount.CUSTOMER_ROLE);
        RoleComboBox.addItem(UserAccount.SUPPLIER_ROLE);
        
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UserNameTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PasswordTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        activeRadioBtn = new javax.swing.JRadioButton();
        NoRadioBtn = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        SupplierComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        RoleComboBox = new javax.swing.JComboBox();
        BackBtn = new javax.swing.JButton();
        CreateBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Manage Suppliers User Account");

        jLabel3.setText("User name:");

        jLabel4.setText("Password:");

        jLabel5.setText("Is Active ?");

        activeRadioBtn.setSelected(true);
        activeRadioBtn.setText("yes");
        activeRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeRadioBtnActionPerformed(evt);
            }
        });

        NoRadioBtn.setText("No");
        NoRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoRadioBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Supplier :");

        SupplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Role :");

        BackBtn.setText("<< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        CreateBtn.setText("Create User Account");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(UserNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SupplierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(PasswordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(activeRadioBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NoRadioBtn))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CreateBtn)
                        .addGap(13, 13, 13)))
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PasswordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(activeRadioBtn)
                        .addComponent(NoRadioBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SupplierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn)
                    .addComponent(CreateBtn))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void activeRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeRadioBtnActionPerformed
        // TODO add your handling code here:
        if(activeRadioBtn.isSelected()){
            NoRadioBtn.setSelected(false);
        }
    }//GEN-LAST:event_activeRadioBtnActionPerformed

    private void NoRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoRadioBtnActionPerformed
        // TODO add your handling code here:
        if(NoRadioBtn.isSelected()){
            activeRadioBtn.setSelected(false);
        }

    }//GEN-LAST:event_NoRadioBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // TODO add your handling code here:

        String UserName = UserNameTxtField.getText().trim();
        String Password = PasswordTxtField.getText().trim();

        if(UserName.equals("")||Password.equals("")){
            JOptionPane.showMessageDialog(this, "Invalid userName and password","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        UserAccount ua = business.getUserAccountDirectory().addUserAccount();
        ua.setUserName(UserName);
        ua.setPassword(Password);
        //String sup_name = (String) SupplierComboBox.getSelectedItem();
        ua.setRole(UserAccount.SUPPLIER_ROLE);
        for(Supplier s : business.getSupplierDirectory().getSupplierDirectory())
        {
            System.out.println(SupplierComboBox.getSelectedItem());
            System.out.println(s.getSupplier_name());
            if(s.equals(SupplierComboBox.getSelectedItem()))
            {
                System.out.println(ua);
                System.out.println("Hello");
                s.setUserAccount(ua);
            }
        }
           
        //ua.setPerson(()SupplierComboBox.getSelectedItem());

        if(activeRadioBtn.isSelected()){
            ua.setIsActive(true);
        }
        else{
            ua.setIsActive(false);
        }
        JOptionPane.showMessageDialog(this, "User Account has been successfully created","Info", JOptionPane.INFORMATION_MESSAGE);
        UserNameTxtField.setText("");
        PasswordTxtField.setText("");
        

    }//GEN-LAST:event_CreateBtnActionPerformed

    private void SupplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JRadioButton NoRadioBtn;
    private javax.swing.JTextField PasswordTxtField;
    private javax.swing.JComboBox RoleComboBox;
    private javax.swing.JComboBox SupplierComboBox;
    private javax.swing.JTextField UserNameTxtField;
    private javax.swing.JRadioButton activeRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}