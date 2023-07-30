package com.mycompany.lifegame;

public class LifeGame 
{

    public static void main(String[] args) 
    {
        RegularPlayer regularPlayer = new RegularPlayer();
        regularPlayer.moveUp();
        regularPlayer.moveDown();
        regularPlayer.moveLeft();
        regularPlayer.moveRight();

        OppositePlayer oppositePlayer = new OppositePlayer();
        oppositePlayer.moveUp();
        oppositePlayer.moveDown();
        oppositePlayer.moveLeft();
        oppositePlayer.moveRight();

        JumpingPlayer jumpingPlayer = new JumpingPlayer();
        jumpingPlayer.moveUp();
        jumpingPlayer.moveDown();
        jumpingPlayer.moveLeft();
        jumpingPlayer.moveRight();

        CrouchingPlayer crouchingPlayer = new CrouchingPlayer();
        crouchingPlayer.moveUp();
        crouchingPlayer.moveDown();
        crouchingPlayer.moveLeft();
        crouchingPlayer.moveRight();
    }
}
