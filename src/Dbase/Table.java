/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dbase;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nadee
 */
public class Table {

    public static void main(String[] args) {
        Connection connect = null;
        Statement state = null;
        try {
            connect = DataConection.getCon();
            state = connect.createStatement();
            
            //**********************************move to data and carate databace tabale in mysql quary *********************************************************************************
            
            //     state.executeUpdate("create table userdata(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(150),mobileNumber varchar(20),email varchar(50),password varchar(50),address varchar(150),status varchar(50))");
            // state.executeUpdate("insert into userdata(userRole,name,mobileNumber,email,password,address,status) values ('SuperAdmin','Nadiya','0717974724','nadeeshanrw@gmail.com','admin','ehetuwewa','Active')");
            // state.executeUpdate("insert into userdata(userRole,name,mobileNumber,email,password,address,status) values ('root','root','root','root','root','root','root')");
            // state.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key,name varchar(150))");
            //  state.executeUpdate("create table product(product_pk int AUTO_INCREMENT primary key,name varchar(150),quantity int,price int ,description varchar(500),category_fk int)");
            // state.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key,name varchar(150),mobileNumber varchar(50),email varchar(100) ) ");
           //    state.executeUpdate("create table orderDetail(order_pk int AUTO_INCREMENT primary key,orderId varchar(150),customer_fk int,orderDate varchar(150),totalPaid int)");
           
           
           
           
        //show coform masseg rightly data add tahe databace   
          JOptionPane.showMessageDialog(null,"Table create sucsussfully" );
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        } finally {
            try {
                connect.close();
                state.close();
            } catch (Exception e) {
            }
        }
    }
}
