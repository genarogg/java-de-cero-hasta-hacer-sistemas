package pkg3Herencia.sistemaDeNomina;

/**
 *
 * @author Genarogg
 */
public class EmpleadoPorHoras extends Empleado {
    private double sueldo;
    private double horas;
    
    public EmpleadoPorHoras( String nombre, String apellido, String nss, 
                            double salarioPorHoras, double horasTrabajadas){
        super(nombre, apellido, nss);
        
        establecerSueldo(salarioPorHoras);
        establecerHoras(horasTrabajadas);
    }
    public double obtenerSueldo(){
        return sueldo;
    }
   
    public void establecerSueldo(double su){
        if(su < 0.0){
            sueldo = 0.0;
        }
        else{
            sueldo = su;
        }
    }
    
    public double obtenerHoras(){
        return horas;
    }
    
    public void establecerHoras(double h){
        if((h >= 0) && (h <= 168)){
            horas = h;
        }
        else{
            horas = 0;
        }
    }
}
