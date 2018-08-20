package pkg9DibujoEnJava.rectangulosYOvalos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Genarogg
 */

public class Main {
    public static void main(String[]args){
        
        String opcionS = JOptionPane.showInputDialog(null,"escribe 1 si quieres Rectangulos\nescribe 2 si quieres Ovalos");
     
        int opcion = Integer.parseInt(opcionS);
        
        Figuras f = new Figuras (opcion);
        
        JFrame ventana = new JFrame();
        
        ventana.add(f);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(700,700);
        ventana.setVisible(true);
    }   
}