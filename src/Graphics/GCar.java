/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import Listeners.MoverCarro;
import Logic.Jugador;
import Logic.Level;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Jeffer
 */
public class GCar extends GObjectGame {

    private MoverCarro movercar;
    private boolean tieneG;
    private int puntajeMeta;
    private Jugador Jugador;
    private Level l;

    public GCar(JPanel p, int puntajeMeta, String color, Level l) {
        init(p, color, l);
    }

    private void init(JPanel p, String color, Level l) {
        this.l = l;
        image = loadImage();
        panel = p;
        movercar = new MoverCarro(this);
        x = 340;
        y = 620;
        Jugador = new Jugador(color);
    }

    public Image loadImage() {
        return new ImageIcon("Images\\carro\\carro.png").getImage();
    }

    @Override
    public void dibuja(Graphics g) {
        panel.paintComponents(g);
        g.drawImage(image, x, y,120,150, panel);
    }

    public MoverCarro getLCar() {
        return movercar;
    }

    @Override
    public boolean finished() {
        return Jugador.score > puntajeMeta;
    }

    @Override
    public Rectangle getRectangulo() {
        return new Rectangle(x, y, 52, 100);
    }

    public void checkColision(GObjective o, GLevel gl) {
        if (o != null && this.getRectangulo().intersects(o.getRectangulo())) {
            Jugador.sumar(o.getObjeto());
            o.resetObjective();
        } else if (this.finished()) {            
            this.l.getVentana().dispose();            
        }
        gl.getLScore().setText("Puntaje: " + Jugador.score);
    }

}
