/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Usuario
 */
public class TipoDeCuenta {
    private String NumeroCuenta;
    private int CodigoSeguridad;
    private int SaldoAsociado;

    public TipoDeCuenta(String NumeroCuenta, int CodigoSeguridad, int SaldoAsociado) {
        this.NumeroCuenta = NumeroCuenta;
        this.CodigoSeguridad = CodigoSeguridad;
        this.SaldoAsociado = SaldoAsociado;
    }

    
    public void CrearClave(){
        System.out.println("la clave se creo correctamente");
    }
    
    public void CrearPinVirtual(){
        System.out.println("el pin virtual se creo correctamente");
    }
    
    public void ActivarCuenta(){
        System.out.println("La cuenta se activo correctamente");
    }

    
    
    /**
     * @return the NumeroCuenta
     */
    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    /**
     * @param NumeroCuenta the NumeroCuenta to set
     */
    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    /**
     * @return the CodigoSeguridad
     */
    public int getCodigoSeguridad() {
        return CodigoSeguridad;
    }

    /**
     * @param CodigoSeguridad the CodigoSeguridad to set
     */
    public void setCodigoSeguridad(int CodigoSeguridad) {
        this.CodigoSeguridad = CodigoSeguridad;
    }

    /**
     * @return the SaldoAsociado
     */
    public int getSaldoAsociado() {
        return SaldoAsociado;
    }

    /**
     * @param SaldoAsociado the SaldoAsociado to set
     */
    public void setSaldoAsociado(int SaldoAsociado) {
        this.SaldoAsociado = SaldoAsociado;
    }

    
    
}
