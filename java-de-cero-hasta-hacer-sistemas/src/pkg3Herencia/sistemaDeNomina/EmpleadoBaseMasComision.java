package pkg3Herencia.sistemaDeNomina;

/**
 *
 * @author Genarogg
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String nombre, String apellido, String nss,
                                   double ventas, double tarifa, double salario){
        super(nombre, apellido, nss, ventas, tarifa);
        
    }
    
    public void establecerSalarioBase(double salario){
        if(salario < 0.0){
            salario = 0.0;
        }
        else{
            salarioBase = 0.0;
        }
    }
    
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    
    @Override
    public double ingresos(){
        return obtenerSalarioBase() + super.ingresos();
    }
    
    @Override
    public String toString(){
        return String.format("%s%s; %s: $%,.2f",
                "con salario base", super.toString(),
                "salario base", obtenerSalarioBase());    
    }
}
