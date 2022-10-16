/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Class.*;


/**
 *
 * @author PEDRO FONSECA
 */
public class modelPedido {
     
    public modelPedido() {
    }
    
    public boolean CreatePedido(Pedido pedido){
        try{
            return true;
        }catch(Exception e){
            return false;
        } 
    }
    
    public boolean EditPedido(Pedido pedido){
        try{
            return true;
        }catch(Exception e){
            return false;
        } 
    }
    
    public boolean DeletePedido(Pedido pedido){
        try{
            return true;
        }catch(Exception e){
            return false;
        } 
    }
    
    public Pedido SearchPedido(int intNumeroPedido){
        Pedido pedido = null;
        try{
            return pedido;
        }catch(Exception e){
            return pedido;
        } 
    }
}
