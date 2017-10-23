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
public class Monopoly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Drive drive = new Drive();
        drive.makeFields();
        
        Player player1, player2;
        player1 = new Player("Jeg lugter");
        player2 = new Player("Du lugter");
        
        Dice dice = new Dice();
        
        int i = 0;
        while(i < 1000){
            player1.move(dice);
            player2.move(dice);
            i++;
        }
    }
    
}
