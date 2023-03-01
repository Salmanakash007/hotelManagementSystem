/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DBCon {
    
    private Connection con=null;
    private String url = "jdbc:mysql://localhost:3306/hoteldbcon";
    private String user = "root";
    private String pass = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getCon(){
    
        try {
            Class.forName(driver);
            con =DriverManager.getConnection(url, user, pass);
                    } catch (SQLException ex) {
            Logger.getLogger(DBCon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Okay");
        return con;
    
    
    }
    
    
}
