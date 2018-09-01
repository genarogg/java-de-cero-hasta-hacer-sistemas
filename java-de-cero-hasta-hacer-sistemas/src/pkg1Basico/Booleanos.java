package pkg1Basico;

/**
 *
 * @author Genarogg
 */

public class Booleanos {
    
public static void main(String[]args){
        int a = 6;
        int b = 9;
        
        boolean c = a < b;
        boolean d = b > a;
        boolean e = a <= b;
        boolean f = b >= a;
        boolean g = c ^ false;
        boolean h = c == true;
        boolean j = c != false;
        boolean k = c || d;
        boolean l = c && d;
        boolean m = !false;
                
        System.out.println("el respuesta es: " + c);
        System.out.println("el respuesta es: " + d);
        System.out.println("el respuesta es: " + e);
        System.out.println("el respuesta es: " + f);
        System.out.println("el respuesta es: " + g);
        System.out.println("el respuesta es: " + h);
        System.out.println("el respuesta es: " + j);
        System.out.println("el respuesta es: " + k);
        System.out.println("el respuesta es: " + l);
        System.out.println("el respuesta es: " + m);
    
    }

}
