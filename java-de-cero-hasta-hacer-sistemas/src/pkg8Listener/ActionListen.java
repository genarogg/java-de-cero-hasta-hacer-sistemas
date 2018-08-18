package pkg8Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Genarogg
 */
public class ActionListen {
    public ActionListen(){
        JFrame jF = new JFrame();
        JTextField jT = new JTextField();
        JLabel jL1 = new JLabel("cual es tu nombre: ");
        JLabel jL2 = new JLabel();
        JButton jB = new JButton("Saludar!!!");
        
        ActionListener aL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jL2.setText("Hola " + jT.getText());    
            }
        };
        
        jB.addActionListener(aL);
        
        jB.setBounds(30,300,100,25);
        jT.setBounds(30,270,200,25);
        jL1.setBounds(30,250,200,25);
        jL2.setBounds(30,50,200,25);
        
        
        jF.add(jB);
        jF.add(jT);
        jF.add(jL1);
        jF.add(jL2);
        
        jF.setBounds(800,350,300,400);
        jF.setLayout(null);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setVisible(true);
    }
    public static void main(String[] args) {
        new ActionListen(); 
    }
}