package Clases;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Formulario {

    JFrame ventana;
    JRadioButton RadioBoton1;
    JRadioButton BadioBoton2;
    JRadioButton RadioBoton3;
    JRadioButton RadioBoton4;
    JButton boton5;
    JLabel etiqueta;

    public Formulario() {

        JPanel panel = new JPanel();
        ventana = new JFrame("Prueba botones");
        etiqueta = new JLabel();
        RadioBoton1 = new JRadioButton("FUTBOL");
        BadioBoton2 = new JRadioButton("TENIS");
        RadioBoton3 = new JRadioButton("BALONCESTO");
        RadioBoton4 = new JRadioButton("FUCKING");
        boton5 = new JButton("ENVIAR");
        ButtonGroup grupo = new ButtonGroup();

        grupo.add(RadioBoton1);
        grupo.add(BadioBoton2);
        grupo.add(RadioBoton3);
        grupo.add(RadioBoton4);

        boton5.addActionListener((e) -> {
            
            Enumeration<AbstractButton> lista = grupo.getElements();
            JRadioButton seleccion = new JRadioButton();
            AbstractButton button;
            JDialog dialogo = new JDialog();

            while (lista.hasMoreElements()) {
                
                button = lista.nextElement();
                if (button.isSelected()) {
                
                    seleccion = (JRadioButton) button;
                }

            }
            
            etiqueta.setText(seleccion.getText());
            dialogo.add(etiqueta);
            dialogo.setSize(200, 200);
            dialogo.setAlwaysOnTop(true);
            dialogo.setVisible(true);
            
        });

        panel.setBounds(0, 0, 100, 100);

        panel.add(RadioBoton1);
        panel.add(BadioBoton2);
        panel.add(RadioBoton3);
        panel.add(RadioBoton4);
        panel.add(boton5);
        panel.add(etiqueta);

        ventana.setContentPane(panel);
        ventana.setBounds(100, 100, 200, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

}
