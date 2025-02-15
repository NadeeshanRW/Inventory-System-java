/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Dbase.DataConection;
import Dbase.InventoryUtill;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Variyableclass.Productdata;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import docu.Pdf;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.TableModel;

/**
 *
 * @author nadee
 */
public class Order extends javax.swing.JFrame {

    private int Var1 = 0;
    private int Var2 = 0;
    private int Var3 = 0;
    private String Svar4 = "";

    
    public Order() {
        initComponents();
        setLocationRelativeTo(null);

    }

    private void clearProductFields() {
        
        Var2 = 0;
        txtproductname.setText("");
        txtproductprice.setText("");
        txtproductdiscrp.setText("");
        txtorderqontity.setText("");

    }

    
    //create unique id using time
    public String getUniqueid(String prefix) {
        return prefix + System.nanoTime();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablecustomer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablecart = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableproduct = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textcustomername = new javax.swing.JTextField();
        txtcustermarmonum = new javax.swing.JTextField();
        txtcusEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtproductname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtproductprice = new javax.swing.JTextField();
        txtorderqontity = new javax.swing.JTextField();
        txtproductdiscrp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnsaveorder = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lablfinaltotal = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setText("Order  Manage");

        tablecustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Email"
            }
        ));
        tablecustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablecustomer);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("cart");

        tablecart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "product ID", "Name ", "Quantity", "Price", "Discription", "Sub Total"
            }
        ));
        tablecart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecartMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablecart);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer details");

        tableproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name ", "Price", "Quantity", "Discription", "Cat_ ID", "Cat_name"
            }
        ));
        tableproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableproductMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableproduct);
        if (tableproduct.getColumnModel().getColumnCount() > 0) {
            tableproduct.getColumnModel().getColumn(6).setHeaderValue("Cat_name");
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("product list");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Selected customer ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Mobile Number");

        textcustomername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtcustermarmonum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcustermarmonum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustermarmonumActionPerformed(evt);
            }
        });

        txtcusEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Select product");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("product name");

        txtproductname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("product discription");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("product price");

        txtproductprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtproductprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductpriceActionPerformed(evt);
            }
        });

        txtorderqontity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtproductdiscrp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtproductdiscrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductdiscrpActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Order Quantity");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("add to card");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Total Amount RS :");

        btnsaveorder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsaveorder.setText("Save Order Deatils");
        btnsaveorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveorderActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lablfinaltotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lablfinaltotal.setText("0000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(187, 187, 187))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel10))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtproductprice, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtorderqontity, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtproductdiscrp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(textcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcustermarmonum, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcusEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lablfinaltotal)
                                            .addGap(15, 15, 15))
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btnsaveorder, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton4)
                                            .addComponent(jButton3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(lablfinaltotal))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnsaveorder)))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcustermarmonum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcusEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(77, 77, 77)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtproductprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtproductdiscrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtorderqontity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        //set canot edit
        textcustomername.setEditable(false);
        txtcustermarmonum.setEditable(false);
        txtcusEmail.setEditable(false);
        txtproductname.setEditable(false);
        txtproductprice.setEditable(false);
        txtproductdiscrp.setEditable(false);

        DefaultTableModel table = (DefaultTableModel) tablecustomer.getModel();
        DefaultTableModel ptable = (DefaultTableModel) tableproduct.getModel();

        try {
            //databace conection
            Connection connect = DataConection.getCon();
            Statement state = connect.createStatement();
            ResultSet rs = state.executeQuery("select *from customer");
            
            
            while (rs.next()) {
                table.addRow(new Object[]{rs.getString("customer_pk"), rs.getString("name"), rs.getString("mobileNumber"), rs.getString("email")});
            }
            
            rs = state.executeQuery("select *from product inner join category on product.category_fk =category.category_pk");

            while (rs.next()) {

                ptable.addRow(new Object[]{rs.getString("product_pk"), rs.getString("name"), rs.getString("price"), rs.getString("quantity"), rs.getString("description"), rs.getString("category_fk"), rs.getString(8)});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_formComponentShown

    private void txtcustermarmonumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustermarmonumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustermarmonumActionPerformed

    private void txtproductpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductpriceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        new Order().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablecustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecustomerMouseClicked

        
        int row = tablecustomer.getSelectedRow();
        TableModel table = tablecustomer.getModel();
        
        //retre ve select costumerdata in the table
        String id = table.getValueAt(row, 0).toString();
        String name = table.getValueAt(row, 1).toString();
        String mobileNumber = table.getValueAt(row, 2).toString();
        String email = table.getValueAt(row, 3).toString();
        
        
        Var1 = Integer.parseInt(id);
        textcustomername.setText(name);
        txtcustermarmonum.setText(mobileNumber);
        txtcusEmail.setText(email);
        
        
    }//GEN-LAST:event_tablecustomerMouseClicked

    private void tableproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproductMouseClicked

        int row = tableproduct.getSelectedRow();
        TableModel table = tableproduct.getModel();
        
        
        
        String id = table.getValueAt(row, 0).toString();
        String productName = table.getValueAt(row, 1).toString();
        String productPrice = table.getValueAt(row, 2).toString();
        String productDescription = table.getValueAt(row, 4).toString();
        
        
        
        Var2 = Integer.parseInt(id);
        txtproductname.setText(productName);
        txtproductprice.setText(productPrice);
        txtproductdiscrp.setText(productDescription);


    }//GEN-LAST:event_tableproductMouseClicked

    private void txtproductdiscrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductdiscrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductdiscrpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        
        
        
        String Units = txtorderqontity.getText();
        
  // Check  quantity field empty
        if (!Units.equals("")) {
            //get data into product fild
            String productName = txtproductname.getText();
            String productDescription = txtproductdiscrp.getText();
            String productPrice = txtproductprice.getText();
            
  //calculation total
            
            int totalPrice = Integer.parseInt(txtorderqontity.getText()) * Integer.parseInt(productPrice);
            int chackStock = 0;
            int InCart = 0;

            try {
                Connection connect = DataConection.getCon();
                Statement state = connect.createStatement();
                ResultSet rs = state.executeQuery("select *from product where product_pk=" + Var2 + "");
          
//chack  product stock
                while (rs.next()) {
                    if (rs.getInt("quantity") >= Integer.parseInt(Units)) {
                        chackStock = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "product is out of stock . only " + rs.getInt("quantity") + "left");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
     
   //chack product in stock
            if (chackStock == 1) {
                DefaultTableModel model = (DefaultTableModel) tablecart.getModel();
               
                
   //chack allredy add the table
                if (tablecart.getRowCount() != 0) {
                    for (int i = 0; 1 < tablecart.getRowCount(); i++) {
                        if (Integer.parseInt(model.getValueAt(i, 0).toString()) == Var2) {
                            InCart = 1;
                            JOptionPane.showMessageDialog(null, "product alredy exist in cart ");
                        }
                    }
                }
   //product not all redy in cart and add
                if (InCart == 0) {
                    model.addRow(new Object[]{Var2, productName, Units, productPrice, productDescription, totalPrice});
                    Var3 = Var3 + totalPrice;
                    lablfinaltotal.setText(String.valueOf(Var3));
                    JOptionPane.showMessageDialog(null, "added successfully");
                }
                clearProductFields();

            }
        } else {
            JOptionPane.showMessageDialog(null, "No. of Quantity and product field is required");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablecartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecartMouseClicked

        int index = tablecart.getSelectedRow();
        
        int msg = JOptionPane.showConfirmDialog(null, "Do you want to remove this product", "select", JOptionPane.YES_NO_OPTION);
        
        //comform using fi function
        if (msg == 0) {
            TableModel model = tablecart.getModel();
            
            String subTotal = model.getValueAt(index, 5).toString();
            
            //update total price 
            Var3 = Var3 - Integer.parseInt(subTotal);
            lablfinaltotal.setText(String.valueOf(Var3));
            //remove selected row
            ((DefaultTableModel) tablecart.getModel()).removeRow(index);

        }
    }//GEN-LAST:event_tablecartMouseClicked

    private void btnsaveorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveorderActionPerformed

        if (Var3 != 0 && !textcustomername.getText().equals("")) {
            Svar4 = getUniqueid("bill-");

            DefaultTableModel dtm = (DefaultTableModel) tablecart.getModel();
            if (tablecart.getRowCount() != 0) {
                for (int i = 0; i < tablecart.getRowCount(); i++) {
                    try {
                        Connection connect = DataConection.getCon();
                        Statement state = connect.createStatement();
                        state.executeUpdate("update product set quantity=quantity-" + Integer.parseInt(dtm.getValueAt(i, 2).toString()) + " where product_pk=" + Integer.parseInt(dtm.getValueAt(i, 0).toString()));

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);

                    }
                }
            }
            try {

                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                Calendar cal = Calendar.getInstance();

                Connection connect = DataConection.getCon();
                PreparedStatement ps = connect.prepareStatement("insert into orderDetail(orderId,customer_fk,orderDate,totalPaid) values(?,?,?,?)");
                ps.setString(1, Svar4);
                ps.setInt(2, Var1);
                ps.setString(3, myFormat.format(cal.getTime()));
                ps.setInt(4, Var3);
                ps.executeUpdate();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }

            
            
            //make document 
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                //get date
                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                Calendar cal = Calendar.getInstance();
                //create a pdf write and open 
                PdfWriter.getInstance(doc, new FileOutputStream(InventoryUtill.billparth + "" + Svar4 + ".pdf"));
                doc.open();
               // add project name 
                Paragraph projectName = new Paragraph("                                            inventory Manegment System");
                doc.add(projectName);
                
                //add inside document
                Paragraph line = new Paragraph("****************************************************************************************************************");
                doc.add(line);
                //add details order 
                Paragraph detaissheet = new Paragraph("\tOrder ID:- " + Svar4 + "\nDate :- " + myFormat.format(cal.getTime()) + "\nTotal paid:- " + Var3);
                doc.add(detaissheet);
                doc.add(line);
                
                //creat table 5 colem 
                PdfPTable tbl =new PdfPTable(5);
                
                //table hadelers 
                PdfPCell nameCell =new PdfPCell(new Phrase("name"));
                PdfPCell DescriptionCell= new PdfPCell(new Phrase("Description"));
                PdfPCell priceCell =new PdfPCell(new Phrase("Price Per unit"));
                PdfPCell quantityCell= new PdfPCell(new Phrase("Quntity"));
                PdfPCell subTotalCell =new PdfPCell(new Phrase("sub Total price"));
                
                //add sell
                tbl.addCell(nameCell);
                tbl.addCell(DescriptionCell);
                tbl.addCell(priceCell);
                tbl.addCell(quantityCell);
                tbl.addCell(subTotalCell);
                
                
                //data from cart 
                
                for (int i=0;i< tablecart.getRowCount();i++){
                    tbl.addCell(tablecart.getValueAt(i, 1).toString());
                    tbl.addCell(tablecart.getValueAt(i, 2).toString());
                    tbl.addCell(tablecart.getValueAt(i, 3).toString());
                    tbl.addCell(tablecart.getValueAt(i, 4).toString());
                    tbl.addCell(tablecart.getValueAt(i, 5).toString());
                }
                
                
                //add table 
                doc.add(tbl);
                doc.add(line);
                
                //masege in document 
                Paragraph endmsg =new Paragraph("thank you");
                doc.add(endmsg);
                
              Pdf.Open(Svar4);
                
           } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
        doc.close();
        
            setVisible(false);
            new  Order().setVisible(true);
       }
        else{
            JOptionPane.showMessageDialog(null, "add some product to cart or select custermer ");
        }
        
        
        
        


    }//GEN-LAST:event_btnsaveorderActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsaveorder;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lablfinaltotal;
    private javax.swing.JTable tablecart;
    private javax.swing.JTable tablecustomer;
    private javax.swing.JTable tableproduct;
    private javax.swing.JTextField textcustomername;
    private javax.swing.JTextField txtcusEmail;
    private javax.swing.JTextField txtcustermarmonum;
    private javax.swing.JTextField txtorderqontity;
    private javax.swing.JTextField txtproductdiscrp;
    private javax.swing.JTextField txtproductname;
    private javax.swing.JTextField txtproductprice;
    // End of variables declaration//GEN-END:variables
}
