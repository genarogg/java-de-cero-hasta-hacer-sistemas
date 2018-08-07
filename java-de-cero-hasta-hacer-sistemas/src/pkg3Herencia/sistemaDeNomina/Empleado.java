package pkg3Herencia.sistemaDeNomina;

/**
 *
 * @author Genarogg
 */
public abstract class Empleado {
    
    private String primerNombre;
    private String primerApellido;
    private String numeroSeguroSocial;

    public Empleado(String primerNombre, String primerApellido, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    @Override
    public String toString(){
        return String.format("%s %s\nnumero de seguro social: %s", getPrimerNombre(), getPrimerApellido(), getNumeroSeguroSocial());
    }
    
    public abstract double ingresos();
}