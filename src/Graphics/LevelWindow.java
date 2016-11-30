/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import Logic.Level;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Jeffer
 */
public final class LevelWindow extends JFrame{
    
    private GLevel nivel;

    public LevelWindow(String SFondo, int numLevel,int puntajeMeta,String color,Level l) {
        init(SFondo,numLevel,puntajeMeta,color,l);
        addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void init(String SFondo, int numLevel,int puntajeMeta,String color, Level l){        
        this.setSize(new Dimension(800, 820));
        this.setResizable(true);
        this.setTitle("Nivel " + numLevel);
        this.nivel = new GLevel(SFondo,puntajeMeta,color,l);        
    }
    
    private void addComponents(){        
        this.add(nivel);        
    }
    
}
