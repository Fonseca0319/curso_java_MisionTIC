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
public class Empleados {

    private String NombreEmpleado;
    private String ApellidoEmpleado;
    private int CedulaEmpleado;
    private int EdadEmpleado;
    private String SexoEmpleado;
    private String CargoEmpleado;
    private String Categoria;
    private int Salario;
    private String ModuloAsignacion;
    private TipoDeCuenta tipoDeCuentas;

    public Empleados(String NombreEmpleado, String ApellidoEmpleado, int CedulaEmpleado, int EdadEmpleado, String SexoEmpleado, String CargoEmpleado, String Categoria, int Salario, String ModuloAsignacion, TipoDeCuenta tipoDeCuentas) {
        this.NombreEmpleado = NombreEmpleado;
        this.ApellidoEmpleado = ApellidoEmpleado;
        this.CedulaEmpleado = CedulaEmpleado;
        this.EdadEmpleado = EdadEmpleado;
        this.SexoEmpleado = SexoEmpleado;
        this.CargoEmpleado = CargoEmpleado;
        this.Categoria = Categoria;
        this.Salario = Salario;
        this.ModuloAsignacion = ModuloAsignacion;
        this.tipoDeCuentas = tipoDeCuentas;
    }


   public String CreandoUnaCorriente(TipoDeCuenta cuentaCorriente) {
        System.out.println("la cuenta corriente fue creada exitosamente " + " por el Empleado " + getNombreEmpleado() + " " + getApellidoEmpleado());
        return cuentaCorriente.getNumeroCuenta();

    }

    public String CreandoUnaCuentaAhorro(TipoDeCuenta cuentaAhorro) {
               System.out.println("la cuenta de ahorro fue creada exitosamente " + " por el Empleado " + getNombreEmpleado() + " " + getApellidoEmpleado());
        return cuentaAhorro.getNumeroCuenta();
    }


    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    /**
     * @param NombreEmpleado the NombreEmpleado to set
     */
    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    /**
     * @return the ApellidoEmpleado
     */
    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    /**
     * @param ApellidoEmpleado the ApellidoEmpleado to set
     */
    public void setApellidoEmpleado(String ApellidoEmpleado) {
        this.ApellidoEmpleado = ApellidoEmpleado;
    }

    /**
     * @return the CedulaEmpleado
     */
    public int getCedulaEmpleado() {
        return CedulaEmpleado;
    }

    /**
     * @param CedulaEmpleado the CedulaEmpleado to set
     */
    public void setCedulaEmpleado(int CedulaEmpleado) {
        this.CedulaEmpleado = CedulaEmpleado;
    }

    /**
     * @return the EdadEmpleado
     */
    public int getEdadEmpleado() {
        return EdadEmpleado;
    }

    /**
     * @param EdadEmpleado the EdadEmpleado to set
     */
    public void setEdadEmpleado(int EdadEmpleado) {
        this.EdadEmpleado = EdadEmpleado;
    }

    /**
     * @return the SexoEmpleado
     */
    public String getSexoEmpleado() {
        return SexoEmpleado;
    }

    /**
     * @param SexoEmpleado the SexoEmpleado to set
     */
    public void setSexoEmpleado(String SexoEmpleado) {
        this.SexoEmpleado = SexoEmpleado;
    }

    /**
     * @return the CargoEmpleado
     */
    public String getCargoEmpleado() {
        return CargoEmpleado;
    }

    /**
     * @param CargoEmpleado the CargoEmpleado to set
     */
    public void setCargoEmpleado(String CargoEmpleado) {
        this.CargoEmpleado = CargoEmpleado;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the Salario
     */
    public int getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    /**
     * @return the ModuloAsignacion
     */
    public String getModuloAsignacion() {
        return ModuloAsignacion;
    }

    /**
     * @param ModuloAsignacion the ModuloAsignacion to set
     */
    public void setModuloAsignacion(String ModuloAsignacion) {
        this.ModuloAsignacion = ModuloAsignacion;
    }

    /**
     * @return the tipoDeCuentas
     */
    public TipoDeCuenta getTipoDeCuentas() {
        return tipoDeCuentas;
    }

    /**
     * @param tipoDeCuentas the tipoDeCuentas to set
     */
    public void setTipoDeCuentas(TipoDeCuenta tipoDeCuentas) {
        this.tipoDeCuentas = tipoDeCuentas;
    }
}
