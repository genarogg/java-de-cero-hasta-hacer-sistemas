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
    
    @Override
    public double ingresos(){
        if(obtenerSueldo() <= 40){
            return obtenerSueldo() * obtenerHoras();
        }
        else{
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
        }
    }
    
    @Override
    public String toString(){
        return String.format("empleado por horas: %s\n%s: $%,.2f; %s: %,.2f", super.toString(),
                "sueldo por hora", obtenerSueldo(), "horas trabajadas",obtenerHoras());
    
    }
}
