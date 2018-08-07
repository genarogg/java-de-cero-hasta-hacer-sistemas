package pkg1Basico;

/**
 *
 * @author Genarogg
 */
public class ModificadoresDeAcceso {
    
    public String a = "Hey, como estas";
    private String b = "hola, mi nombre es java";
    protected String c = "hola, soy portected";
    
    static String d = "Hola, yo soy estatico";
    final String  E = "hola mundo";
    
    public static void main(String[] args) {
        ModificadoresDeAcceso md = new ModificadoresDeAcceso();
        
        System.out.println(md.a);
        System.out.println(md.b);
        System.out.println(md.c);
        System.out.println(md.d);
        System.out.println(md.E);
        
    }
}
