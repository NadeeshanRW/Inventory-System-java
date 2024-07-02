/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Dbase.DataConection;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Variyableclass.Productdata;
import javax.swing.table.TableModel;
/**
 *
 * @author nadee
 */
public class product extends javax.swing.JFrame {

    //create 2 variable as Var1 and Var2
    private int Var1 = 0;
    private int Var2 = 0;

    public product() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void getAllCategory() {
        try {

//databace conection
            Connection connect = DataConection.getCon();
            Statement state = connect.createStatement();

//get database conection into (rs) variable 
            ResultSet rs = state.executeQuery("select * from category");

//remove combo box item and add item using while loop
            ComboBoxcategory.removeAllItems();
            while (rs.next()) {
                ComboBoxcategory.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

     private boolean delet(String Id) {
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete product with ID " + Id + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        return response == JOptionPane.YES_OPTION;
    }
    
    //search 
    private void search(String nameOrUniqueId){
        DefaultTableModel table = (DefaultTableModel)tableproduct.getModel();
        table.setRowCount(0);

        try{
          Connection connect = DataConection.getCon();
            Statement state = connect.createStatement();
          ResultSet rs = state.executeQuery("SELECT * FROM product WHERE name LIKE '"+nameOrUniqueId+ "%' OR product_pk LIKE '"+nameOrUniqueId+ "%'");
          while(rs.next()){
            table.addRow(new Object[]{rs.getString("product_pk"),rs.getString("name"),rs.getString("quantity"),rs.getString("price"),rs.getString("description"),rs.getString("category_Fk")}); 
          }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //chack the text fild is null or not null
    private boolean validateFileads(String fromType) {
        if (fromType.equals("edit") && !nameText.getText().equals("") && !txtprice.getText().equals("") && !txtdiscrioption.getText().equals("")) {
            return false;
        } else if (fromType.equals("new") && !nameText.getText().equals("") && !txtprice.getText().equals("") && !txtdiscrioption.getText().equals("") && !txtQuantity.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }


    
    
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableproduct = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblquantity = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtdiscrioption = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxcategory = new javax.swing.JComboBox<>();
        btnsave = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        deletbttn = new javax.swing.JButton();
        searcht = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tableproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "DISCRIPTION", "CATOGORY ID", "CATAGORYNAME"
            }
        ));
        tableproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableproductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableproduct);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setText("Product  Manage");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Price");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Discription");

        lblquantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblquantity.setText("Quantity");

        nameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        txtdiscrioption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtdiscrioption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiscrioptionActionPerformed(evt);
            }
        });

        txtprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Catogory");

        ComboBoxcategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboBoxcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setText("update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        deletbttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletbttn.setText("Delete");
        deletbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletbttnActionPerformed(evt);
            }
        });

        searcht.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searcht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText)
                            .addComponent(txtQuantity)
                            .addComponent(txtprice)
                            .addComponent(lblquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiscrioption)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deletbttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnreset)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searcht, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(btnclose))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searcht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdiscrioption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        getAllCategory();

        DefaultTableModel model = (DefaultTableModel) tableproduct.getModel();
        try {
            //databace conection 
            Connection connect = DataConection.getCon();
            Statement state = connect.createStatement();
            ResultSet rs = state.executeQuery("select *from product inner join category on product.category_fk = category.category_pk");

           //add data to table using while loop 
            
                  while (rs.next()){
               model.addRow(new Object[]{rs.getString("product_pk"),rs.getString("name"),rs.getString("quantity"),rs.getString("price"),rs.getString("description"),rs.getString("category_Fk"),rs.getString(8)});
           }
           
 
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        btnupdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed

    }//GEN-LAST:event_nameTextActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtdiscrioptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiscrioptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiscrioptionActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
      
        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        setVisible(false);
        new product().setVisible(true);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       
     
        
        
      //create object using setvaliue set metord
        Productdata pro = new Productdata();

        pro.setName(nameText.getText());
        pro.setQuantity(txtQuantity.getText());
        pro.setPrice(txtprice.getText());
        pro.setDescription(txtdiscrioption.getText());
        
        
        String category = (String) ComboBoxcategory.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        
        //validate txt
             if (validateFileads("new")){
            JOptionPane.showMessageDialog(null,"All file are requard"  );
       
        } else {
            try {

                Connection connect = DataConection.getCon();
                PreparedStatement ps = connect.prepareStatement("insert into product (name,quantity,price,description,category_fk) values(?,?,?,?,?)");
                
                
                ps.setString(1, pro.getName());
                ps.setString(2, pro.getQuantity());
                ps.setString(3, pro.getPrice());
                ps.setString(4, pro.getDescription());
                ps.setString(5, categoryId[0]);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "product added Succsessfully");
                setVisible(false);
                new product().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

 
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tableproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproductMouseClicked
   
        int row = tableproduct.getSelectedRow();
        TableModel tabl = tableproduct.getModel();
            //retrev data in to table
        String id = tabl.getValueAt(row, 0).toString();
        String name = tabl.getValueAt(row, 1).toString();
        String quantity = tabl.getValueAt(row, 2).toString();
        String price = tabl.getValueAt(row, 3).toString();
        String description = tabl.getValueAt(row, 4).toString();
        String categoryId = tabl.getValueAt(row, 5).toString();
        String categoryName = tabl.getValueAt(row, 6).toString();

        Var1 = Integer.parseInt(id);
        nameText.setText(name);
        Var2 = 0;
        lblquantity.setText("add quantity");
        Var2 = Integer.parseInt(quantity);
        txtprice.setText(price);
        txtdiscrioption.setText(description);
        ComboBoxcategory.removeAllItems();
        ComboBoxcategory.addItem(categoryId + "-" + categoryName);

        try {
            Connection connect = DataConection.getCon();
            Statement state = connect.createStatement();
            ResultSet rs = state.executeQuery("select * from category");
            //add catogory to combo box
            while (rs.next()) {
                if (Integer.parseInt(categoryId) != rs.getInt(1)) {
                    ComboBoxcategory.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        btnsave.setEnabled(false);
        btnupdate.setEnabled(true);
    }//GEN-LAST:event_tableproductMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        //create object using setvaliue set metord   
        Productdata pro = new Productdata();

        pro.setName(nameText.getText());
        pro.setQuantity(txtQuantity.getText());
        pro.setPrice(txtprice.getText());
        pro.setDescription(txtdiscrioption.getText());

        String category = (String) ComboBoxcategory.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        if (validateFileads("edit")) {
            JOptionPane.showMessageDialog(null, "All file are requard");

        } else {
            try {
                if (!pro.getQuantity().equals("")) {

                    Var2 = Var2 + Integer.parseInt(pro.getQuantity());
                }

                Connection connect = DataConection.getCon();
                PreparedStatement ps = connect.prepareStatement("update product set name=?,quantity=?,price=?,description=?,category_fk=? where product_pk=?");
               
                ps.setString(1, pro.getName());
                ps.setInt(2, Var2);
                ps.setString(3, pro.getPrice());
                ps.setString(4, pro.getDescription());
                ps.setString(5, categoryId[0]);
                ps.setInt(6, Var1);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "product update Succsessfully");
                setVisible(false);
                new product().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void deletbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletbttnActionPerformed

        int selectedRow = tableproduct.getSelectedRow();
        //chack row select 
        if (selectedRow != -1) {
            String productId = (String) tableproduct.getValueAt(selectedRow, 0);
                
            // chack produduct is delet 
            if (delet(productId)) {
                try {
                    Connection connect = DataConection.getCon();
                    String sql = "DELETE FROM product WHERE product_pk = ?";
                    PreparedStatement ps = connect.prepareStatement(sql);
                    ps.setString(1, productId);
                    int rowsAffected = ps.executeUpdate();
                        //chack delet was sucsuss
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Data deleted successfully.");

                    } else {
                        JOptionPane.showMessageDialog(this, "product ID not found.");
                    }

                    setVisible(false);
                    new product().setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "An error : " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }


    }//GEN-LAST:event_deletbttnActionPerformed

    private void searchtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtKeyReleased

        String search = searcht.getText();
        search(search);


    }//GEN-LAST:event_searchtKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxcategory;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton deletbttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblquantity;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField searcht;
    private javax.swing.JTable tableproduct;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtdiscrioption;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
