package pkg5InterfacesGraficas;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonClass {
    
    public JRadioButtonClass(){
        JFrame jF = new JFrame();
        JRadioButton jRB1 = new JRadioButton("Activado");
        JRadioButton jRB2 = new JRadioButton("Desactivado");
        ButtonGroup bG = new ButtonGroup();
        
        jRB1.setBounds(50,50,100,25);
        jRB2.setBounds(50,70,100,25);
        
        bG.add(jRB1);
        bG.add(jRB2);
        
        jF.add(jRB1);
        jF.add(jRB2);
        
        jF.setSize(400,400);
        jF.setLayout(null);
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JRadioButtonClass();
    }
}