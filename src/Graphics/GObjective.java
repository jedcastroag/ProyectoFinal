/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import Listeners.MoverObjetivos;
import Logic.Objective;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Jeffer
 */
public final class GObjective extends GObjectGame{
    
    public MoverObjetivos ol;
    private Timer timer;
    private static Image[] plasticos, papel,organicos;
    private Objective objeto;

    public GObjective(JPanel p, int DELAY,int Tipo,int carril) {        
        init(p, DELAY);
        setType(Tipo);
        setCarril(carril);
    }

    private void init(JPanel p, int DELAY) {
        panel = p;
        objeto = new Objective((int) (Math.random() * 100 + 100));
        ol = new MoverObjetivos(this);
        timer = new Timer(DELAY -10, ol);
    }

    private void setType(int type){
        switch (type) {
            case 1:                
                image = plasticos[(int) (Math.random() * plasticos.length)];
                objeto.color = "Azul";
                break;
            case 2:
                image = organicos[(int) (Math.random() * organicos.length)];
                objeto.color = "verdes";
            case 3:
                image = papel[(int) (Math.random() * papel.length)];
                objeto.color = "Grises";
                break;
        }
    }
    
    
    @Override
    public void dibuja(Graphics g) {
        g.drawImage(image, x, y, panel);
    }
    
    @Override
    public Rectangle getRectangulo() {
        return new Rectangle(x, y, 52, 100);
    }

    public MoverObjetivos getOl() {
        return ol;
    }

    @Override
    public boolean finished() {
        return y>=700;
    }   
    
    private void setCarril(int carril){
        switch (carril) {
            case 1:
                x = 100;
                break;
            case 2:
                x = 400;
                break;
            case 3:
                x = 700;
                break; 
        }
    }
    
    public static void loadImages(){
        GObjective.organicos = new Image[6];
        GObjective.papel = new Image[6];
        GObjective.plasticos = new Image[6];
        //loadPlasticos
        GObjective.plasticos[0] = new ImageIcon("Images\\plasticos\\bolsas.png").getImage();
        GObjective.plasticos[1] = new ImageIcon("Images\\plasticos\\pelota.png").getImage();
        GObjective.plasticos[2] = new ImageIcon("Images\\plasticos\\ganchos.png").getImage();
        GObjective.plasticos[3] = new ImageIcon("Images\\plasticos\\envase.png").getImage();
        GObjective.plasticos[4] = new ImageIcon("Images\\plasticos\\utiles.png").getImage();
        GObjective.plasticos[5] = new ImageIcon("Images\\plasticos\\botellas.png").getImage();
        //Papel y Carton
        GObjective.papel[0] = new ImageIcon("Images\\Papel y Carton\\libros.png").getImage();
        GObjective.papel[1] = new ImageIcon("Images\\Papel y Carton\\cajacarton.png").getImage();
        GObjective.papel[2] = new ImageIcon("Images\\Papel y Carton\\cajacomida.png").getImage();
        GObjective.papel[3] = new ImageIcon("Images\\Papel y Carton\\carpeta.png").getImage();
        GObjective.papel[4] = new ImageIcon("Images\\Papel y Carton\\cartas.png").getImage();
        GObjective.papel[5] = new ImageIcon("Images\\Papel y Carton\\papeles.png").getImage();
        //Organicos
        GObjective.organicos[0] = new ImageIcon("Images\\Organicos\\cascara de naranja.png").getImage();
        GObjective.organicos[1] = new ImageIcon("Images\\Organicos\\cascarabanana.png").getImage();
        GObjective.organicos[2] = new ImageIcon("Images\\Organicos\\cascaradehuevos.png").getImage();
        GObjective.organicos[3] = new ImageIcon("Images\\Organicos\\manzanamordida.png").getImage();
        GObjective.organicos[4] = new ImageIcon("Images\\Organicos\\manzanarojamordida.png").getImage();
        GObjective.organicos[5] = new ImageIcon("Images\\Organicos\\pescado.png").getImage();
    }
    
    public void resetObjective(){
        setCarril((int) (Math.random() * 3 + 1));
        setType((int) (Math.random() * 3 + 1));
        y=0;
        timer.restart();
    }

    public Objective getObjeto() {
        return objeto;
    }

    @Override
    public void run() {
        this.timer.start();
    }

}
