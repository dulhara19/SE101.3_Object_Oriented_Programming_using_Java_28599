
package com.mycompany.shapemain;

public abstract class Shape
{
    abstract double calculateArea();
    
    void display()
    {
        System.out.println("Area "+calculateArea());
    }
    
    
}
