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
public class Player {

    String name;
    int playerPos = 0;
    Field currentField = Drive.field[playerPos];

    public Player(String _name) {
        name = _name;
    }

    public void move(Dice die) {
        playerPos = (playerPos + die.throwDice()) % Drive.field.length;
        currentField = Drive.field[playerPos];
        System.out.println(name + " landede på " + Drive.field[playerPos].getName());
    }

}
