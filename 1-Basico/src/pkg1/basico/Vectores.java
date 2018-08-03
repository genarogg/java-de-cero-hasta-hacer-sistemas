package pkg1.basico;

import java.util.Scanner;

/**
 *
 * @author Genarogg
 */
public class Vectores {
    public static void main(String[]args){    
        Scanner s = new Scanner(System.in);
        int v[] = new int [9];
        
        for(int i = 0;i < v.length; i++){
            int n = s.nextInt();
            v[i] = n;
        }  
        for(int i = 0; i < v.length;i++){
            System.out.println("V["+ i +"] = " + v[i]);
        }
    }
}
