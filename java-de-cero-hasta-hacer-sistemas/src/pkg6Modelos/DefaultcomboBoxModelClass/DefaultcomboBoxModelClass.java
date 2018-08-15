package pkg6Modelos.DefaultcomboBoxModelClass;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Genarogg
 */

public class DefaultcomboBoxModelClass {
    public DefaultcomboBoxModelClass(){
        JFrame jF = new JFrame();
        DefaultComboBoxModel dCBM = new DefaultComboBoxModel();
        JComboBox jCB = new JComboBox(dCBM);
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        
        p1.setNombre("Genaro");
        p1.setDereccion("San Francisco de Asis");
        p1.setNacionlidad("Venezolano");
        p1.setEdad(21);
        
        p2.setNombre("Erika");
        p2.setDereccion("San Francisco de Asis");
        p2.setNacionlidad("Venezolano");
        p2.setEdad(45);
        
        
        
    }

    public static void main(String[] args) {
        new DefaultcomboBoxModelClass();
    }
    
}

