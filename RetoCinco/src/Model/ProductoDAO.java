/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Class.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProductoDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List<Producto> ListarProducto() {
          List<Producto>datos=new ArrayList<>();/*list de objeto persona*/
        String sql="select * from producto";//Sentencia sql.
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto pr=new Producto();
                pr.setId_producto(rs.getInt(1));
                pr.setNombre_producto(rs.getString(2));
                pr.setCantidad_producto(rs.getInt(3));
                pr.setPrecio(rs.getFloat(4));
              
             
           
                
                datos.add(pr);//Se agrega a la variable datos.
                
            }
        } catch (Exception e) {
        }
        return datos;//Retorna los datos del objeto.
    }
    
        
    public Integer agregarProducto(Producto pr){
        
        String sql = "INSERT INTO producto(id_producto, nombre_producto, cantidad_producto, precio)  VALUES (?, ?, ?, ?)";  
        try{
            con = conectar.getConnection();
            ps = con.prepareCall(sql);
            ps.setInt(1, pr.getId_producto());
            ps.setString(2, pr.getNombre_producto());
            ps.setInt(3, pr.getCantidad_producto());
            ps.setFloat(4, pr.getPrecio());
           
            ps.executeUpdate();
           
    
   
    }catch(Exception e){
        
    }return 1;
    
       
    }
    
    public double EditarProducto(Producto pr){
        double r=0;
        String sql="update producto set nombre=?,direccion=?,telefono=?,email=? WHERE documento=?";
        try {
           con=conectar.getConnection();
           ps=con.prepareStatement(sql);
            ps.setInt(1, pr.getId_producto());
            ps.setString(2, pr.getNombre_producto());
            ps.setInt(3, pr.getCantidad_producto());
            ps.setFloat(4, pr.getPrecio());
           r=ps.executeUpdate();
           if(r==1){
               return 1;
           }
           else{
               return 0;
           }
        } catch (Exception e) {
        }
        return r;
    
    }

    public void deleteProducto(int id_producto) {
       String sql="delete from producto where id_producto="+id_producto;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
   
}
