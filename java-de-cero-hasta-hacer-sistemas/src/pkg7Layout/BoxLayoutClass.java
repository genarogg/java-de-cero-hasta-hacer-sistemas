package pkg7Layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Genarogg
 */
public class BoxLayoutClass extends JFrame {
    private JPanel panelSuperior, panelMedio,panelInferior;
    private JLabel nombre, contraseña,titulo;
    private JTextField campoUsuario;
    private JButton botonAceptar, botonCancelar;
    private JPasswordField campoContraseña;
    
    public void construccionDePanelSuperior(){
        panelSuperior = new JPanel();
        nombre = new JLabel("Nombre de usuario:");
        campoUsuario = new JTextField(10);
        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(nombre);
        panelSuperior.add(campoUsuario);
    }
    public void construccionDePanelMedio(){
        panelMedio = new JPanel(); 
        contraseña = new JLabel("Contraseña:");
        campoContraseña = new JPasswordField(10);
        panelMedio.setLayout(new FlowLayout());
        panelMedio.add(contraseña);
        panelMedio.add(campoContraseña);
    }
    public void ConstruccionDePanelInferior(){
        panelInferior = new JPanel();
        botonAceptar = new JButton("Aceptar");
        botonCancelar = new JButton("Cancelar");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.add(botonAceptar);
        panelInferior.add(botonCancelar);
    }
    public BoxLayoutClass() {
        titulo = new JLabel("LOGIN");
        
        construccionDePanelSuperior();
        construccionDePanelMedio();
        ConstruccionDePanelInferior();
        
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        this.add(titulo);
        this.add(panelSuperior);
        this.add(panelMedio);
        this.add(panelInferior);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack(); 
    }
    public static void main(String[] args) {
        new BoxLayoutClass();
    }   
}

