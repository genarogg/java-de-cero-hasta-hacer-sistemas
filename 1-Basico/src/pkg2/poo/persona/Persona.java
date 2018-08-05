package pkg2.poo.persona;

/**
 *
 * @author Genarogg
 */
public class Persona {
    private String nombre;
    private String nacionalidad;
    private double alturas;
    private int edads;

    public Persona(String nombre, String nacionalidad, double alturas, int edads) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.alturas = alturas;
        this.edads = edads;
    }
    
    public int getEdads() {
        return edads;
    }

    public void setEdads(int edads) {
        this.edads = edads;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getAlturas() {
        return alturas;
    }

    public void setAlturas(double alturas) {
        this.alturas = alturas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", alturas=" + alturas + ", edads=" + edads + '}';
    }
}
