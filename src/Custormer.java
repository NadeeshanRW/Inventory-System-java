/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Dbase.DataConection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.sql.*;
import Variyableclass.Custdeatils;
import java.sql.PreparedStatement;
import java.util.HashMap;
import javax.swing.table.TableModel;
/**
 *
 * @author nadee
 */
public class Custormer extends javax.swing.JFrame {

    private int  ABC =0;
    
   
    public Custormer() {
        initComponents();
        //window come center the screen
        setLocationRelativeTo(null);
        
    }
   
    private boolean confirmdelet(String Id) {
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete customer with ID " + Id + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        return response == JOptionPane.YES_OPTION;
    }
    
    
    private void search(String nameOrUniqueId){
        DefaultTableModel table = (DefaultTableModel)custable.getModel();
        table.setRowCount(0);

        try{
          Connection connect = DataConection.getCon();
            Statement state = connect.createStatement();
          ResultSet rs = state.executeQuery("SELECT * FROM customer WHERE name LIKE '"+nameOrUniqueId+ "%' OR customer_pk LIKE '"+nameOrUniqueId+ "%'");
          while(rs.next()){
             table.addRow(new Object[] {rs.getString("customer_pk"),rs.getString("name"),rs.getString("mobileNumber"),rs.getString("email")}); 
          }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private boolean validateFields(){
         // Create a new HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        
        // Input data into the HashMap
        hashMap.put("name", nametxt.getText());
        hashMap.put("mobile", mobiletxt.getText());
        hashMap.put("email", emailtxt.getText());
        
    
        
        //validate the data is = null 
       
        if(!hashMap.get("name").equals("")&&!hashMap.get("mobile").equals("")&&!hashMap.get("email").equals("")){

            return false;
        }else {
            return true;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        custable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        mobiletxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        upadtebtn = new javax.swing.JButton();
        closebttn = new javax.swing.JButton();
        ser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setText("Manage  Customers");

        custable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "MOBILE NUMBER", "EMAIL"
            }
        ));
        custable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(custable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("MobileNumber");

        nametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mobiletxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        savebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        upadtebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        upadtebtn.setText("UPDATE");
        upadtebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upadtebtnActionPerformed(evt);
            }
        });

        closebttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebttn.setText("CLOSE");
        closebttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebttnActionPerformed(evt);
            }
        });

        ser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("search");

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(upadtebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btndelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetbtn))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailtxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobiletxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nametxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closebttn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(328, 328, 328))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ser, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mobiletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(savebtn)
                                    .addComponent(upadtebtn)
                                    .addComponent(resetbtn)
                                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(68, 68, 68)
                        .addComponent(closebttn))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        
        try{
            Connection connect = DataConection.getCon();
            Statement state = connect.createStatement();
            ResultSet rs = state.executeQuery("select * from customer");
            
            
        DefaultTableModel  table = (DefaultTableModel) custable.getModel();    
           while(rs.next()){
               table.addRow(new Object[] {rs.getString("customer_pk"),rs.getString("name"),rs.getString("mobileNumber"),rs.getString("email")});
               
           } 
            
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        upadtebtn.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void closebttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebttnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closebttnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        setVisible(false);
        new Custormer().setVisible(true);
        
    }//GEN-LAST:event_resetbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
      
   
        
        //send data using set metord 
        
        Custdeatils cd =new Custdeatils();
        cd.setName(nametxt.getText());
        cd.setMobileNumber(mobiletxt.getText());
        cd.setEmail(emailtxt.getText());
        
        if (validateFields()){
            JOptionPane.showMessageDialog(null, "all fields requread");
        }
        else{
            try{
                Connection connect = DataConection.getCon();
                PreparedStatement ps = connect.prepareStatement("insert into customer(name,mobileNumber,email) values (?,?,?)"); 
                
                //get data from setters
                ps.setString(1, cd.getName());
                ps.setString(2, cd.getMobileNumber());
                ps.setString(3, cd.getEmail());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "customer added succsesfully");
                setVisible(false);
                new Custormer().setVisible(true);
              }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
        
        
        
        
        
    }//GEN-LAST:event_savebtnActionPerformed

    private void custableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custableMouseClicked
      
        int rowdata = custable.getSelectedRow();
        
        //make object
        TableModel table = custable.getModel();
        //call object and asing data into  string variable
        String id =table.getValueAt(rowdata, 0).toString();
        String name =table.getValueAt(rowdata, 1).toString();
        String mobileNumber =table.getValueAt(rowdata, 2).toString();
        String email =table.getValueAt(rowdata, 3).toString();
        
        
        
        ABC = Integer.parseInt(id);
        nametxt.setText(name);
        mobiletxt.setText(mobileNumber);
        emailtxt.setText(email);
        
        
        //buttn show or not show 
        savebtn.setEnabled(false);
        upadtebtn.setEnabled(true);
    }//GEN-LAST:event_custableMouseClicked

    private void upadtebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upadtebtnActionPerformed
      //set metord 
        Custdeatils cd = new Custdeatils();
        cd.setName(nametxt.getText());
        cd.setMobileNumber(mobiletxt.getText());
        cd.setEmail(emailtxt.getText());
        
        //validate data 
        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "all fields requread");
        } else {
            try {
                Connection connect = DataConection.getCon();
                PreparedStatement ps = connect.prepareStatement("update customer set name=?,mobileNumber=?,email=? where customer_pk=?");
                
                //get the data from get metord and its assign to variiable
                ps.setString(1, cd.getName());
                ps.setString(2, cd.getMobileNumber());
                ps.setString(3, cd.getEmail());
                ps.setInt(4, ABC);
                ps.executeUpdate();
                
                
                JOptionPane.showMessageDialog(null, "customer Updated succsesfully");
                setVisible(false);
                
                new Custormer().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }


        
        
        
    }//GEN-LAST:event_upadtebtnActionPerformed

    private void serKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serKeyReleased
       
        
         String search = ser.getText();
        search(search);
    }//GEN-LAST:event_serKeyReleased

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       
        
       int selectedRow = custable.getSelectedRow();
    if (selectedRow != -1) {
        String customerId = (String) custable.getValueAt(selectedRow, 0);

        if (confirmdelet(customerId)) { // Separate function for confirmation
            try {
                Connection connect = DataConection.getCon();
                String sql = "DELETE FROM customer WHERE customer_pk = ?";
                PreparedStatement ps = connect.prepareStatement(sql);
                ps.setString(1, customerId);
                int rowsAffected = ps.executeUpdate();
                 //chack delet was sucsuss
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Data deleted successfully.");
                    

                } else {
                    JOptionPane.showMessageDialog(this, "custormer ID not found.");
                }

                setVisible(false);
                new Custormer().setVisible(true);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error : " + e.getMessage());
            }
        }
    } 
    else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    }


 
        
        
        
        
        
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Custormer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Custormer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Custormer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Custormer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Custormer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton closebttn;
    private javax.swing.JTable custable;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField ser;
    private javax.swing.JButton upadtebtn;
    // End of variables declaration//GEN-END:variables
}
