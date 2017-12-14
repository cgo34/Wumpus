/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverne;

import java.util.ArrayList;

/**
 *
 * @author Geoffroy
 */
public class Caverne {
    int col, row, nbCase;
    public ArrayList<Case> arrListCases = new ArrayList<Case>(); 
    public Player player;
    
    public Caverne(int nbCol, int nbRow){
        this.col = nbCol;
        this.row = nbRow;
        this.nbCase = nbCol * nbRow;
    }
    
    public void display(){
        System.out.println("col : " +this.col);
        System.out.println("row : " +this.row);
        
        
        for(int i = 0; i < this.col; i++){
            
            for(int j = 0 ; j < this.row ; j++){
                if(i == 3 && j == 0){
                    System.out.print("|  P  ");
                    arrListCases.add(new Case(i,j, null));
                }else{
                    System.out.print("| "+i+":"+j+ " ");
                    arrListCases.add(new Case(i,j, null));
                }
                
                
                
            }
            System.out.println("| \n");
        }
        
       
    }
    
    public void addArtefacts(){
        for(Case myCase : arrListCases){
            System.out.print(myCase.getCoordinateX());
            System.out.print(myCase.getCoordinateY() + "\n\n");
        }
    }
    
    public void addPlayer(){
        this.player = new Player();
    }
}
