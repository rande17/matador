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
    int die1, die2;
    Dice(){
        
    }
    
    public int throwDice(){
        die1 = (int) Math.ceil(Math.random()*6);
        die2 = (int) Math.ceil(Math.random()*6);
        return die1+die2;
    }
    
    public boolean ifEqual(){
        return (die1 == die2);
    }
}
