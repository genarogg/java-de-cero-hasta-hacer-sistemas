package pkg5InterfacesGraficas.interfasProgramatica;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFram  {
    public JFram(){
        JLabel etiqueta = new JLabel();
        JFrame f = new JFrame();
        
        etiqueta.setBounds(200,100,50,20);
        etiqueta.setIcon(new ImageIcon("src/pkg5InterfacesGraficas/img/1.jpg"));
        
        
        f.add(etiqueta);
        f.setVisible(true);        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
    }
    public static void main(String[]args){
        JFram f =new JFram();
    }
}