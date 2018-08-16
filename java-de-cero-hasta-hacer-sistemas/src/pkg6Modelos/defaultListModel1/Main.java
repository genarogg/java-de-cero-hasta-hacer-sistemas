package pkg6Modelos.defaultListModel1;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Genarogg
 */

public class Main {
    public static void main(String[] args) {
        JFrame jF = new JFrame();
        DefaultListModel <Persona> dTM = new DefaultListModel<>();
        JList jT = new JList(dTM);
        JScrollPane jS = new JScrollPane(jT); 
        
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        dTM.addElement(new Persona("Genaro","Gonzalez","Cerrada 4, #2","222-222-222-222"));
        
        jT.setBounds(30,15,100,200);
        jS.setBounds(30,15,100,200);
        
        jF.add(jS);
        
        jF.setLayout(null);
        jF.setBounds(450,450,300,350);
        jF.setVisible(true);
       
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
