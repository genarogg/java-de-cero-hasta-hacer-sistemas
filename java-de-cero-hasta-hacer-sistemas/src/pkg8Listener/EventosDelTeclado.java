package pkg8Listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Genarogg
 */

public class EventosDelTeclado {
    public EventosDelTeclado(){
        JFrame jF = new JFrame();
        JButton jB = new JButton("¡¡¡Tocame XD!!!");
        JLabel jL1 = new JLabel("Introduce tu nombre");
        JLabel jL2 = new JLabel();
        JTextField jT = new JTextField();
        
        jB.setBounds(30,300,150,25);
        jT.setBounds(30,270,200,25);
        jL1.setBounds(30,250,200,25);
        jL2.setBounds(30,50,200,25);
        
        KeyListener kL = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_T){
                    jL2.setText("hola " + jT.getText());
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        };
        
        jT.addKeyListener(kL);
        
        jF.add(jB);
        jF.add(jT);
        jF.add(jL1);
        jF.add(jL2);
        
        
        jF.setBounds(800,350,300,400);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setLayout(null);
        jF.setVisible(true);
    }
    public static void main(String[] args) {
        new EventosDelTeclado();
    }
}   