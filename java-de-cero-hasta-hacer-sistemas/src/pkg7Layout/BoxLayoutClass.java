package pkg7Layout;

/**
 *
 * @author Genarogg
 */
public class BoxLayoutClass {
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
}
