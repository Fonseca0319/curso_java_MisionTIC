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
public class Producto {

    private String idProducto;
    private String denominacion;
    private String Proveedor;
    private String precio;

    public Producto(String idProducto, String denominacion, String Proveedor, String precio) {
        this.idProducto = idProducto;
        this.denominacion = denominacion;
        this.Proveedor = Proveedor;
        this.precio = precio;
    }

    public Producto(String idProducto, String direccion, String proveedor, String precio, String nombreProducto, String cantidadProducto, String fecha, String total, String idCliente, String telefonoCLiente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the idProducto
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getProductoClase() {
        return "celulares";
    }

    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    public String getProductoType() {
        return "Computador";
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * @return the Proveedor
     */
    public String getProveedor() {
        return Proveedor;
    }
    

    public String getProductoTipo(){
        return "celular";
    }

    /**
     * @param Proveedor the Proveedor to set
     */
    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

 

    /**
     * @return the precio
     */
}
