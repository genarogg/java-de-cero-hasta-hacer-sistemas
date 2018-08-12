package pkg5InterfacesGraficas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelClass {
    public JLabelClass(){
        JFrame jF = new JFrame();
        JLabel jL = new JLabel(new ImageIcon(getClass().getResource("./img/1.jpg"))); 
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int alto = pantalla.height;
        int ancho = pantalla.width;
        jF.setBounds(ancho/3,alto/5, 200 ,200 );   
        jL.setBounds(200,200, 200, 200);
        
        jF.add(jL);
        
        jF.setTitle("JLabel");
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.pack();
    }
    public static void main(String[]arg){
        new JLabelClass();
    } 
}