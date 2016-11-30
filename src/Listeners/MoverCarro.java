/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import Graphics.GCar;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Jeffer
 */
public class MoverCarro implements KeyListener{
    
    private GCar carro;

    public MoverCarro(GCar carro) {
        this.carro = carro;
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
          switch (ke.getKeyCode()) {
            case KeyEvent.VK_LEFT: 
                if(carro.x >0)carro.x-=50; break;
            case KeyEvent.VK_RIGHT: 
                if(carro.x <1320)carro.x+=50; break;
          }
          carro.dibuja(carro.g);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    
}
