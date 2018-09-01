package pkg2POO.persona;

import javax.swing.JOptionPane;

/**
 *
 * @author Genarogg
 */

public class Main {
    public static void main(String[]args){
        String nombre = JOptionPane.showInputDialog("Dime tu nombre: ");
        String nacionalidad = JOptionPane.showInputDialog("Dime tu nacionalidad: ");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Dime tu altura: "));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Dime tu edad: "));
        
        Persona persona = new Persona(nombre, nacionalidad,  altura, edad);
        
        JOptionPane.showMessageDialog(null,"tu nombre es: " + persona.getNombre());
        JOptionPane.showMessageDialog(null,"tu nacionalidad es: " + persona.getNacionalidad());
        JOptionPane.showMessageDialog(null,"tu altura es: " + persona.getAlturas());
        JOptionPane.showMessageDialog(null,"tu edad es: " + persona.getEdads());
    }    
}