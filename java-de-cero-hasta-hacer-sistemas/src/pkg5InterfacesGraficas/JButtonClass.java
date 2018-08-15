package pkg5InterfacesGraficas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Genarogg
 */

public class JButtonClass {
    public JButtonClass(){
        JFrame jF = new JFrame();
        JButton jB = new JButton("XJ9", new ImageIcon(getClass().getResource("xj9.jpg")));
        
        String hola = jB.getText();
        
        System.out.println(hola);
        
        jB.setMnemonic('c');
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        
        jB.setBounds(0,0,650,936);
        jF.setBounds(ancho/3,alto/4,700,1000);
        
        jF.add(jB);
        jF.setLayout(null);
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }
    
    public static void main(String[] args) {
        new JButtonClass();
    }
}