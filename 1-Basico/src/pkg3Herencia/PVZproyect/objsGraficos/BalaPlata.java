package pkg3Herencia.PVZproyect.objsGraficos;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Genarogg
 */

public class BalaPlata extends GraficosSuperClase {
    
    public BalaPlata (int x, int y){
        super(x, y);
        icon = new ImageIcon(getClass().getResource("/imagenes/BalaPlata.png"));
        imgGrafica = icon.getImage();
    }
    
    @Override
    public void mover(){
        xCoord += 5;
    }
    
    @Override
    public void draw(Graphics g){
        g.drawImage(imgGrafica, xCoord, yCoord, 30, 30, null);
    }
}