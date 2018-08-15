package pkg5InterfacesGraficas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxClass {
    public JComboBoxClass(){
        JFrame jF = new JFrame("JComboBoxClass"); 

        String [] arreglo = {"genaro", "gabriel","erika", "hola"};
        
        JComboBox jCB = new JComboBox(arreglo);
        
        jCB.setSelectedItem("gabriel");
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        
        jF.setBounds(ancho/3,alto/4,300,300);
        jCB.setBounds(10,10,70,30);

        jF.add(jCB);
        jF.setLayout(null);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setVisible(true);

    }
    public static void main(String[]args){
        new JComboBoxClass();
        
    }
}