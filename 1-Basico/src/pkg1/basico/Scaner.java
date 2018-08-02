package pkg1.basico;

import java.util.Scanner;

/**
 *
 * @author Genarogg
 */


public class Scaner {
    public static void main(String[]args){
        Scanner escaner = new Scanner(System.in);
        int a = escaner.nextInt();
        int b = escaner.nextInt();
        int c = a + b;
        
        System.out.println(c);
    }    
}