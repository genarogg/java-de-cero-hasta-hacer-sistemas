package pkg8Listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Genarogg
 */
public class MauseListener extends JFrame {
    
    public MauseListener() {
        super("MauseListener");
        
        JButton jB = new JButton("Saludar");
        JTextField jT = new JTextField();
        JLabel jL1 = new JLabel("escribe tu nombre: ");
        JLabel jL2 = new JLabel();
       
        MouseListener mL = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jL2.setText("Hola " + jT.getText());
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            
            }

            @Override
            public void mouseExited(MouseEvent e) {
            
            }
        };
        
        jB.addMouseListener(mL);
       
        
        
        jB.setBounds(30,300,100,25);
        jT.setBounds(30,270,200,25);
        jL1.setBounds(30,250,200,25);
        jL2.setBounds(30,50,200,25);
        
        
        
        
        add(jB);
        add(jT);
        add(jL1);
        add(jL2);
        
        setBounds(800,350,300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);        
        
    }
    public static void main(String[] args) {
       new MauseListener();
    }
}