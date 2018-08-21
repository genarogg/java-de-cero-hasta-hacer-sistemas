/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10SistemaDeNomina;

/**
 *
 * @author Genarogg
 */
public class EmpleadoPorComision {
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String nombre, String apellido, 
                               String nss, double ventas,double tarifa){
       
        super(nombre, apellido, nss);
        
        establecerVentasBrutas(ventas);
        establecerTarifaComicion(tarifa);
    }
    public void establecerTarifaComicion(double tarifa){
        if(tarifa > 0.0 && tarifa < 1.0){
            tarifaComision = tarifa;
        }
        else{
            tarifa = 0.0;
        }
    }
    
    public double obtenerTarifaComision(){
        return tarifaComision;
    }
    public void establecerVentasBrutas(double ventas){
        if(ventas < 0.0){
            ventasBrutas = 0.0;
        }
        else{
            ventasBrutas = ventas;
        }
    }
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
}
