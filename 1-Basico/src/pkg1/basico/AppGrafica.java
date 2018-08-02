package pkg1.basico;

import javax.swing.JOptionPane;

/**
 *
 * @author Genarogg
 */
public class AppGrafica {
    public AppGrafica(){
    
    }
    private double suma(double x,double y){
        double suma = x + y;
        return suma;
    }
    private double resta(double x, double y){
        double resta = x - y;
        return resta;
    }
    private double mult(double x, double y){
        double mult = x * y;
        return mult;
    }
    private double div(double x,double y){
        double mult = x / y;
        return mult;
    }
    
    public static void main(String[]args){
    
        String S1 = JOptionPane.showInputDialog("Introduzce el primer numero: ");
        String S2 = JOptionPane.showInputDialog("Introdusca el segundo numero: ");
        
        double N1 = Double.parseDouble(S1);
        double N2 = Double.parseDouble(S2);
        
        AppGrafica App = new AppGrafica();
        
        double suma = App.suma(N1, N2);
        double resta = App.resta(N1, N2);
        double mult = App.mult(N1, N2);
        double div = App.div(N1, N2);
        
        JOptionPane.showMessageDialog(null,"el resultado de la suma es " + suma);
        JOptionPane.showMessageDialog(null,"EL resultado de la resta es " + resta);
        JOptionPane.showMessageDialog(null,"el resultado de la multiplecaicon es " + mult);
        JOptionPane.showMessageDialog(null, "El resultado de la division es " + div);
    
    }
}
