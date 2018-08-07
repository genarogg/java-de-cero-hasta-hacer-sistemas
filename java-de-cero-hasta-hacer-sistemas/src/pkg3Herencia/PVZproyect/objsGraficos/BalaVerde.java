package pkg3Herencia.PVZproyect.objsGraficos;

import java.awt.Graphics;
import static javafx.scene.input.KeyCode.I;
import javax.swing.ImageIcon;

/**
 *
 * @author Genarogg
 */

public class BalaVerde extends GraficosSuperClase {
    public BalaVerde(int x, int y){
        super(x, y);
        icon = new ImageIcon(getClass().getResource("/pkg3Herencia/PVZproyect/imagenes/BalaVerde.png"));
        imgGrafica = icon.getImage();
    }
    
    @Override
    public  void mover (){
        xCoord += 8;
    }
    
    @Override
    public void draw(Graphics g){
        g.drawImage(imgGrafica, xCoord, yCoord, 30, 30, null);
    }
}
