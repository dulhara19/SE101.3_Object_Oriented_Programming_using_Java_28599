
package com.mycompany.lifegame;

public class OppositePlayer extends Player
{
     @Override
    void moveUp() 
    {
        System.out.println("Player moved down");
    }

    @Override
    void moveDown() 
    {
        System.out.println("Player moved up");
    }

    @Override
    void moveLeft()
    {
        System.out.println("Player moved right");
    }

    @Override
    void moveRight() 
    {
        System.out.println("Player moved left");
    }
    
}
