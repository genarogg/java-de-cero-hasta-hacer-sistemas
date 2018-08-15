package pkg6Modelos.DefaultcomboBoxModelClass;

/**
 *
 * @author Genarogg
 */

public class Persona {

    private String nombre;
    private String dereccion;
    String nacionlidad;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDereccion() {
        return dereccion;
    }

    public void setDereccion(String dereccion) {
        this.dereccion = dereccion;
    }

    public String getNacionlidad() {
        return nacionlidad;
    }

    public void setNacionlidad(String nacionlidad) {
        this.nacionlidad = nacionlidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
}
