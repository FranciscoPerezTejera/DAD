package Clases;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;


public class DiezBotones extends JFrame {
    
    JFrame ventana;
    
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    JButton boton6;
    JButton boton7;
    JButton boton8;
    JButton boton9;
    JButton boton10;
    JButton boton11;

    public DiezBotones() throws HeadlessException {
        
       ventana =  new JFrame("Prueba botones");
        
       boton1 = new JButton("boton 1");
       boton2 = new JButton("boton 2");
       boton3 = new JButton("boton 3");
       boton4 = new JButton("boton 4");
       boton5 = new JButton("boton 5");
       boton6 = new JButton("boton 6");
       boton7 = new JButton("boton 7");
       boton8 = new JButton("boton 8");
       boton9 = new JButton("boton 9");
       boton10 = new JButton("boton 10");
       
       add(boton1);
       add(boton2);
       add(boton3);
       add(boton4);
       add(boton5);
       add(boton6);
       add(boton7);
       add(boton8);
       add(boton9);
       add(boton10);
       
       setBounds(0, 0, 1280, 720);
       setVisible(true);
       setLayout(new FlowLayout());
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       
    }
    
    
    
    
    
    
    
    
}
