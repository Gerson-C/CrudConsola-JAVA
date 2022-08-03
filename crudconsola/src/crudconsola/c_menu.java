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
 
public class c_menu {
    
     PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Crudconsola conectar = new Crudconsola();
  
      public void menu (){
        while (true){
           Scanner sp = new Scanner (System.in);
           Scanner sp2 = new Scanner (System.in);
           Scanner sp3 = new Scanner (System.in);
           Scanner sp4 = new Scanner (System.in);
           System.out.println("==========================");
           System.out.println("|    Menu Prinicipal |");
           System.out.println("| 1.Mostrar          |");
           System.out.println("| 2.Crear          |");
           System.out.println("| 3.Eliminar          |");
           System.out.println("| 4.Modificar          |");
           System.out.println("| 5.cerrar          |");
           System.out.println("==========================");
           
           int respuesta = sp.nextInt();
           
            switch (respuesta){
               case 1:
                   c_consultar consultar = new c_consultar();
                   consultar.listar();
                   
                   break;
               case 2: /* CREAR */
                   System.out.println("ingrese su Codigo /n");
                   int codigo = sp.nextInt();
                   System.out.println("ingrese su nombre");
                   String nombre = sp2.nextLine();
                   System.out.println("ingrese su direccion");
                   String direccion = sp3.nextLine();
                   System.out.println("ingrese su Telefono");
                   int telefono = sp4.nextInt();
                   
                   c_insertar insertar = new c_insertar ();
                   
                   insertar.crear(codigo, nombre, direccion, telefono);
                   
                   break;
               case 3: /* ELIMINAR */
                  System.out.println("ingrese el id a eliminar...");
                   int id = sp.nextInt();
                  
                  
                   c_eliminar eliminar = new c_eliminar();
                   eliminar.eliminar(id);
                   
                   
                   break;
               case 4: /* MODIFICAR */
                   System.out.println("Ingrese el codigo a modificar");
                   int cod = sp.nextInt();
                   System.out.println("Ingrese el Nombre a modificar");
                   String nom = sp2.nextLine();
                   System.out.println("Ingrese la Direccion a modificar");
                   String ciu = sp3.nextLine();
                   System.out.println("Ingrese el Telefono a modificar");
                   int tel = sp4.nextInt();
             
                   c_modificar modificar = new c_modificar();
                   modificar.modificar(cod, nom, ciu, tel);
                   break;
               case 5: /* CERRAR */
                   System.exit(0);
                   break;
               default:
                   throw new AssertionError();
           }
    } }
          
            public static void main (String [] arsg){
       c_menu men = new c_menu ();
       men.menu();
       
           
       }
}
     
   
    

   
 
   
    

