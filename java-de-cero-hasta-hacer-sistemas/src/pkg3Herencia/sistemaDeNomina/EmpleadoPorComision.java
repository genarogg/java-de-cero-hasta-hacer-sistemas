/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3Herencia.sistemaDeNomina;

/**
 *
 * @author Genarogg
 */
public class EmpleadoPorComision extends Empleado {
    
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa){
        super(nombre, apellido, nss);
        
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }
    
    public void establecerTarifaComision(double tarifa){
        if(tarifa > 0.0 && tarifa < 1.0){
            tarifaComision = tarifa;
        }
        else{
            tarifa = 0.0;
        }
    }
    
    
}
