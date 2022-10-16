/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author PedroFonseca
 */
public class Sucursales extends Banco {

    /**
     * @return the empleado
     */
    public Empleados getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    private String NombreSucursal;
    private String Direccion;
    private int Telefono;
    private String CorreoElectronico;
    private Empleados empleado;

    public Sucursales(String NombreSucursal, String Direccion, int Telefono, String CorreoElectronico, Empleados empleado, String nombre, String nit, String RepresentanteLegal, String OficinaPrincipal) {
        super(nombre, nit, RepresentanteLegal, OficinaPrincipal);
        this.NombreSucursal = NombreSucursal;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.CorreoElectronico = CorreoElectronico;
        this.empleado = empleado;

    }

    public String trabajandoEmpleado(Empleados empleado1) {
        System.out.println("el empleado esta" + empleado1.getNombreEmpleado() + " atendiendo un clinete");
        return empleado1.getNombreEmpleado();

    }

    public void AbrirSucursal() {
        System.out.println("La sucursal " + NombreSucursal + " del Banco " + super.getNombre() + " ubicada en la direccion: " + Direccion + " esta abierta al publico");
    }

    public void CerrarSucursal() {
        System.out.println("La sucursal " + NombreSucursal + "del Banco " + super.getNombre() + "ubicada en la direccion: " + Direccion + "esta cerrada al publico");
    }

    /**
     * @return the NombreSucursal
     */
    public String getNombreSucursal() {
        return NombreSucursal;
    }

    /**
     * @param NombreSucursal the NombreSucursal to set
     */
    public void setNombreSucursal(String NombreSucursal) {
        this.NombreSucursal = NombreSucursal;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the CorreoElectronico
     */
    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    /**
     * @param CorreoElectronico the CorreoElectronico to set
     */
    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

}
