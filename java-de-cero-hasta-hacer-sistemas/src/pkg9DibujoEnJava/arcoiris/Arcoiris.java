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
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        int radio = 20;
        
        int centroX = getWidth() / 2;
        int centroY = getHeight() - 10;
        
        for(int contador = colores.length; contador > 0; contador--){
            g.setColor(colores[contador - 1]);
            
            int valorX = centroX - contador * radio;
            int valorY = centroY - contador * radio;
            int ancho = contador * radio * 2;
            int alto = contador * radio * 2;
            
            g.fillArc(valorX, valorY, ancho, alto, 0, 180);
        }
    }    
}