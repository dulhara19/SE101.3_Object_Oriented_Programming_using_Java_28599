package com.mycompany.shapeexample;

public class Rectangle implements Shape
{
    private double length;
    private double width;
    
    public Rectangle( double length,double width)
    {
        this.length=length;
        this.width=width;
    }

  
    
    public void setLength(double length)
    {
        this.length=length;
    }
    public void setWidth(double width)
    {
       this.width=width;  
    }
    
    public double getLength()
    {
        return length;
    }
      public double getWidth()
    {
        return width;
    }
      
     @Override
    public double calculateArea()
    {
        return length*width;
    }
    
    @Override
    public double calculatePerimeter()
    {
        return length+length+width+width;
    }

   
      
}
