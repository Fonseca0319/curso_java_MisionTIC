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
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class PedidosDAO {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<Pedidos> ListarPedidos() {
        List<Pedidos> datos = new ArrayList<>();/*list de objeto persona*/
        String sql = "select * from pedidos";//Sentencia sql.
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pedidos p = new Pedidos();
                p.setId_pedido(rs.getInt(1));
                p.setTipo_pedido(rs.getString(2));
                p.setDocumentoCliente(rs.getDouble(3));
                p.setIdProducto(rs.getInt(4));
                p.setIdCuenta(rs.getInt(5));
                p.setCantidad(rs.getInt(6));
                p.setValor(rs.getInt(7));

                //id_pedido, tipo_pedido, documentoCliente, idProducto, idCuenta, cantidad, valor
                datos.add(p);//Se agrega a la variable datos.

            }
        } catch (Exception e) {
        }
        return datos;//Retorna los datos del objeto.
    }

    public Integer agregarPedidos(Pedidos p) {

        String sql = "INSERT INTO pedidos(id_pedido, tipo_pedido, documentoCliente, idProducto, idCuenta, cantidad, valor) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareCall(sql);
            ps.setInt(1, p.getId_pedido());
            ps.setString(2, p.getTipo_pedido());
            ps.setDouble(3, p.getDocumentoCliente());
            ps.setInt(4, p.getIdProducto());
            ps.setInt(5, p.getIdCuenta());
            ps.setInt(6, p.getCantidad());
            ps.setFloat(7, p.getValor());
            ps.executeUpdate();

        } catch (Exception e) {

        }return 1;

    }

    public double EditarPedidos(Pedidos p) {
        double r = 0;
        String sql = "update Pedidos set tipo_pedido==, documentoCliente=?, idProducto=?, idCuenta=?, cantidad=?, valor=? WHERE id_pedido=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId_pedido());
            ps.setString(2, p.getTipo_pedido());
            ps.setDouble(3, p.getDocumentoCliente());
            ps.setInt(4, p.getIdProducto());
            ps.setInt(5, p.getIdCuenta());
            ps.setInt(6, p.getCantidad());
            ps.setFloat(7, p.getValor());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
        }
        return r;

    }

    public void deletePedidos(int id_pedido) {
        String sql = "delete from pedidos where id_producto=" +id_pedido;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
