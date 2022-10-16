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
public class BankManager {
    
    
    public static void main(String[] args) {
        
       
         
        TipoDeCuenta cuentaAhorro1 = new TipoDeCuenta("121244", 2456, 100);
        
        TipoDeCuenta cuentaCorriente = new TipoDeCuenta("122312", 1345, 200);

        Clientes cliente1 = new Clientes("Manuelito", "Zarate", 000000123);

        Empleados empleado1 = new Empleados("Pedro", "Fonseca", 109392922, 25, "Masculino", "Asesor Comercial", "Categoria A", 1000000, "modulo 5", cuentaAhorro1);
       
        Sucursales sucursalUno = new Sucursales("La Esperanza", "Calle 13 # 14 - 63", 0367332112, "laesperanza@bancolombia.gov", empleado1, "Bancolombia", "1288172", "Johana Gomez", "oficina principal Centro");
        
         sucursalUno.AbrirSucursal();
         
         
         
        System.out.println("\nel cliente " + cliente1.getNombre() + " " + cliente1.getApellido() + " ingreso al banco " + sucursalUno.getNombre() + " en la sucursal " + sucursalUno.getNombreSucursal()+ "\n");
     
        cliente1.tomarTurno();
        
        System.out.println("\nel empleado " + empleado1.getNombreEmpleado() + " le creo la siguente cuenta de ahorro numero: " + cuentaCorriente.getNumeroCuenta() +" " +"al cliente " + cliente1.getNombre() );
        
        System.out.println("\n" + cliente1.getNombre() + " creo la siguiente clave para su cuenta de ahorro:  " + " " + cuentaAhorro1.getCodigoSeguridad());
        cuentaAhorro1.ActivarCuenta();
        
        System.out.println("representante legal: " + sucursalUno.getRepresentanteLegal());
  
        
    }


    }
