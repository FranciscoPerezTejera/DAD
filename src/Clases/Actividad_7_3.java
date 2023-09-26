package Clases;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Actividad_7_3 extends JFrame {

    JLabel etiqueta = new JLabel("Escribe: ");
    JTextField texto = new JTextField(" ");
    JTextField texto2 = new JTextField(" ");
    JLabel etiqueta2 = new JLabel("Número de hermanos: ");
    JLabel etiqueta3 = new JLabel("Número de hermanos: ");
    JButton botonEnviar = new JButton("ENVIAR");
    JRadioButton botonRadio = new JRadioButton("HOMBRE");
    JRadioButton botonRadio1 = new JRadioButton("MUJER");
    JSpinner edad = new JSpinner();
    JComboBox<String> sexo = new JComboBox<String>();

    public Actividad_7_3() throws HeadlessException {

        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

    public Actividad_7_3(String title) throws HeadlessException {

        BorderLayout layout1 = new BorderLayout();

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        //Panel 1
        panel1.add(etiqueta);
        panel1.add(texto);
        add(panel1);

        //Panel 2
        panel2.add(etiqueta2);
        panel2.add(edad);
        add(panel2);

        //Panel 3
        panel3.add(etiqueta3);
        add(panel3);
        
        setLayout(layout1);
        setTitle(title);
        setBounds(200, 200, 1280, 720);
        setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

}
