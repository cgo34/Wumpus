/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverne;

/**
 *
 * @author Geoffroy
 */
public class Player {
    int playerX, playerY;
    String symbol;
    String directionActuelle;
    String direction;
    
    public Player(){
        this.playerX = 3;
        this.playerY = 0;
        this.symbol = "O";
        this.directionActuelle = "N";
    }
    
    public void turnLeft(){
        switch (getDirectionActuelle())
        {
          case "N":
            this.setDirectionActuelle("O");
            System.out.println("direction actuelle " + getDirectionActuelle());
            //this.directionActuelle = "E";
            break;
          case "0":
            this.setDirectionActuelle("S");
            System.out.println("direction actuelle " + getDirectionActuelle());
            
            break;
          case "S":
            this.setDirectionActuelle("E");
            System.out.println("direction actuelle " + getDirectionActuelle());
            
            break;
          case "E":
            this.setDirectionActuelle("N");
            System.out.println("direction actuelle " + getDirectionActuelle());
            
            break;
        }
                
    }
    
    public void turnRight(){
        switch (getDirectionActuelle())
        {
          case "N":
            System.out.println("direction actuelle " + getDirectionActuelle());
            this.setDirectionActuelle("E");
            System.out.println("direction actuelle " + getDirectionActuelle());
            //this.directionActuelle = "E";
            break;
          case "E":
            this.setDirectionActuelle("S");
            System.out.println("direction actuelle " + getDirectionActuelle());
            
            break;
          case "S":
            this.setDirectionActuelle("O");
            System.out.println("direction actuelle " + getDirectionActuelle());
            
            break;
          case "O":
            this.setDirectionActuelle("N");
            System.out.println("direction actuelle " + getDirectionActuelle());
            
            break;
        }
                
    }
    
    public void avancer(){
        System.out.println("avance");
    }

    /**
     * @return the directionActuelle
     */
    public String getDirectionActuelle() {
        return directionActuelle;
    }

    /**
     * @param directionActuelle the directionActuelle to set
     */
    public void setDirectionActuelle(String directionActuelle) {
        this.directionActuelle = directionActuelle;
    }
    
    public void getPositionPlayer(){
        System.out.println("Position player : "+this.playerX +":"+ this.playerY);
    }
}
