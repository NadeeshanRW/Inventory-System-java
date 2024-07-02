
import Dbase.DataConection;
import javax.swing.JOptionPane;
import Variyableclass.Manageuser;
import java.awt.HeadlessException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import Variyableclass.Manageuser;
import java.awt.Color;
import javax.swing.table.TableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nadee
 */
public class ManageUser extends javax.swing.JFrame {
 
 private int abc = 0;
  
  
    public ManageUser() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    private boolean confirmdelet(String Id) {
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete usertable_user with ID " + Id + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        return response == JOptionPane.YES_OPTION;
    }
    
    
    
     private void search(String nameOrUniqueId){
        DefaultTableModel table = (DefaultTableModel)table_user.getModel();
        table.setRowCount(0);

        try{
          Connection connect = DataConection.getCon();
            Statement state = connect.createStatement();
          ResultSet rs = state.executeQuery("SELECT * FROM userdata WHERE name LIKE '"+nameOrUniqueId+ "%' OR appuser_pk LIKE '"+nameOrUniqueId+ "%'");
          while(rs.next()){
             table.addRow(new Object[]{rs.getString("appuser_pk"),rs.getString("name"),rs.getString("mobileNumber"),rs.getString("email"),rs.getString("address"),rs.getString("status")}); 
          }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private boolean validateFields(String fromType) {

        // Create a new HashMap
        HashMap<String, String> hashMap = new HashMap<>();

        // Input data into the HashMap
        hashMap.put("name", nameText.getText());
        hashMap.put("phone", phoneText.getText());
        hashMap.put("email", EMAIL.getText());
        hashMap.put("address", txtadress.getText());
        
        
            //validate data is not null
        if (fromType.equals("edit") && !hashMap.get("name").equals("") && !hashMap.get("phone").equals("") && !hashMap.get("email").equals("") && !hashMap.get("address").equals("")) {
            return false;
        } else if (fromType.equals("new") && !hashMap.get("name").equals("") && !hashMap.get("phone").equals("") && !hashMap.get("email").equals("") && !hashMap.get("address").equals("")) {
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
        table_user = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        EMAIL = new javax.swing.JTextField();
        txtadress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcombobox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JTextField();
        batnupdate = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        deletbttn = new javax.swing.JButton();
        searchfeld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setText("Manage  Users");

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Mobile Number", "EMAIL", "Adress", "Status"
            }
        ));
        table_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_user);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mobile Number");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Address");

        nameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        phoneText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        EMAIL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtadress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("status");

        txtcombobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "member" }));
        txtcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcomboboxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Password");

        PASSWORD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        batnupdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        batnupdate.setText("UPDATE");
        batnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batnupdateActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnclose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        deletbttn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deletbttn.setText("DELETE");
        deletbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletbttnActionPerformed(evt);
            }
        });

        searchfeld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchfeld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchfeldKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nameText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EMAIL, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtadress, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PASSWORD, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcombobox, javax.swing.GroupLayout.Alignment.LEADING, 0, 287, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(batnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(deletbttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(57, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(864, Short.MAX_VALUE)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batnupdate)
                            .addComponent(btnsave)
                            .addComponent(btnreset)
                            .addComponent(deletbttn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnclose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     
    
    
    
    
    
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      DefaultTableModel table = (DefaultTableModel) table_user.getModel();
      try{
          Connection connect = DataConection.getCon();
          Statement state =connect.createStatement();
          ResultSet rs = state.executeQuery("select * from userdata WHERE userRole = 'Admin'");
          while(rs.next()){
          
         table.addRow(new Object[]{rs.getString("appuser_pk"),rs.getString("name"),rs.getString("mobileNumber"),rs.getString("email"),rs.getString("address"),rs.getString("status")});
     
  
          }
        
      
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
     batnupdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    
    
    
    
    
    
    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
    
    }//GEN-LAST:event_nameTextActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
              setVisible(false);
              new ManageUser().setVisible(true);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
     
       //set valius from data setters
       
        
       Manageuser userData = new Manageuser();
        userData.setName(nameText.getText());
        userData.setMobileNumber(phoneText.getText());
        userData.setEmail(EMAIL.getText());
        userData.setPassword(txtadress.getText());
        userData.setAddress(PASSWORD.getText());
        userData.setStatus((String) txtcombobox.getSelectedItem());
        
     
       if (validateFields("new")){
           JOptionPane.showMessageDialog(null, "all file are requread");
       }
        
       else {
           
           try{
               
               
               //get data from getters 
               Connection connect = DataConection.getCon();
               PreparedStatement ps =connect.prepareStatement("insert into userdata (userRole,name,mobileNumber,email,password,address,status) values ('Admin',?,?,?,?,?,?)");
                   ps.setString(1, userData.getName());
                   ps.setString(2, userData.getMobileNumber());
                   ps.setString(3, userData.getEmail());
                   ps.setString(4, userData.getPassword());
                   ps.setString(5, userData.getAddress());
                   ps.setString(6, userData.getStatus());
                   ps.executeUpdate();
                   JOptionPane.showMessageDialog(null, "user added successfulliy");
                   setVisible(false);
                   new ManageUser().setVisible(true);
               
               
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
           }
           
       }
        
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void table_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userMouseClicked

        int index = table_user.getSelectedRow();
        
        //makeobject
        TableModel model = table_user.getModel();

        //assing string valive
        String id = model.getValueAt(index,0).toString();
       String name = model.getValueAt(index,1).toString();
       String mobileNumber = model.getValueAt(index,2).toString();
       String email = model.getValueAt(index,3).toString();
       String address = model.getValueAt(index,4).toString();
        String status = model.getValueAt(index,5).toString();
        
        
        abc = Integer.parseInt(id);
        nameText.setText(name);
        phoneText.setText(mobileNumber);
        EMAIL.setText(email);
        txtadress.setText(address);
        txtcombobox.removeAllItems();
        
        
        
        //chack status admin ormember in status combo box
        if (status.equals("Admin")) {

            txtcombobox.addItem("Admin");
            txtcombobox.addItem("member");

        } else {
            txtcombobox.addItem("member");
            txtcombobox.addItem("Admin");

        }   
        
        //paswordcanot edit and that text fild color white        
        PASSWORD.setEditable(false);
        PASSWORD.setBackground(Color.white);
        
        //vicibale battn
        btnsave.setEnabled(false);
        batnupdate.setEnabled(true);
        
    }//GEN-LAST:event_table_userMouseClicked

    private void batnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batnupdateActionPerformed
       
        
        // Create a new HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        
         // Input data into the HashMap
        hashMap.put("name", nameText.getText());
        hashMap.put("phone", phoneText.getText());
        hashMap.put("email", EMAIL.getText());
        hashMap.put("password", PASSWORD.getText());
        hashMap.put("status", (String) txtcombobox.getSelectedItem());
        
        
            //add hashmap output into set mtord 
        
        Manageuser userData = new Manageuser();
         
        userData.setName(hashMap.get("name"));
        userData.setMobileNumber(hashMap.get("phone"));
        userData.setEmail( hashMap.get("email"));
        userData.setAddress(hashMap.get("passwor"));
        userData.setStatus( hashMap.get("status"));
        
        
        //validate filds 
        if (validateFields("edit")){
           JOptionPane.showMessageDialog(null, "all file are requread");
       }
        
       else {
           
           try{
               //data bace conection
               Connection connect = DataConection.getCon();
               PreparedStatement ps =connect.prepareStatement("update userdata set name=?,mobileNumber=?,email=?,address=?,status=? where appuser_pk=?");
               
               
               //call user data get metord and set ps .setstring
                   ps.setString(1, userData.getName());
                   ps.setString(2, userData.getMobileNumber());
                   ps.setString(3, userData.getEmail());
                  ps.setString(4, userData.getAddress());
                   ps.setString(5, userData.getStatus());
                   ps.setInt(6, abc);
                   ps.executeUpdate();
                   
                   
                   //show messege
                   JOptionPane.showMessageDialog(null, "user updated successfulliy");
                   setVisible(false);
                   new ManageUser().setVisible(true);
               
               
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
           }
           
       }
        
        
        
        
        
        
    }//GEN-LAST:event_batnupdateActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomboboxActionPerformed

    private void deletbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletbttnActionPerformed
        
         int selectedRow = table_user.getSelectedRow();
    if (selectedRow != -1) {
        String userId = (String) table_user.getValueAt(selectedRow, 0);

        if (confirmdelet(userId)) { 
            try {
                Connection connect = DataConection.getCon();
                String sql = "DELETE FROM userdata WHERE appuser_pk = ?";
                PreparedStatement ps = connect.prepareStatement(sql);
                ps.setString(1, userId);
                int rowsAffected = ps.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Data deleted successfully.");
                    

                } else {
                    JOptionPane.showMessageDialog(this, "custormer ID not found.");
                }

                setVisible(false);
                new ManageUser().setVisible(true);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error : " + e.getMessage());
            }
        }
    } 
    else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    }
       
    
    }//GEN-LAST:event_deletbttnActionPerformed

    private void searchfeldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfeldKeyReleased
        
         String search = searchfeld.getText();
        search(search);
        
        
    }//GEN-LAST:event_searchfeldKeyReleased

    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JButton batnupdate;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton deletbttn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField searchfeld;
    private javax.swing.JTable table_user;
    private javax.swing.JTextField txtadress;
    private javax.swing.JComboBox<String> txtcombobox;
    // End of variables declaration//GEN-END:variables
}
