package pkg3Herencia.PVZpolimorfismo;

/**
 *
 * @author Genarogg
 */

public class Zombie extends ObjGraficos {
    
    String nombre;
    
    public Zombie(String nom){
        nombre = nom;
    }

    @Override
    public void mover(){
        System.out.println("Movimienti de bala Plata" + nombre);
    }
}

