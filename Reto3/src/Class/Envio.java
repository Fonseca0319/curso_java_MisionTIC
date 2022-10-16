/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author PEDRO FONSECA
 */
public class Envio {

    private String idEnvio;
    private String direccionFacturacion;
    private boolean finalizado;
    private String fechaEnvio;
    private String compania;

    public Envio(String idEnvio, String direccionFacturacion, boolean finalizado, String fechaEnvio, String compania) {
        this.idEnvio = idEnvio;
        this.direccionFacturacion = direccionFacturacion;
        this.finalizado = finalizado;
        this.fechaEnvio = fechaEnvio;
        this.compania = compania;
    }

    
    /**
     * @return the idEnvio
     */
    public String getIdEnvio() {
        return idEnvio;
    }

    /**
     * @param idEnvio the idEnvio to set
     */
    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    /**
     * @return the direccionFacturacion
     */
    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    /**
     * @param direccionFacturacion the direccionFacturacion to set
     */
    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    /**
     * @return the finalizado
     */
    public boolean isFinalizado() {
        return finalizado;
    }

    /**
     * @param finalizado the finalizado to set
     */
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    /**
     * @return the fechaEnvio
     */
    public String getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * @param fechaEnvio the fechaEnvio to set
     */
    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * @return the compania
     */
    public String getCompania() {
        return compania;
    }

    /**
     * @param compania the compania to set
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

   
    
}