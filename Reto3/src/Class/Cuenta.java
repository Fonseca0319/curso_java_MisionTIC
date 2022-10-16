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
public class Cuenta {
    
   private int idCuenta;
   private String tipoDeCuenta;
   private float SaldoCuenta;

    public Cuenta(int idCuenta, String tipoDeCuenta, float SaldoCuenta) {
        this.idCuenta = idCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
        this.SaldoCuenta = SaldoCuenta;
    }

   
   
    /**
     * @return the idCuenta
     */
    public int getIdCuenta() {
        return idCuenta;
    }

    /**
     * @param idCuenta the idCuenta to set
     */
    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    /**
     * @return the tipoDeCuenta
     */
    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    /**
     * @param tipoDeCuenta the tipoDeCuenta to set
     */
    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    /**
     * @return the SaldoCuenta
     */
    public float getSaldoCuenta() {
        return SaldoCuenta;
    }

    /**
     * @param SaldoCuenta the SaldoCuenta to set
     */
    public void setSaldoCuenta(float SaldoCuenta) {
        this.SaldoCuenta = SaldoCuenta;
    }
    
}
