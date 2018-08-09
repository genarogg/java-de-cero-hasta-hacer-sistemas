package pkg4Exeptiones;

/**
 *
 * @author Genarogg
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aritmetica {
    
    Scanner sc;
    int numerador;
    int denominador;
    boolean continuarCiclo;
    
    public Aritmetica(){
        exceptiones();
    }
    
    public void exceptiones(){
        
        continuarCiclo = true;
        
        do{
            try{
                sc = new Scanner(System.in);
        
                System.out.println("introduce el denominador");
                denominador = sc.nextInt();

                System.out.println("introduce el numerador");
                numerador = sc.nextInt();

                int divicion = denominador / numerador;

                System.out.println(divicion);    
                continuarCiclo = false;
            }
            
            catch(ArithmeticException e){
                System.err.println("los enteros no pueden dividir entre 0");
            }
            catch(InputMismatchException e){
                System.err.println("Introdugisteis un caraacter diferente a un numero");
            }
            
        }while(continuarCiclo);
    }
    
    public static void main(String[] args) {
        new Aritmetica();
    }
    
}
