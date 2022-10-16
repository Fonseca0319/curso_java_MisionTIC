
package Class;


/**
 *
 * @author PedroFonseca
 */
public class Banco {
    private String nombre;
    private String nit;
    private String RepresentanteLegal;
    private String OficinaPrincipal;
   

    public Banco(String nombre, String nit, String RepresentanteLegal, String OficinaPrincipal) {
        this.nombre = nombre;
        this.nit = nit;
        this.RepresentanteLegal = RepresentanteLegal;
        this.OficinaPrincipal = OficinaPrincipal;
    }
 
   
    
    
    public void CrearCuentaAhorro(){
        System.out.println("el banco creo una cuenta de ahorro");
     
    }
    
    public void CrearCuentaCorriente(){
        System.out.println("el banco creo una cuenta corriente");
    }
    
    
  

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the RepresentanteLegal
     */
    public String getRepresentanteLegal() {
        return RepresentanteLegal;
    }

    /**
     * @param RepresentanteLegal the RepresentanteLegal to set
     */
    public void setRepresentanteLegal(String RepresentanteLegal) {
        this.RepresentanteLegal = RepresentanteLegal;
    }

    /**
     * @return the OficinaPrincipal
     */
    public String getOficinaPrincipal() {
        return OficinaPrincipal;
    }

    /**
     * @param OficinaPrincipal the OficinaPrincipal to set
     */
    public void setOficinaPrincipal(String OficinaPrincipal) {
        this.OficinaPrincipal = OficinaPrincipal;
    }

    
     

    
}
