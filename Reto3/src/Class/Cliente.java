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
public class Cliente {

    private String idCliente;
    private String direccion;
    private String teleofono;
    private String email;

    public Cliente(String idCliente, String direccion, String teleofono, String email) {
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.teleofono = teleofono;
        this.email = email;
    }
    
    

    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the teleofono
     */
    public String getTeleofono() {
        return teleofono;
    }

    /**
     * @param teleofono the teleofono to set
     */
    public void setTeleofono(String teleofono) {
        this.teleofono = teleofono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
