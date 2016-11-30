/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import Graphics.GLevel;
import Graphics.GObjective;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sergio Romero
 */
public class CrearObjeto implements ActionListener{
    
    private final GLevel nivel;

    public CrearObjeto(GLevel nivel) {
        this.nivel = nivel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        nivel.setCrearObjeto(true);
        nivel.repaint();
    }
    
    
    
}
