/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author porti
 */
public class ConectarBD {
    private static ConectarBD conectarbd;
    
    public static ConectarBD getInstance(){
        if(conectarbd == null){
            conectarbd = new ConectarBD();
        }
        return conectarbd;
    }
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        return DriverManager.getConnection("", "", "");
    }
}
