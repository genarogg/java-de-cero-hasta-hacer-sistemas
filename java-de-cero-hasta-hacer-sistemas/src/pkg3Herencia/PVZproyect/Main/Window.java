package pkg3Herencia.PVZproyect.Main;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Genarogg
 */
public class Window {
     
    public Window(){
        
        JFrame ventana = new JFrame();
        ventana.add(new VisualManager());
        ventana.setSize(1000, 1000);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Window ventana = new Window();
    }
}
