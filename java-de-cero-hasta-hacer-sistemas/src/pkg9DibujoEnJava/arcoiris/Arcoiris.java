package pkg9DibujoEnJava.arcoiris;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Genarogg
 */
public class Arcoiris extends JPanel {
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);
    
    private Color[] colores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO,Color.BLUE,
                               Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
 
    public Arcoiris(){
        setBackground(Color.WHITE);
    }
     
}