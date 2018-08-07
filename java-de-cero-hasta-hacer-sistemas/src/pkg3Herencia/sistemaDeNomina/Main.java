package pkg3Herencia.sistemaDeNomina;

/**
 *
 * @author Genarogg
 */
public class Main {
    public static void main(String[] args) {
        //argumentos: Nombre, Apellido, NSS y salario.
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan", "Perez", "111-11-1111", 800.00);
        
        //argumentos: Nombre, Apellido, NSS, Sueldo por hora y horas trabajadas
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Alicia", "Ramirez", "222-22-2222", 16.75, 40);
        
        //argumentos: Nombre, Apellido, NSS, ventas brutas y tarifa de comisión
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Jorge", "Rodríguez", "333-33-3333", 10000, .06);
        
        //argumentos: Nombre, Apellido, NSS, ventas brutas, tarifa de comisión, salario base
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Javier", "Vazquez", "444-44-4444", 5000, .04, 300);
        
        System.out.println("Empleado procesados por separado:\n");
        
        /*System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());*/
        
        //Polimorfismo
        Empleado [] empleados = new Empleado[4];
        
        empleados[ 0 ] = empleadoAsalariado;
        empleados[ 1 ] = empleadoPorHoras;
        empleados[ 2 ] = empleadoPorComision;
        empleados[ 3 ] = empleadoBaseMasComision;
        
        System.out.println("Empleados procesados en forma polimórfica:");
        
        //procesa en forma genérica a cada elemento en el arreglo de empleados
    }
}
