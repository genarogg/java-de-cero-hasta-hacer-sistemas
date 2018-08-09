package pkg4Exeptiones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Genarogg
 */
public class Exception {

    public static int contiene(int numerador, int denominador)throws ArithmeticException{
        return numerador / denominador;
    }
    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
                boolean continuarCiclo = true;
    
        do{
            try{
                System.out.println("Introdusca un numerador entero");
                int numerador = explorador.nextInt();
                System.out.println("Introdusca un denominador entero");
                int denominador = explorador.nextInt();
                
                int resultado = Exception.contiene(numerador, denominador);
                System.out.println("El resultodo de: " + numerador + "/" + denominador + " es: " + resultado);
                continuarCiclo = false;
                        
            }
            catch(InputMismatchException exception){
                System.err.println("Se produjo una excepcion " + exception);
                explorador.nextLine();
                
                System.out.println("Debe introducir numeros enteros. Intentelo de nuevo. \n");
            
            }
            catch(ArithmeticException exception){
                    System.err.println("\nException " + exception);
                    System.out.println("Cero es un denominador invalido.");
                    }
        }while(continuarCiclo);
    }   
}