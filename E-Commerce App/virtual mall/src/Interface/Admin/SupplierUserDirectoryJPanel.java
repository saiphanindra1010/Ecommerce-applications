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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajaygoel
 */
public class SupplierUserDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierUserDirectoryJPanel
     */
    private JPanel userProcessContainer;
    private Business business;

    SupplierUserDirectoryJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        refreshtable();
    }
    
    public void refreshtable(){
        DefaultTableModel dtm =(DefaultTableModel) TblSupplierUsr.getModel();
        dtm.setRowCount(0);
        
        
       
        for(Supplier s: business.getSupplierDirectory().getSupplierDirectory()){
          
           Object row[]= new Object[3];
            row[0] = s;
            row[1] = s.getUserAccount();
            row[2] = s.getSupplier_location();
            dtm.addRow(row);
            
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
        TblSupplierUsr = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        viewSupplierJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        TblSupplierUsr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User Name", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblSupplierUsr);

        BackBtn.setText("<< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        RemoveBtn.setText("Remove Supplier");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        viewSupplierJBtn.setText("View Supplier");
        viewSupplierJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSupplierJBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Manage Supplier Accounts");

        UpdateBtn.setText("Update Supplier");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewSupplierJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn)
                    .addComponent(RemoveBtn)
                    .addComponent(viewSupplierJBtn)
                    .addComponent(UpdateBtn))
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_BackBtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = TblSupplierUsr.getSelectedRow();
        if(selectedRow>= 0 ){
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove ?","Warning", JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
             
                
                 Supplier s= (Supplier) TblSupplierUsr.getValueAt(selectedRow,0);
                 UserAccount ua= s.getUserAccount();
                 business.getSupplierDirectory().getSupplierDirectory().remove(s);
                 

                business.getUserAccountDirectory().delUserccount(ua);
                JOptionPane.showMessageDialog(null, "Supplier deleted","Error", JOptionPane.ERROR_MESSAGE);
                refreshtable();

            }
        }
        else
        JOptionPane.showMessageDialog(null, "Please select any row to remove","Infor", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_RemoveBtnActionPerformed

    private void viewSupplierJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSupplierJBtnActionPerformed
        // TODO add your handling code here:

        
         int selectedRow = TblSupplierUsr.getSelectedRow();
        if(selectedRow>= 0 ){
           // UserAccount ua = 
            Supplier s= (Supplier) TblSupplierUsr.getValueAt(selectedRow,0);
   
        SupplierDetailsJPanel sudjpanel = new SupplierDetailsJPanel(userProcessContainer,business, s);
        userProcessContainer.add("SupplierDetailsJPanel",sudjpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
            
         }
        else
        JOptionPane.showMessageDialog(null, "Please select any row to remove","Infor", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_viewSupplierJBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = TblSupplierUsr.getSelectedRow();
        if(selectedRow>=0)
        {
            Supplier s = (Supplier) TblSupplierUsr.getValueAt(selectedRow,0);
            
        
        Interface.Admin.UpdateSupplierDetailsJPanel iausdjp = new Interface.Admin.UpdateSupplierDetailsJPanel(userProcessContainer,business,s);
        userProcessContainer.add("Interface.Admin.UpdateSupplierDetailsJPanel",iausdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        }
        
        else
        JOptionPane.showMessageDialog(null, "Please select any row to remove","Infor", JOptionPane.INFORMATION_MESSAGE);

        
    }//GEN-LAST:event_UpdateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JTable TblSupplierUsr;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewSupplierJBtn;
    // End of variables declaration//GEN-END:variables
}
