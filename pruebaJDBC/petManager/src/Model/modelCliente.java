/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class modelCliente {

    DbData dbData;

    public modelCliente() {
        this.dbData = new DbData();
    }

    public boolean CrearCliente(Clientes cliente) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO clientes(documento, nombre, direccion, telefono, email) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statementCliente = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statementCliente.setDouble(1, cliente.getDocumento());
            statementCliente.setString(2, cliente.getNombre());
            statementCliente.setString(3, cliente.getDireccion());
            statementCliente.setDouble(4, cliente.getTelefono());
            statementCliente.setString(5, cliente.getEmail());
            int rowsInserted = statementCliente.executeUpdate();

            if (rowsInserted > 0) {
                return true;
            }

            return false;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean EditarCliente(Clientes cliente) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String queryPet = "update clientes set nombre=?,direccion=?,telefono=?,email=? WHERE documento=?";
            PreparedStatement statementCliente = conn.prepareStatement(queryPet);
            statementCliente.setDouble(1, cliente.getDocumento());
            statementCliente.setString(2, cliente.getNombre());
            statementCliente.setString(3, cliente.getDireccion());
            statementCliente.setDouble(4, cliente.getTelefono());
            statementCliente.setString(5, cliente.getEmail());
       
            int rowsUpdatCliente = statementCliente.executeUpdate();
          
            return rowsUpdatCliente > 0 && rowsUpdatCliente > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean EliminarCliente(Clientes c) {

        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Clientes BuscarClientes(double documento) {
        Clientes cliente1 = null;
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "select * from clientes";
            PreparedStatement statementCliente = conn.prepareStatement(query);
            statementCliente.setDouble(1, documento);
            ResultSet result = statementCliente.executeQuery();
            while (result.next()) {
                double documentoC = result.getDouble(1);
                String nombreC = result.getString(2);
                String direccionC = result.getString(3);
                double telefonoC = result.getDouble(4);
                String emailC = result.getString(5);
               
                cliente1 = new Clientes(documentoC, nombreC, direccionC, telefonoC, emailC);
            }
            return cliente1;
        } catch (Exception e) {
            return cliente1;
        }
    }

    public LinkedList<Clientes> ListaClientes() {
        LinkedList<Clientes> ClienteList = new LinkedList<>();
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "SELECT nombre, cantidad FROM clientes JOIN pedidos ON clientes.documento=pedidos.documentoCliente";
            PreparedStatement statementPet = conn.prepareStatement(query);
            ResultSet result = statementPet.executeQuery();
            while (result.next()) {
                double documentoC = result.getDouble(1);
                String nombreC = result.getString(2);
                String direccionC = result.getString(3);
                double telefonoC = result.getDouble(4);
                String emailC = result.getString(5);
                Clientes cliente1 = new Clientes(documentoC, nombreC, direccionC, telefonoC, emailC);
                ClienteList.add(cliente1);
            }
            return  ClienteList;
        } catch (Exception e) {
            return  ClienteList;
        }
    }

    public LinkedList<ReportesClientes> ListComprasClientes() {
        LinkedList<ReportesClientes> report = new LinkedList<>();
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "SELECT nombre, cantidad FROM clientes JOIN pedidos ON clientes.documento=pedidos.documentoCliente";
            PreparedStatement statementClien = conn.prepareStatement(query);
            ResultSet result = statementClien.executeQuery();
            while (result.next()) {
                ReportesClientes record = new ReportesClientes();
                String nombre = result.getString(1);
                int cantidad = result.getInt(2);
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
