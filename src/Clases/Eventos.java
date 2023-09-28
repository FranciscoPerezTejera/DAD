package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Eventos implements ActionListener {
    
    public Eventos () {
    
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(e);
        
    }
    
}
