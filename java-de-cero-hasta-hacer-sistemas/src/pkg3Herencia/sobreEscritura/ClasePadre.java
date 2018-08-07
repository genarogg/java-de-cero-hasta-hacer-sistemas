package pkg3Herencia.sobreEscritura;

/**
 *
 * @author Genarogg
 */
public class ClasePadre extends ClaseAbuelo {
    
    @Override
    public String Abuelo(){
        return "Yo soy tu Padre";
    }
            
    public static void main(String[]args){
        ClaseAbuelo p = new ClaseAbuelo();
        System.out.println(p.Abuelo());
    }
}
