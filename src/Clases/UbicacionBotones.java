package Clases;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author 2damb
 */
public class UbicacionBotones extends JFrame {

    BorderLayout border;

    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    JButton boton6;
    JButton boton7;
    JButton boton8;

    public UbicacionBotones() throws HeadlessException {
        
        border = new BorderLayout();
        
        boton1 = new JButton("boton 1");
        boton2 = new JButton("boton 2");
        boton3 = new JButton("boton 3");
        boton4 = new JButton("boton 4");
        boton5 = new JButton("boton 5");
        boton6 = new JButton("boton 6");
        boton7 = new JButton("boton 7");
        boton8 = new JButton("boton 8");

       // setBounds(0, 0, 1280, 720);
        setVisible(true);
        
        setLayout(border);
        
        add(boton1,border.NORTH);
        add(boton2,border.NORTH);
        add(boton3,border.SOUTH);
        add(boton4,border.SOUTH);
        add(boton5,border.EAST);
        add(boton6,border.EAST);
        add(boton7,border.WEST);
        add(boton8,border.WEST);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

}
