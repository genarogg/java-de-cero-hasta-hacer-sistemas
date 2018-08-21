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
public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;
    
    public EmpleadoPorHoras(String nombre, String apellido,String nss, double salarioPorHoras, double horasTrabajadas){
        super(nombre, apellido, nss);
        
        establecerSueldo(salarioPorHoras);
        establecerHoras(horasTrabajadas);
    }
    public double obtenerSueldo(){
        return sueldo;
    }
}
