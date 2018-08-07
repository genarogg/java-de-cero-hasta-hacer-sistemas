package pkg3Herencia.PVZproyect.objsGraficos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Genarogg
 */
public class GraficosSuperClase {
    protected Image imgGrafica;
    protected ImageIcon icon;
    protected int xCoord;
    protected int yCoord;
    
    public GraficosSuperClase(int x, int y){
        xCoord = x;
        yCoord = y;
    }
    
    public void mover(){
        xCoord -= 10;
    }
    public void draw(Graphics g){
        if(imgGrafica != null){
            g.drawImage(imgGrafica, xCoord, yCoord, 80, 100, null);
        }
    }
}
