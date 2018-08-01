package pkg1.basico;

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
}
