package Logic;

import Graphics.LevelWindow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffer
 */
public class Level {
    
    private Jugador jugador;
    private Objective objetos;
    private final LevelWindow ventana;

    public Level(String imageBackgroundRute, int puntajeMeta, int numLevel,String color) {
        this.ventana = new LevelWindow(imageBackgroundRute, numLevel,puntajeMeta,color,this);
    }
    
    public LevelWindow getVentana(){
        return ventana;
    }
}
