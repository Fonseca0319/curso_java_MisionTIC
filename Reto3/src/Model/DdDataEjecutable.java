/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class DdDataEjecutable {
    public static void main(String[] args) {
         String driver = "com.mysql.jdbc.Driver";
        String user = "root";  
        String password = "";
        String url = "jdbc:mysql://localhost:3306/reto_cinco";
        
        Connection connection;
        try{ 
            Class.forName(driver); 
            connection = (Connection) DriverManager.getConnection(url, user, password);
            if(connection != null){
                System.out.println("Conexión Exitosa");
            }
            
        }catch(Exception e){
            System.out.println("Error en la conexión" + e.getMessage());
            
        }
        }
    
}
