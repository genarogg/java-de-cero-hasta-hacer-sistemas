package pkg3Herencia.PVZpolimorfismo;

/**
 *
 * @author Genarogg
 */

public class BalaPlata extends ObjGraficos {
    
    String nombre;
    
    public BalaPlata(String nom){
        nombre = nom;
    }
    
    @Override
    public void mover(){
        System.out.println("Movimiento de Bala Plata");
    }

    
}