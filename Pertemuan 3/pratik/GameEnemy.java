/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */

public class GameEnemy {
    double width;
    double height;
    int positionX;
    int positionY;

    public GameEnemy(){}
    
    public GameEnemy(double width, double height){}
    
    public GameEnemy(double width, double height, int positionX, int positionY){}
    
    public void setdimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void setposition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public double getwidth(){
        return width;
    }
    public double getheight(){
        return height;
    }
    public int getX(){
        return positionX;
    }
    public int getY(){
        return positionY;
    }
    public void Run(){
        System.out.println("Enemy is Running");
    }
}