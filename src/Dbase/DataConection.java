/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Dbase;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nadee
 */
public class DataConection {
    
    public static Connection getCon(){
        
        //databace conection
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?useSSL=false","root","");
            return connect;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
            
            
        }
    }
    
}
