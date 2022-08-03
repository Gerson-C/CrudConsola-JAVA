/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudconsola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Gerson
 */
public class c_modificar {
        PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Crudconsola conectar = new Crudconsola();
    
public  void modificar (int codigo, String nombre, String direccion, int telefono){
        String sql = "update alumno set nombre = ?, direccion =?, telefono= ? where codigo = ?";
        
        try {
        con = conectar.Enlace();
        ps = con.prepareStatement(sql);
        
        ps.setString(1, nombre);
        ps.setString(2, direccion);
        ps.setInt(3, telefono);
        ps.setInt(4, codigo);
        ps.executeUpdate();
        
        } catch (Exception e){
            System.out.println("A ocurrido un Error");
        }
        
    }

public static void main (String [] arsg){
    c_modificar mod = new c_modificar();
    mod.modificar(3, "N andre", "N ciudad", 44546581);
    
    c_consultar lista = new c_consultar();
        lista.listar();
}
}
