/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.*;
import Model.*;

/**
 *
 * @author PEDRO FONSECA
 */
public class ctlProducto {
    private modelProducto modelProducto;
    
    public ctlProducto(){
        this.modelProducto = new modelProducto();
    }
    
    public boolean CreateProducto(Producto producto){
        try{
            switch(producto.getProductoClase()){
               case "celulares":
                   this.modelProducto.CreateProducto((Producto)producto);
                   break;
               case "computadores":
                   
                   break;
            }
            return true;
        }catch(Exception e){
            return false;
        } 
    }
    
    public boolean EditProducto(Producto producto){
        try{
            switch(producto.getProductoClase()){
               case "celulares":
                   this.modelProducto.EditProducto((Producto)producto);
                   break;
               case "computadores":
                   
                   break;
            }
            return true;
        }catch(Exception e){
            return false;
        } 
    }
    
    /**
     *
     * @param producto
     * @return
     */
    public boolean DeleteProducto(Producto producto){
        try{
            switch(producto.getProductoClase()){
               case "celulares":
                   this.modelProducto.DeleteProducto((Producto)producto);
                   break;
               case "computador":
                   
                   break;
            }
            return true;
        }catch(Exception e){
            return false;
        } 
    }
    
    public Producto BuscarProducto(String codigoProducto){
        Producto producto = null;
        try{
            switch(producto.getProductoClase()){
               case "celulares":
                   producto = this.modelProducto.SearchProducto(codigoProducto);
                   break;
               case "computadores":
                   
                   break;
            }
            return producto;
        }catch(Exception e){
            return null;
        } 
    }
}
