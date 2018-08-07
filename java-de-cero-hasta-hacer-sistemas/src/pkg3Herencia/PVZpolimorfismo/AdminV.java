package pkg3Herencia.PVZpolimorfismo;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Genarogg
 */

public class AdminV {
    ArrayList <ObjGraficos>  ListaDeFiguras;
    
    public AdminV(){
        ListaDeFiguras = new ArrayList<ObjGraficos>();
        
        ListaDeFiguras.add(new Zombie("goku"));
        ListaDeFiguras.add(new Zombie("veguera"));
        ListaDeFiguras.add(new BalaVerde("BalaVerde1"));
        ListaDeFiguras.add(new BalaVerde("BalaVerde2"));
        ListaDeFiguras.add(new BalaPlata("BalaPlata1"));
        ListaDeFiguras.add(new BalaPlata("BalaPlata2"));
        
        TimerTask tiempoTask = new TimerTask(){
            @Override
            public void run(){
                moverFiguras();
            }
        };
        
        Timer tiempo = new Timer();
        tiempo.schedule(tiempoTask, 0, 5000);
        
    }
        public void moverFiguras(){
            for(ObjGraficos og : ListaDeFiguras){
                og.mover();
            }
            System.out.println("-----------------------------------------------------");
        }
        
        public static void main(String[]args){
            AdminV  admin = new AdminV();
        }  
}