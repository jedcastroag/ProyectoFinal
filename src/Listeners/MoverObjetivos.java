/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import Graphics.GObjective;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Jeffer
 */
public class MoverObjetivos implements ActionListener{
    
    private GObjective o;

    public MoverObjetivos(GObjective o) {
        this.o = o;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        o.y = o.y +4;
        o.panel.repaint();
    }
    
}
