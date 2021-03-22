/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
public class TestGame {
    public static void main(String[] args){
    GamePlayer P1 = new GamePlayer( );
    GameEnemy  bot = new GameEnemy();
    P1.setposition(30,40);
    P1.Run();
    bot.Run();
    P1.Run(30);
    
   
     }
    }
