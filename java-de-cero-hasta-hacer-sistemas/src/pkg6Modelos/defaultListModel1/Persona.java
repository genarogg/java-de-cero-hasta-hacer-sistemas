package pkg6Modelos.defaultListModel1;

/**
 *
 * @author Genarogg
 */
public class Persona {
    String nombre;
    String apellido;
    String direccion;
    String telefono;
  
    public Persona(String nombre, String apellido, String direccion, String telefono){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellifo) {
        this.apellido = apellifo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
