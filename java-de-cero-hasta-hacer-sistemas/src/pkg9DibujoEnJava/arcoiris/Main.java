package pkg9DibujoEnJava.arcoiris;

import javax.swing.JFrame;

/**
 *
 * @author Genarogg
 */

public class Main {
    public static void main(String[]args){
        JFrame ventana = new JFrame ();
        Arcoiris arcoiri = new Arcoiris();
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(arcoiri);
        ventana.setSize(400,250);
        ventana.setVisible(true);
    }    
}
