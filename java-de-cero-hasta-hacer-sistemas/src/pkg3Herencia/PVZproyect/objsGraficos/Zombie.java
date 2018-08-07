package pkg3Herencia.PVZproyect.objsGraficos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Genarogg
 */

public class Zombie extends GraficosSuperClase {
    public Zombie(int x, int y){
        super(x, y);
        
        icon = new ImageIcon(getClass().getResource("/pkg3Herencia/PVZproyect/imagenes/Zombie.jpg"));
        imgGrafica = icon.getImage();
    }
    
    @Override
    public void mover(){
     xCoord -= 3;
    }
    
    @Override
    public void draw(Graphics g){
       g.drawImage(imgGrafica, xCoord, yCoord, 80, 110, null);
    }
}
