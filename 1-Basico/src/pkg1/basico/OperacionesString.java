package pkg1.basico;

/**
 *
 * @author Genarogg
 */
public class OperacionesString {
    public static void main(String[]args){
        String a = "Hola Mundo";
        String b = "genaro";
        String c = a.substring(0,5);
        String d = c.concat(b);
        boolean e = a.equals(c);
        String f = a.trim();
    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    } 
}
