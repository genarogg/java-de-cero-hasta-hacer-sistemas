package pkg10SistemaDeNomina;

/**
 *
 * @author Genarogg
 */
public class PruebaSistemasNomina {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalareado = new EmpleadoAsalariado("Juan","Paez","111-11-1111",800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Alicia","Ramirez","222-22-2222",16.75,40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Jorge","Rodriguez","333-33-3333",1000,.06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Javier", "Vazquez", "444-44-4444", 5000, .04, 300);
        
        System.out.println("Empleados procesados por separado:\n");
        
        /*
        System.out.printf("%s\n%s: $%, .2f\n\n", empleadoAsalareado,"ingresos", empleadoAsalareado.ingresos() );
        System.out.printf("%s\n%s: $%, .2f\n\n", empleadoPorHoras, "ingresos",empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%, .2f\n\n", empleadoPorComision, "ingresos",empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%, .2f\n\n", empleadoBaseMasComision, "ingresos",empleadoBaseMasComision.ingresos());
        */
        
        Empleado [] empleados = new Empleado[4];
       
        empleados[0] = empleadoAsalareado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
    }
}
