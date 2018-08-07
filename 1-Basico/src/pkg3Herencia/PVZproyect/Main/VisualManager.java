import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;

import java.util.TimerTask;
import javax.swing.JPanel;

import pkg3Herencia.PVZproyect.objsGraficos.BalaPlata;
import pkg3Herencia.PVZproyect.objsGraficos.BalaVerde;
import pkg3Herencia.PVZproyect.objsGraficos.GraficosSuperClase;
import pkg3Herencia.PVZproyect.objsGraficos.Zombie;

/**
 *
 * @author Genarogg
 */
public class VisualManager extends JPanel {
    private ArrayList <GraficosSuperClase> listaDeGraficos;
    
    public VisualManager(){
        this.setSize(500,500);
        this.setBackground(Color.BLACK);
        
        listaDeGraficos = new ArrayList<GraficosSuperClase>();
        
        listaDeGraficos.add(new Zombie(900, 10));
        listaDeGraficos.add(new Zombie(850, 100));
        listaDeGraficos.add(new Zombie(800, 200));
        listaDeGraficos.add(new Zombie(910, 300));
        listaDeGraficos.add(new Zombie(920, 400));
        listaDeGraficos.add(new Zombie(850, 500));
        listaDeGraficos.add(new Zombie(710, 600));
        listaDeGraficos.add(new Zombie(860, 700));
        listaDeGraficos.add(new Zombie(900, 800));
        listaDeGraficos.add(new BalaVerde(10, 10));
        listaDeGraficos.add(new BalaVerde(15, 50));
        listaDeGraficos.add(new BalaVerde(25, 90));
        listaDeGraficos.add(new BalaVerde(5, 140));
        listaDeGraficos.add(new BalaVerde(9, 190));
        listaDeGraficos.add(new BalaVerde(13, 240));
        listaDeGraficos.add(new BalaVerde(16, 290));
        listaDeGraficos.add(new BalaPlata(1, 350));
        listaDeGraficos.add(new BalaPlata(5, 400));
        listaDeGraficos.add(new BalaPlata(30, 450));
        listaDeGraficos.add(new BalaPlata(10, 500));
        listaDeGraficos.add(new BalaPlata(10, 550));
        listaDeGraficos.add(new BalaPlata(0, 600));
        listaDeGraficos.add(new BalaPlata(-2, 650));
        listaDeGraficos.add(new BalaPlata(15, 700));
        listaDeGraficos.add(new BalaVerde(13, 750));
        listaDeGraficos.add(new BalaVerde(16, 800));
        listaDeGraficos.add(new BalaPlata(1, 852));
        listaDeGraficos.add(new BalaPlata(5, 900));
        
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                movimiento();
                repaint();
            }
        };
                
        Timer timer = new Timer();
        timer.schedule(timerTask, 0, 100);
    }    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(GraficosSuperClase pintorDeImagenes : listaDeGraficos){
            pintorDeImagenes.draw(g);
        }
    }
    public void movimiento(){
        for(GraficosSuperClase MovimientoDeImagenes : listaDeGraficos){
            MovimientoDeImagenes.mover();
        }
    }
    
}