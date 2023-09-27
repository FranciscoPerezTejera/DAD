package Clases;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class Actividad_7_3 extends JFrame {

    JLabel etiqueta1 = new JLabel("NOMBRE: ");
    JLabel etiqueta2 = new JLabel("APELLIDOS: ");
    JLabel etiqueta3 = new JLabel("EDAD: ");
    JLabel etiqueta4 = new JLabel("SEXO: ");
    JTextField texto = new JTextField();
    JTextField texto2 = new JTextField();
    JButton botonEnviar = new JButton("ENVIAR");
    JRadioButton botonRadio = new JRadioButton("HOMBRE");
    JRadioButton botonRadio1 = new JRadioButton("MUJER");
    JSpinner edad;
    ButtonGroup grupoBotones = new ButtonGroup();

    public Actividad_7_3() throws HeadlessException {

        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

    public Actividad_7_3(String title) throws HeadlessException {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(0, 0, 1280, 720);
        
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);// Valor inicial, mínimo, máximo, incremento
        edad = new JSpinner(spinnerModel);
        grupoBotones.add(botonRadio);
        grupoBotones.add(botonRadio1);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 3));
        
        panel.add(etiqueta1);
        panel.add(texto);

        panel.add(etiqueta2);
        panel.add(texto2);

        panel.add(etiqueta3);
        panel.add(edad);

        panel.add(etiqueta4);
        panel.add(botonRadio);
        panel.add(botonRadio1);
        
        
         
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        setTitle(title);

    }

}
