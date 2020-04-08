/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Business;
import Business.Customer.Customer;
import Business.Order.OrderItem;
import Business.Product.Product;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ankit
 */
public class BuyProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BuyProductJPanel
     */
    public BuyProductJPanel() {
    }
    
    private JPanel userProcessContainer;
    private Business business;
    private Product p;
    private Customer cust;

    BuyProductJPanel(JPanel userProcessContainer, Business business, Product p, Customer cust) {
                initComponents();
                this.userProcessContainer= userProcessContainer;
                this.business=business;
                this.p=p;
                this.cust= cust;
                populateFields();

    }
    
    public void populateFields(){
        
        prodNameJTxtField.setText(p.getProdName());
        modelNumJTxtField.setText(Integer.toString(p.getModelNumber()));
        priceJTxtField.setText(Integer.toString(p.getPrice()));
        availQuantJTxtField.setText(Integer.toString(p.getAvail()));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        placeOrderJBtn = new javax.swing.JButton();
        buyQuantJTxtField = new javax.swing.JTextField();
        availQuantJTxtField = new javax.swing.JTextField();
        priceJTxtField = new javax.swing.JTextField();
        modelNumJTxtField = new javax.swing.JTextField();
        prodNameJTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Product Cart");

        jLabel2.setText("Product Name: ");

        jLabel3.setText("Model Number: ");

        jLabel4.setText("Price: ");

        jLabel5.setText("Available Quantity: ");

        jLabel6.setText("Number of Items: ");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        placeOrderJBtn.setText("Place Order");
        placeOrderJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderJBtnActionPerformed(evt);
            }
        });

        availQuantJTxtField.setEditable(false);
        availQuantJTxtField.setEnabled(false);

        priceJTxtField.setEditable(false);
        priceJTxtField.setEnabled(false);

        modelNumJTxtField.setEditable(false);
        modelNumJTxtField.setEnabled(false);

        prodNameJTxtField.setEditable(false);
        prodNameJTxtField.setEnabled(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/download.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(placeOrderJBtn)))
                        .addContainerGap(478, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prodNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNumJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availQuantJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyQuantJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(prodNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNumJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(priceJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(availQuantJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(buyQuantJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(placeOrderJBtn))
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderJBtnActionPerformed
        // TODO add your handling code here:
        
        int numberOfItem = 0;
        try {
            numberOfItem = Integer.parseInt(buyQuantJTxtField.getText());
        } catch (NumberFormatException numberFormatException) {
             JOptionPane.showMessageDialog(null, "Please enter valid number!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(numberOfItem<1 || numberOfItem>p.getAvail()){
               JOptionPane.showMessageDialog(null, "Please enter quantity smaller than or equal to availability!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrderItem oi=  cust.addOrder();
        
        oi.setProduct(p);
        oi.setQuantity(numberOfItem);
        oi.setSalesPrice();
        
        FinalPaymentJPanel vs = new FinalPaymentJPanel(userProcessContainer, oi, cust, business);
        userProcessContainer.add("ViewSupplier", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_placeOrderJBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                  userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availQuantJTxtField;
    private javax.swing.JTextField buyQuantJTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField modelNumJTxtField;
    private javax.swing.JButton placeOrderJBtn;
    private javax.swing.JTextField priceJTxtField;
    private javax.swing.JTextField prodNameJTxtField;
    // End of variables declaration//GEN-END:variables
}