/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rickie
 */
public class Dice {
    
    Die die1 = new Die(6);
    Die die2 = new Die(6);
    int tDie1, tDie2; 
    Dice(){
        
    }
    
    public int throwDice(){
        tDie1 = (int) Math.ceil(Math.random()*die1.getSides());
        tDie2 = (int) Math.ceil(Math.random()*die2.getSides());
        return tDie1+tDie2;
    }
    
    public boolean ifEqual(){
        return (tDie1 == tDie2);
    }
}
