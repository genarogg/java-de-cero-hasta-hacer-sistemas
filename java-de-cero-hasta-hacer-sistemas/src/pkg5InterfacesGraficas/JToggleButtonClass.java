package pkg5InterfacesGraficas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

/**
 *
 * @author Genarogg
 */

public class JToggleButtonClass {
    
    public JToggleButtonClass(){
        JFrame jF = new JFrame();
        JToggleButton jTB = new JToggleButton("go",true);
        
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        
        jF.setBounds(ancho/3,alto/4,300,120);
        jTB.setBounds(100,40,50,40);
        
        System.out.println("el togle esta " +  jTB.isEnabled());
        
        jF.add(jTB);
        jF.setLayout(null);
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new JToggleButtonClass();
    }
}
