package Clases;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SoloBoton {

    JFrame ventana;

    JButton boton1;
    JTextField escribe;
    JLabel etiqueta;

    public SoloBoton() throws HeadlessException {

        JPanel panel = new JPanel();
        ventana = new JFrame("Prueba botones");
        escribe = new JTextField(20);
        boton1 = new JButton("FINALIZAR EJECUCIÓN");
        etiqueta = new JLabel("PULSA EL BOTON");

       // boton1.addActionListener(e -> etiqueta.setText(escribe.getText()));
       // boton1.addActionListener(e -> etiqueta.setForeground(Color.magenta));
       boton1.addActionListener(e -> ventana.dispose());
        
        panel.setBounds(0, 0, 100, 100);
       // panel.add(escribe);
       // panel.add(etiqueta);
        panel.add(boton1);

        ventana.setContentPane(panel);
        ventana.setBounds(100, 100, 200, 200);
        ventana.setUndecorated(true);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

    }
}
