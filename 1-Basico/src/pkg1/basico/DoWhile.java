package pkg1.basico;

import java.util.Scanner;

/**
 *
 * @author Genarogg
 */

public class DoWhile {
    public static void main(String[]args){
    Scanner S = new Scanner(System.in);
    int Ent;
    
    do{
        System.out.print("Dame un entero: ");
        Ent = S.nextInt();
        
        if(Ent >= 100){
            System.out.println("Este es un numero de tres digitos");
        }
        else{
            if(Ent >= 10){
                System.out.println("Este es un numero de dos digitos");
            }
            else{
                System.out.println("Este es un numero de un digito");
            }
        }
    }while(Ent != 0);
    }    
}

