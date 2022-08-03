
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudconsola;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gerson
 */
public class Crudconsola {
    
    Connection con;
    
    String url="jdbc:mysql://localhost:3306/colegio";
    String user="root";
    String pass="";
    
    public Connection Enlace(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("finalizado");
        } catch (Exception e) {
            System.out.println(e);
        }      
        return con;
        
    }
    
    public static void main(String[] args) {
        Crudconsola con = new Crudconsola();
        System.out.println(con.Enlace());
    }
    
}