/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudconsola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Gerson
 */
public class c_insertar {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Crudconsola conectar = new Crudconsola();
    
  
    
     public  void crear (int codigo, String nombre, String direccion, int telefono){
        
        String sql = "insert into alumno (codigo, nombre, direccion, telefono) values (?, ?, ?, ?)";
        
        try {
            con = conectar.Enlace();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, direccion);
            ps.setInt(4, telefono);
            ps.executeUpdate();
            
        
            
        } catch (Exception e){
            
        }
       
    }
     
     public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
         
       c_insertar insertar = new c_insertar ();
       
       System.out.println("Ingrese su codigo"); 
       int codigo = entrada.nextInt();
       
       System.out.println("Ingrese su nombre"); 
       String nombre = entrada.nextLine();
       
       System.out.println("Ingrese su Ciudad"); 
       String ciudad = entrada.nextLine();
       
       System.out.println("Ingrese su Telefono"); 
       int telefono = entrada.nextInt();
       
        
        insertar.crear(codigo, nombre, ciudad, telefono);
        
         
        c_consultar lista = new c_consultar();
        lista.listar();
    
     }

}
