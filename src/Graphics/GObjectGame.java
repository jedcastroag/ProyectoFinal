/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import Listeners.MoverCarro;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author Jeffer
 */
public abstract class GObjectGame extends Thread{
    
    public Graphics g;
    public JPanel panel;
    public int x,y;
    public Image image;
    
    public abstract Rectangle getRectangulo();
    public abstract void dibuja(Graphics g);
    public abstract boolean finished();
    
}
