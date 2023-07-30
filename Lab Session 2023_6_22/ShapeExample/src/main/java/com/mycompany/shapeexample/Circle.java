package com.mycompany.shapeexample;

public class Circle implements Shape
{
    private double radius;
      
    public Circle(double radius)
    {
        this.radius=radius;
    }
     
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    @Override
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    
    @Override
    public double calculatePerimeter()
    {
        return 2* Math.PI * radius;
    }
}
