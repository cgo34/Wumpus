/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wumpus;

import caverne.Case;
import caverne.Caverne;

/**
 *
 * @author Geoffroy
 */
public class Wumpus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caverne caverne = new Caverne(4,4);
        caverne.display();
        //caverne.arrListCases.getCoordinateX();
        for(Case myCase : caverne.arrListCases){
            System.out.print(myCase.getCoordinateX());
            System.out.print(myCase.getCoordinateY() + "\n\n");
        }
        
        caverne.display();
        
        caverne.addPlayer();
        caverne.player.getDirectionActuelle();
        caverne.player.turnRight();
        caverne.player.getDirectionActuelle();
        caverne.player.turnRight();
        caverne.player.getPositionPlayer();
        caverne.player.turnLeft();
        caverne.player.avancer();
        
    }
    
}
