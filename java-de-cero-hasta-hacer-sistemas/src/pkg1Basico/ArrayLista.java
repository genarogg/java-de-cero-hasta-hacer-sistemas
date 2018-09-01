package pkg1Basico;

import java.util.ArrayList;

/**
 *
 * @author Genarogg
 */

public class ArrayLista {
     public static void main(String[]args){
        ArrayList <String>  k  = new ArrayList <String>();
        
        k.add("Hola");
        k.add("Adios");   
        k.add("Como estas");
        k.add("Cascada");
        k.add("Que hora es");
        
        k.forEach((Contenido) -> {
            System.out.println(Contenido);
        });
        if(k.contains("Hola")){
            System.out.println("Contiene el elemento");
        }
        else{
            System.out.println("No contiene el elemento");
        }
        if(k.contains(" ")){
            System.out.println("Contiene el elemento");
        }
        else{
            System.out.println("No contiene el elemento");
        }
        k.clear();
        
        System.out.println(k.isEmpty());
        
    }   
}