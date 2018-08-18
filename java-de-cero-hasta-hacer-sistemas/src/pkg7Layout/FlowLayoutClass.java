/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7Layout;

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