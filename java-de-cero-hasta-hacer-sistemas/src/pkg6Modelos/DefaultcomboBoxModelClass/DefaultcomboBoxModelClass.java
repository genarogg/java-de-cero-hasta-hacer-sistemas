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
        
        p3.setNombre("Gabriel");
        p3.setDereccion("San Francisco de Asis");
        p3.setNacionlidad("Venezolano");
        p3.setEdad(20);
        
        p4.setNombre("Hilse");
        p4.setDereccion("San Francisco de Asis");
        p4.setNacionlidad("Venezolano");
        p4.setEdad(64);
        
        dCBM.addElement(p1);
        dCBM.addElement(p2);
        dCBM.addElement(p3);
        dCBM.addElement(p4);
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = pantalla.width;
        int y = pantalla.height;
        
        jF.setBounds(x/3, y/4,300,300);
        jCB.setBounds(10, 10, 100, 30);
        
        jF.add(jCB);
        
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setLayout(null);
        jF.setVisible(true);
        
    }

    public static void main(String[] args) {
        new DefaultcomboBoxModelClass();
    }
    
}

