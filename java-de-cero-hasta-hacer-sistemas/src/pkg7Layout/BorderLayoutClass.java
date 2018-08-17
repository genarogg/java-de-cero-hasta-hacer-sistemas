package pkg7Layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Genarogg
 */
public class BorderLayoutClass {
    
    private JLabel etiquetaSuperior;
    private JPanel panelIzq, panelDer, panelInf;
    private JButton botonIzq1, botonIzq2, botonIzq3;
    private JButton botonDer1, botonDer2, botonDer3;
    private JButton botonInf1, botonInf2;
    private JScrollPane jScroll;
    
    public BorderLayoutClass(){
        JFrame jF = new JFrame();
        
        construccionDePanelIzq();
        construccionDePanelDer();
        construccionDePanelInf();
        
        jScroll = new JScrollPane(new JTextArea("JTexArea", 10, 15));
        
        etiquetaSuperior = new JLabel("Demostracion de BorderLayout");
        
        jF.add(etiquetaSuperior,BorderLayout.NORTH);
        jF.add(jScroll, BorderLayout.CENTER);
        jF.add(panelIzq, BorderLayout.WEST);
        jF.add(panelDer, BorderLayout.EAST);
        jF.add(panelInf, BorderLayout.SOUTH);
        
        //jF.setResizable(false);
        
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setVisible(true);
        jF.pack();
        
    }
    
    private void construccionDePanelIzq(){
        panelIzq = new JPanel();
        
        botonIzq1 = new JButton("Izq1");
        botonIzq2 = new JButton("Izq2"); 
        botonIzq3 = new JButton("Izq3");
        
        panelIzq.setLayout(new BoxLayout(panelIzq,BoxLayout.Y_AXIS));
        
        panelIzq.setBackground(Color.RED);
        
        panelIzq.add(botonIzq1);
        panelIzq.add(botonIzq2);
        panelIzq.add(botonIzq3);
    }
    private void construccionDePanelDer(){
        panelDer = new JPanel();
        
        botonDer1 = new JButton("Der1");
        botonDer2 = new JButton("Der2");
        botonDer3 = new JButton("Der3");
        
        panelDer.setLayout(new BoxLayout(panelDer,BoxLayout.Y_AXIS));
        
        panelDer.setBackground(Color.BLUE);
        
        panelDer.add(botonDer1);
        panelDer.add(botonDer2);
        panelDer.add(botonDer3);   
    }
    private void construccionDePanelInf(){
        panelInf = new JPanel();
        
        botonInf1 = new JButton("Aceptar"); 
        botonInf2 = new JButton("Cancelar");
        
        panelInf.setLayout(new FlowLayout());
        
        panelInf.setBackground(Color.GREEN);
        
        panelInf.add(botonInf1);
        panelInf.add(botonInf2);       
    }
    /*public static void main(String[] args) {
       new BorderLayoutClass();
    }*/

}