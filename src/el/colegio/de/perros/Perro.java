/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el.colegio.de.perros;

/**
 *
 * @author Karoline
 */
public class Perro {
    private int codigo_del_Perro;
    private String nombre;
    private String raza;
    private String localidad;
    private int cedula_del_dueño;
    private String nombre_del_dueño;

    public Perro(int codigo_del_Perro, String nombre, String raza, String localidad, int cedula_del_dueño, String nombre_del_dueño) {
        this.codigo_del_Perro = codigo_del_Perro;
        this.nombre = nombre;
        this.raza = raza;
        this.localidad = localidad;
        this.cedula_del_dueño = cedula_del_dueño;
        this.nombre_del_dueño = nombre_del_dueño;
    }

    Perro(String nombre, int codigo_del_perro, String raza, String localidad, String nombre_del_dueño, int cedula_del_dueño) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        /**
     * @return the codigo_del_Perro
     */
    public int getCodigo_del_Perro() {
        return codigo_del_Perro;
    }

    /**
     * @param codigo_del_Perro the codigo_del_Perro to set
     */
    public void setCodigo_del_Perro(int codigo_del_Perro) {
        this.codigo_del_Perro = codigo_del_Perro;
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
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the cedula_del_dueño
     */
    public int getCedula_del_dueño() {
        return cedula_del_dueño;
    }

    /**
     * @param cedula_del_dueño the cedula_del_dueño to set
     */
    public void setCedula_del_dueño(int cedula_del_dueño) {
        this.cedula_del_dueño = cedula_del_dueño;
    }

    /**
     * @return the nombre_del_dueño
     */
    public String getNombre_del_dueño() {
        return nombre_del_dueño;
    }

    /**
     * @param nombre_del_dueño the nombre_del_dueño to set
     */
    public void setNombre_del_dueño(String nombre_del_dueño) {
        this.nombre_del_dueño = nombre_del_dueño;
    }

    String getraza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getlocalidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
