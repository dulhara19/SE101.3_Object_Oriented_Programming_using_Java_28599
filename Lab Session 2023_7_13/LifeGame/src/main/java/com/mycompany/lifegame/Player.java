package com.mycompany.lifegame;

public class Player extends Movement
{
    @Override
    void moveUp()
    {
        System.out.println("Player moved up");
    }

    @Override
    void moveDown() 
    {
        System.out.println("Player moved down");
    }

    @Override
    void moveLeft()
    {
        System.out.println("Player moved left");
    }

    @Override
    void moveRight()
    {
        System.out.println("Player moved right");
    }
    
}
