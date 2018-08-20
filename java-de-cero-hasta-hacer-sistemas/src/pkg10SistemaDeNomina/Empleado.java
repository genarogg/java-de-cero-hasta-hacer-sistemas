package pkg10SistemaDeNomina;

/**
 *
 * @author Genarogg
 */

public abstract class Empleado {
    
    private String primerNombre;
    private String primerApellido;
    private String numerosDeSeguroSocial;
    
    public Empleado(String nombre, String apellido, String nss){
        primerNombre = nombre;
        primerApellido = apellido;
        numerosDeSeguroSocial = nss;
    }
    public void setPrimerNombre(String nombre){
        primerNombre = nombre;
    }
    public String getPrimerNombre(){
        return primerNombre;
    }
    public void setPrimerApellido(String nombre){
        primerNombre = nombre;
    }
    public String getPrimerApellido(){
        return primerApellido;
    }
    public void setNumerosDeSeguroSocial(String nss){
        numerosDeSeguroSocial = nss;
    }
    public String getNumerosDeSeguroSocial(){
        return numerosDeSeguroSocial;
    }
    @Override
    public String toString(){
        return String.format("%s %s\nnumero de seguro social: %s", getPrimerNombre(),getPrimerApellido(),getNumerosDeSeguroSocial());
    } 
    public abstract double ingresos();
}
