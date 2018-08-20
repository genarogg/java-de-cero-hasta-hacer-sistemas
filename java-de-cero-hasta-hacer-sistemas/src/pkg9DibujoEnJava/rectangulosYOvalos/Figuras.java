package pkg9DibujoEnJava.rectangulosYOvalos;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Genarogg
 */
public class Figuras extends JPanel {
    
    private int opcion;
    
    public Figuras(int opcionUsuario){
        opcion = opcionUsuario;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(int i = 0;i < 30;i ++){
            switch(opcion){
                case 1:{
                    int xRect = 10 + i * 10;
                    int yRect = 10 + i * 10;
                    int anchoRect = 50 + i * 10;
                    int altoRect = 50 + i * 10;
                    g.drawRect(xRect, yRect, anchoRect, altoRect);
                    break;
                }
                
            }
        }
    }
}
