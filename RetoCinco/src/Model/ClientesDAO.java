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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ClientesDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List<Clientes> Listar() {
          List<Clientes>datos=new ArrayList<>();/*list de objeto persona*/
        String sql="select * from clientes";//Sentencia sql.
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Clientes c=new Clientes();
                c.setDocumento(rs.getDouble(1));
                c.setNombre(rs.getString(2));
                c.setDireccion(rs.getString(3));
                c.setTelefono(rs.getDouble(4));
                c.setEmail(rs.getString(5));
             
           
                
                datos.add(c);//Se agrega a la variable datos.
                
            }
        } catch (Exception e) {
        }
        return datos;//Retorna los datos del objeto.
    }
    
        
    public Integer agregarCliente(Clientes c){
        
        String sql = "INSERT INTO clientes(documento, nombre, direccion, telefono, email) VALUES (?, ?, ?, ?, ?)";  
        try{
            con = conectar.getConnection();
            ps = con.prepareCall(sql);
            ps.setDouble(1, c.getDocumento());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getDireccion());
            ps.setDouble(4, c.getTelefono());
            ps.setString(5, c.getEmail());
            ps.executeUpdate();
           
    
   
    }catch(Exception e){
        
    }return 1;
    
       
    }
    
    public double Editar(Clientes c){
        double r=0;
        String sql="update clientes set nombre=?,direccion=?,telefono=?,email=? WHERE documento=?";
        try {
           con=conectar.getConnection();
           ps=con.prepareStatement(sql);
           ps.setDouble(1, c.getDocumento());
           ps.setString(2, c.getNombre());
           ps.setString(3, c.getDireccion());
           ps.setDouble(4, c.getTelefono());
           ps.setString(5, c.getEmail());
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

    public void delete(double documento) {
       String sql="delete from clientes where Documento="+documento;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public LinkedList<reporteComprasClientes> ListaCompraClientes() {
        LinkedList<reporteComprasClientes> report = new LinkedList<>();
        try{ con=conectar.getConnection();
            String query = "SELECT nombre, cantidad FROM clientes JOIN pedidos ON clientes.documento=pedidos.documentoCliente";
            ps=con.prepareStatement(query);
            ps.executeUpdate();
            while (rs.next()) {
                reporteComprasClientes record = new reporteComprasClientes();
                String nombre = rs.getString(1);
                int cantidad = rs.getInt(2);
                record.setNombre(nombre);
                record.setCanridad(cantidad);
                report.add(record);
            }
            return report;
        } catch (Exception e) {
            return report;
        }
    }

   
}
