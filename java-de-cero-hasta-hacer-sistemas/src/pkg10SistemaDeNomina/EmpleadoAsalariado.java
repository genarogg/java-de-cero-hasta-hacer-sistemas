package pkg10SistemaDeNomina;

/**
 *
 * @author Genarogg
 */

public class EmpleadoAsalariado extends Empleado{
    private double salario;
    
    public EmpleadoAsalariado(String nombre,String primerApellido, String nss,double salario){
        super(nombre,primerApellido,nss);
        establecerSalarioSemanal(salario);
    }
    @Override
    public double ingresos(){
        return obtenerSalarioSemanal();
    }
    public void establecerSalarioSemanal(double sal){
        salario = sal;
    }
    public double obtenerSalarioSemanal(){
        return salario;
    }
    @Override
    public String toString(){
       return String.format("Empleado asalariado: %s\n%s: $%,.2f", super.toString(), "Salario Semanal", obtenerSalarioSemanal());
    }
}