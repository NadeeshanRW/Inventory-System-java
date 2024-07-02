/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Dbase.DataConection;
import Variyableclass.Category;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.TableModel;
/**
 *
 * @author nadee
 */
public class Managecatogary extends javax.swing.JFrame {

    
        private int Var1 =0;
    
    
    public Managecatogary() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    private boolean delet(String Id) {
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete catogory with ID " + Id + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        return response == JOptionPane.YES_OPTION;
    }
    
    
    
   //validate to notnull 
    private boolean validateFields() {
        if (!nameText.getText().equals("")) {
            return false;

        } else {
            return true;
        }

    }

    
    
    @SuppressWarnings("unchecked")
    
     
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablecatogory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        deletebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setText("Manage  Category");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 270, 44));

        tablecatogory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        tablecatogory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecatogoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablecatogory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 301, 282));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 185, 37, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 142, 57, 37));

        nameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 191, 322, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, -1, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 410, 40));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 530, 30));

        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
 
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        DefaultTableModel table = (DefaultTableModel) tablecatogory.getModel();

        try {
            //databace conection
            Connection connect = DataConection.getCon();
            Statement state = connect.createStatement();
            ResultSet rs = state.executeQuery("select * from category");
            
              while(rs.next()){
                table.addRow(new Object[]{rs.getString("category_pk"),rs.getString("name")});
            }  


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

       btnupdate.setEnabled(false);

    }//GEN-LAST:event_formComponentShown

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed

    }//GEN-LAST:event_nameTextActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

       Category Categoryd = new Category();
       Categoryd.setName(nameText.getText());
       
       
       
       if (validateFields()){
           JOptionPane.showMessageDialog(null,"all files are required" );
           
       }
       else{
           try{
               Connection connect= DataConection.getCon();
               PreparedStatement ps =connect.prepareStatement("insert into category (name) values(?)");
               
               
               ps.setString(1, Categoryd.getName());
               ps.executeUpdate();
               
               
               JOptionPane.showMessageDialog(null, "category added Sucessfully");
               setVisible(false);
               
               new Managecatogary().setVisible(true);
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
       }
    
        
        
        
        
        
        

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        
        
          Category Cat = new Category();
       Cat.setName(nameText.getText());
    //validate   
    if (validateFields()){
           JOptionPane.showMessageDialog(null,"all files are required" );
           
       }
       else{
           try{
               Connection connect= DataConection.getCon();
               PreparedStatement ps =connect.prepareStatement("update category set name=? where category_pk=? ");
               
               ps.setString(1, Cat.getName());
               ps.setInt(2, Var1);
               ps.executeUpdate();
               
               
               JOptionPane.showMessageDialog(null, "category update Sucessfully");
               setVisible(false);
               new Managecatogary().setVisible(true);
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
        
        
        
        
        
       } 
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
       
        setVisible(false);
        new Managecatogary().setVisible(true);
        
        
    }//GEN-LAST:event_btnresetActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void tablecatogoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecatogoryMouseClicked

        int row =tablecatogory.getSelectedRow();
        TableModel table =tablecatogory.getModel();
        
        
        String id =table.getValueAt(row, 0).toString();
        Var1  = Integer.parseInt(id);

        
        String name =table.getValueAt(row, 1).toString();
        
        
        nameText.setText(name);
        btnsave.setEnabled(false);
        btnupdate.setEnabled(true);
        
        
        
        
        
    }//GEN-LAST:event_tablecatogoryMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       
          int selectedRow = tablecatogory.getSelectedRow();
    if (selectedRow != -1) {
        String catogoryId = (String) tablecatogory.getValueAt(selectedRow, 0);

        if (delet(catogoryId)) { 
            try {
                Connection connect = DataConection.getCon();
                String sql = "DELETE FROM category WHERE category_pk = ?";
                PreparedStatement ps = connect.prepareStatement(sql);
                ps.setString(1, catogoryId);
                int rowsAffected = ps.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Data deleted successfully.");
                    

                } else {
                    JOptionPane.showMessageDialog(this, "catogory ID not found.");
                }

                setVisible(false);
                new Managecatogary().setVisible(true);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error : " + e.getMessage());
            }
        }
    } 
    else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    }
       
        
        
    }//GEN-LAST:event_deletebtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Managecatogary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton deletebtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTable tablecatogory;
    // End of variables declaration//GEN-END:variables
}
