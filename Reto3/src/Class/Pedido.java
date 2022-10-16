    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Date;
import javax.swing.JList;

/**
 *
 * @author PEDRO FONSECA
 */
public class Pedido {

    private String idPedido;
    private Date fechaPago;
    private Double pago;

    public Pedido(String idPedido, Date fechaPago, Double pago) {
        this.idPedido = idPedido;
        this.fechaPago = fechaPago;
        this.pago = pago;
    }


    
    

    /**
     * @return the idPedido
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the fechaPago
     */
    public Date getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * @return the pago
     */
    public Double getPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(Double pago) {
        this.pago = pago;
    }
    
   

}
