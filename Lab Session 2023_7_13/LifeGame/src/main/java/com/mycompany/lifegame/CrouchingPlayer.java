
package com.mycompany.lifegame;

public class CrouchingPlayer extends Player
{
     @Override
    void moveUp() 
    {
        System.out.println("Player moved up by 2 spaces");
    }

    @Override
    void moveDown() 
    {
        System.out.println("Player moved down by 2 spaces");
    }

    @Override
    void moveLeft() 
    {
        System.out.println("Player moved left by 2 spaces");
    }

    @Override
    void moveRight() 
    {
        System.out.println("Player moved right by 2 spaces");
    }
}
