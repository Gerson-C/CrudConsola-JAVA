/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudconsola;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class c_eliminar {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Crudconsola conectar = new Crudconsola();
    
    
    public void eliminar (int codigo){
        String sql = "delete from alumno where codigo = ?";
        try{
               con = conectar.Enlace();
            ps = con.prepareStatement(sql);
           ps.setInt(1, codigo);
            ps.executeUpdate();
            
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
   
   
    
    

    
     public static void main (String [] arsg){
        
        c_eliminar delete = new c_eliminar ();
        delete.eliminar(3);
        
        c_consultar lista = new c_consultar();
        lista.listar();
        
       
    }
}