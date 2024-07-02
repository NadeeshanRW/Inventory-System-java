/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docu;

import Dbase.InventoryUtill;
import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author nadee
 */
public class Pdf {
    
    public static void Open(String id){
        try{
            
            if((new File(InventoryUtill.billparth+id+".pdf")).exists()){
                Process p =Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll.FileProtocolHandler "+InventoryUtill.billparth+""+id+".pdf");
                 }
            else{
                JOptionPane.showMessageDialog(null, "fill not exists");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
