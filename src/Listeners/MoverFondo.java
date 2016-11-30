/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import Graphics.GLevel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jeffer
 */
public class MoverFondo implements ActionListener{
    
    private GLevel n;

    public MoverFondo(GLevel n) {
        this.n = n;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (n.getXim()==7783)
            n.setXim(0);
        else
            n.setXim(n.getXim()+1);
        n.repaint();
    }
    
}
