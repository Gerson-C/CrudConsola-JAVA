package crudconsola;

import crudconsola.Crudconsola;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class c_consultar {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Crudconsola conec = new Crudconsola();
 
    public void listar (){      
     String instruccion = "select * from alumno";
     try{
           con = conec.Enlace();
           ps = con.prepareStatement(instruccion);
           rs = ps.executeQuery();
           
           while (rs.next()){
               System.out.println(rs.getInt(1));
               System.out.println(rs.getString(2));
               System.out.println(rs.getString(3));
               System.out.println(rs.getInt(4));
         
        }
       }catch (Exception e){}
       
    }
    
  
    
    public static void main (String [] arsg){
        
        c_consultar lista = new c_consultar();
        lista.listar();
     
    }
}
    
