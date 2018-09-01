package pkg5InterfacesGraficas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Genarogg
 */

public class JTextAreaClass {
    public JTextAreaClass(){
        JFrame jF = new JFrame();
        JTextArea jTA = new JTextArea();
        
        jTA.setText("\nhola ");
        jTA.append("mundo");
        
       
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        
        jTA.setBounds(10,10,300,300);
        jF.setBounds(ancho/3,alto/4,350,350);
        
        jF.add(jTA);
        jF.setLayout(null);
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        JTextAreaClass d = new JTextAreaClass();
    }
}