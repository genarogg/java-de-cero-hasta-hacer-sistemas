package pkg3Herencia.PVZpolimorfismo;

/**
 *
 * @author Genarogg
 */

public class BalaVerde extends ObjGraficos{
    
    String nombre;
    
    public BalaVerde(String nom){
        nombre = nom;
    }
    @Override
    public void mover(){
        System.out.println("Movimiento De Bala Plata " + nombre);
    }
}
