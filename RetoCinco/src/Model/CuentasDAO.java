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
public class CuentasDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List<Cuentas> ListarCuentas() {
          List<Cuentas>datos=new ArrayList<>();/*list de objeto persona*/
        String sql="select * from cuentas";//Sentencia sql.
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cuentas c1=new Cuentas();
                c1.setId_cuenta(rs.getInt(1));
                c1.setBanco(rs.getString(2));
                c1.setSaldo(rs.getDouble(3));
                c1.setDocumento(rs.getDouble(4));
                datos.add(c1);//Se agrega a la variable datos.
                
            }
        } catch (Exception e) {
        }
        return datos;//Retorna los datos del objeto.
    }
    
        
    public Integer agregarCuenta(Cuentas c1){
        
        String sql = "INSERT INTO cuentas(id_cuenta, banco, saldo, docCliente) VALUES (?, ?, ?, ?)";  
        try{
            con = conectar.getConnection();
            ps = con.prepareCall(sql);
            ps.setInt(1, c1.getId_cuenta());
            ps.setString(2, c1.getBanco());
            ps.setDouble(3, c1.getSaldo());
            ps.setDouble(4, c1.getDocumento());
            ps.executeUpdate();
           
    
   
    }catch(Exception e){
        
    }return 1;
    
       
    }
    
    public double EditarCuenta(Cuentas c1){
        double r=0;
        String sql="update cuentas set id_cuenta=?,banco=?,saldo=?,docCliente=? WHERE 1";
        try {
           con=conectar.getConnection();
           ps=con.prepareStatement(sql);
            ps.setInt(1, c1.getId_cuenta());
            ps.setString(2, c1.getBanco());
            ps.setDouble(3, c1.getSaldo());
            ps.setDouble(4, c1.getDocumento());
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

    public void deleteCuenta(int id_cuenta) {
       String sql="delete from cuentas where id_cuenta="+id_cuenta;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }


   
}
