/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Class.*;
import com.mysql.cj.PreparedQuery;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PEDRO FONSECA
 */

public class modelProducto {
    dbData dbData;
    
    public modelProducto() {
        this.dbData = new dbData();
        
    }
    
    public boolean CreateProducto(Producto producto){
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "INSERT INTO producto(idProducto, denominacion, precio, proveedor) VALUES (?, ?, ?, ?)";
            PreparedStatement statemenProducto = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS); 
            statemenProducto.setString(1, producto.getIdProducto());
            statemenProducto.setString(2, producto.getDenominacion());
            statemenProducto.setString(3, producto.getPrecio());
              statemenProducto.setString(4, producto.getProveedor());
            int rowsInserted = statemenProducto.executeUpdate();
            if(rowsInserted > 0) {
                ResultSet generatedKeys = statemenProducto.getGeneratedKeys(); 
                if(generatedKeys.next()){
                    int idProducto = generatedKeys.getInt(1);
                    query = "INSERT INTO producto(idProducto, proveedor, precio, denominacion) VALUES (?, ?, ?, ?)";
                    PreparedStatement statementProducto = conn.prepareStatement(query);
                    statemenProducto.setString(1, producto.getIdProducto());
                    statemenProducto.setString(2, producto.getProveedor());
                   
                    
                    rowsInserted = statemenProducto.executeUpdate();
                    if(rowsInserted > 0){
                        return true;
                    }
                    
                   return false;
                }
            }
                     
            return false;
        }catch(SQLException e){
            return false;
        } 
    }
    
    public boolean EditProducto(Producto producto){
        try{
            return true;
        }catch(Exception e){
            return false;
        } 
    }
    
    public boolean DeleteProducto(Producto producto){
        try{
            return true;
        }catch(Exception e){
            return false;
        } 
    }
    
    public Producto SearchProducto(String CodigoProducto){
        Producto producto = null;
        try{
            
            return producto;
        }catch(Exception e){
            return producto;
        } 
    }
}
