package pkg5InterfacesGraficas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Genarogg
 */

public class JTextFieldClass {
    public JTextFieldClass(){
        JFrame jF = new JFrame();
        JTextField jTF = new JTextField();
        
        jTF.setText("hola ");
        
        
       
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        
        jTF.setBounds(10,10,300,25);
        jF.setBounds(ancho/3,alto/4,350,350);
        
        jF.add(jTF);
        jF.setLayout(null);
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        JTextFieldClass d = new JTextFieldClass();
    }
}