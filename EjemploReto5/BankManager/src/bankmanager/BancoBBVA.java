/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanager;

import Class.*;

/**
 *
 * @author Usuario
 */
public class BancoBBVA {
    
    public static void main(String[] args) {
        
     TipoDeCuenta cuenta1 = new TipoDeCuenta("12329112", 1234, 3000);
     
     TipoDeCuenta cuenta2 = new TipoDeCuenta("1223411", 1298, 200);
    
    Clientes Cliente1 = new Clientes("Kelly", "Fonseca", 1094933956);
    
    Empleados empleado1 = new Empleados("Juliana", "Gomez", 10928332, 23, "femenino", "Cajera", "Categoria B", 1300000, "Modulo 4", cuenta1);
  
    
    Sucursales sucursalUno = new Sucursales("Sucursa del Cielo", "Av 13 # 22 - 44", 74473222, "Sucursaldc@avevillas.gov.co", empleado1, "AV Villas", "19827733", "Ruen Gomez", "Oficina Principal Centro");
    
              
        System.out.println("\nEl cliente " + Cliente1.getNombre() + " ingreso al banco " + " " + sucursalUno.getNombreSucursal() + " del banco " + sucursalUno.getNombre());
        
        System.out.println("\nla empleada " + empleado1.getNombreEmpleado() + " del " + empleado1.getModuloAsignacion() + " esta esperando un cliente\n");
        
        Cliente1.tomarTurno();
        
        System.out.println("\n" + empleado1.getNombreEmpleado() + " esta atiendo a la cliente " + Cliente1.getNombre() + "\n");
        
        sucursalUno.CrearCuentaAhorro();
        
        System.out.println("\nla cuenta de Ahorros # " + cuenta1.getNumeroCuenta() + " fue creada Exitosa mente\n");
               
        cuenta1.ActivarCuenta();
        
        System.out.println("\n" + Cliente1.getNombre() + " esta consultando el saldo de su cuenta: " + cuenta1.getSaldoAsociado());
        
        sucursalUno.CerrarSucursal();
        
        

        
        
        
        
        
        

       
           
        
        
        
        
    
             
    }
    
    
    
    

    
}
