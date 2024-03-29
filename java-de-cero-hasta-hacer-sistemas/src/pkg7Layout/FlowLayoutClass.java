package pkg7Layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Genarogg
 */

public class FlowLayoutClass {
    public FlowLayoutClass(){
        JFrame jF = new JFrame();
        JLabel nombre = new JLabel("Escribe tu nombre");
        JTextField campoText = new JTextField(12);
        JButton botonEnviar = new JButton("Enviar");
        
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
        layout.setHgap(20);
        layout.setVgap(20);
                
        jF.setLayout(layout);
        jF.add(nombre);
        jF.add(campoText);
        jF.add(botonEnviar);
        
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setVisible(true);
        jF.pack();
        
    }

    public static void main(String[] args) {
        new FlowLayoutClass();
    }
}