
package com.mycompany.lifegame;

public class JumpingPlayer extends Player
{
     @Override
    void moveUp() 
    {
        System.out.println("Player jumped up by 5 spaces");
    }

    @Override
    void moveDown() 
    {
        System.out.println("Player jumped down by 5 spaces");
    }

    @Override
    void moveLeft()
    {
        System.out.println("Player jumped left by 5 spaces");
    }

    @Override
    void moveRight() 
    {
        System.out.println("Player jumped right by 5 spaces");
    }
    
}
