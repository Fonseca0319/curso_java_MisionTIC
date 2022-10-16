/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.*;
import Model.*;
import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class ControlClientes {

    private modelCliente modelClien;
    public ControlClientes() {
        this.modelClien = new modelCliente();
        
    }

    public boolean CreateCliente(Clientes c) {
        try {
            switch (c.getNombre()) {
                case "pedro":

                    break;
                case "johana":
                    this.modelClien.CrearCliente(c);
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean EditCliente(Clientes c) {

        try {
            switch (c.getTipoCLiente()) {
                case "preferencial":

                    break;
                case "nuevo":
                    this.modelClien.CrearCliente(c);
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeletCliente(Clientes c) {

        try {
            switch (c.getTipoCLiente()) {
                case "preferencial":

                    break;
                case "nuevo":
                    this.modelClien.EliminarCliente(c);
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Clientes BuscarCliente(double documento, String type) {
        Clientes cliente = null;
        try {
            switch (type) {
                case "preferencial":

                    break;
                case "nuevo":
                    cliente = this.modelClien.BuscarClientes(documento);
                    break;
            }
            return cliente;
        } catch (Exception e) {
            return null;
        }
    }
    
    public LinkedList<Clientes> ListaCliente(String type) {
        LinkedList<Clientes> ClienteLista = null;
        try {
            switch (type) {
                case "preferencial":

                    break;
                case "nuevo":
                    ClienteLista = this.modelClien.ListaClientes();
                    break;
            }
            return ClienteLista;
        } catch (Exception e) {
            return null;
        }
    }
    
    
    public LinkedList<ReportesClientes> ListaCompraDeClientes() {
        LinkedList<ReportesClientes> report =  this.modelClien.ListComprasClientes();
        return report;
    }
}
