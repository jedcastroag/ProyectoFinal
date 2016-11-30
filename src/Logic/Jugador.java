/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
/**
 *
 * @author Jeffer
 */
public class Jugador extends ObjectGame{

    public Jugador(String color) {
        this.score = 0;
        this.color = color;
    }   
    
    public void sumar(Objective o){
        if(o.color.equals(this.color))
            this.score += o.score;  
        else
            this.score-=o.score;
    }
    
}
