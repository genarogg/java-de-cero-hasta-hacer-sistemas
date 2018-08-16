package pkg6Modelos;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Genarogg
 */
public class defaultTableModelClass {
    public defaultTableModelClass(){
        JFrame jF = new JFrame("defaultTableModelClass");
        DefaultTableModel dTM = new DefaultTableModel();
        JTable jT = new JTable(dTM);
        JScrollPane jSP = new JScrollPane(jT);
        
        dTM.addColumn("Nombre");
        dTM.addColumn("Direccion");
        dTM.addColumn("Nacionalidad");
        dTM.addColumn("Telefono");
        
        String [] p1 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p2 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p3 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p4 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p5 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p6 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p7 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p8 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p9 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p10 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p11 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p12 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p13 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p14 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p15 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p16 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p17 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p18 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p19 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p20 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p21 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p22 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p23 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p24 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p25 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p26 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p27 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p28 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p29 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p30 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p31 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p32 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p33 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p34 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p35 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p36 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p37 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p38 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        String [] p39 = {"Genaro","San Fransisco de Asís", "Venezolano", "0000.000.0000"};
        
        dTM.addRow(p1);
        dTM.addRow(p2);
        dTM.addRow(p3);
        dTM.addRow(p4);
        dTM.addRow(p5);
        dTM.addRow(p6);
        dTM.addRow(p7);
        dTM.addRow(p8);
        dTM.addRow(p9);
        dTM.addRow(p10);
        dTM.addRow(p11);
        dTM.addRow(p12);
        dTM.addRow(p13);
        dTM.addRow(p14);
        dTM.addRow(p15);
        dTM.addRow(p16);
        dTM.addRow(p17);
        dTM.addRow(p18);
        dTM.addRow(p19);
        dTM.addRow(p20);
        dTM.addRow(p21);
        dTM.addRow(p22);
        dTM.addRow(p23);
        dTM.addRow(p24);
        dTM.addRow(p25);
        dTM.addRow(p26);
        dTM.addRow(p27);
        dTM.addRow(p28);
        dTM.addRow(p29);
        dTM.addRow(p30);
        dTM.addRow(p31);
        dTM.addRow(p32);
        dTM.addRow(p33);
        dTM.addRow(p34);
        dTM.addRow(p35);
        dTM.addRow(p36);
        dTM.addRow(p37);
        dTM.addRow(p38);
        dTM.addRow(p39);
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = pantalla.width;
        int y = pantalla.height;
        
        jT.setBounds(10,10,500,500);
        jSP.setBounds(10,10,500,500);
        jF.setBounds(x/3,y/4,525,545);
        
        
        jF.add(jSP);
        
        //jF.setResizable(false);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setLayout(null);
        jF.setVisible(true);
    }
    public static void main(String[] args) {
        new defaultTableModelClass();
    }
}
