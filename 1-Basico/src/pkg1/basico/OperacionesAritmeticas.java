package pkg1.basico;

import java.util.Scanner;

/**
 *
 * @author Genarogg
 */
public class OperacionesAritmeticas {
    public OperacionesAritmeticas(){
    }
    public double suma(double x, double y){
        double suma = x + y;
        return suma;
    }
    public double resta(double x,double y){
        double resta = x - y;
        return resta;
    }
    public double mult(double x,double y){
        double mult = x * y;
        return mult;
    }
    public double div(double x, double y){
        double div = x / y;
        return div;
    } 
    public void imprecion(double suma, double resta,double mult, double divi){
        System.out.println("el resultado de la suma es: " + suma);
        System.out.println("el resultado de la suma es: " + resta);
        System.out.println("el resultado de la suma es: " + mult);
        System.out.println("el resultado de la suma es: " + divi);
    }
    
     public static void main(String[]args){
        Scanner s1 = new Scanner(System.in);
        OperacionesAritmeticas datos = new OperacionesAritmeticas();
        
        double n1 = s1.nextDouble();
        double n2 = s1.nextDouble();
      
        double suma = datos.suma(n1, n2);
        double resta = datos.resta(n1, n2);
        double mult = datos.mult(n1, n2);
        double divi = datos.div(n1, n2);
        
        datos.imprecion(suma, resta, mult, divi);
    } 
}
