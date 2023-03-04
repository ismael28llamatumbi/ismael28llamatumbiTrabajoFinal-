/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.intsuperior.controlador;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author ismael llamatumbi
 */
public class Conexion {
   static Connection conex=null;
    
    public static Connection conexion(){
        String user="root";
        String passwd="15642121";
        String url="jdbc:mysql://localhost:3306/dbmedidoresaguacariacu?serverTimezone=UTC";
        try {
            conex=DriverManager.getConnection(url,user,passwd);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conex;
    }
}