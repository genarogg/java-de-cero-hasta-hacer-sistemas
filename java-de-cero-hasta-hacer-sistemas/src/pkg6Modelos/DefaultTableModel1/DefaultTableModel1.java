package pkg6Modelos.DefaultTableModel1;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Genarogg
 */

public class DefaultTableModel1 extends JFrame {
    public DefaultTableModel1(){
        super("tableta");
        DefaultTableModel model = new DefaultTableModel();
        JTable jT = new JTable(model);
        JScrollPane jSP = new JScrollPane(jT);
        JComboBox jCB = new JComboBox();
        
        jT.setBounds(30,30,600,150);
        jSP.setBounds(30,30,600,150);
        
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Direccion");
        model.addColumn("Edad");
        model.addColumn("telefono");
        
        String [] persona1 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        String [] persona2 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        String [] persona3 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        String [] persona4 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        String [] persona5 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        String [] persona6 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        String [] persona7 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        String [] persona8 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        String [] persona9 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        String [] persona10 = {"Dante","Sparta","cerrada 4 #3","34","333.222.444"};
        
        model.addRow(persona1);
        model.addRow(persona2);
        model.addRow(persona3);
        model.addRow(persona4);
        model.addRow(persona5);
        model.addRow(persona6);
        model.addRow(persona7);
        model.addRow(persona8);
        model.addRow(persona9);
        model.addRow(persona10);
           
        this.add(jSP);

        //this.setLayout(null);
        this.setBounds(550,350,670, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        }
    

    /*public static void main(String[] args) {
     * new DefaultTableModel1();
    }*/        
    
}
