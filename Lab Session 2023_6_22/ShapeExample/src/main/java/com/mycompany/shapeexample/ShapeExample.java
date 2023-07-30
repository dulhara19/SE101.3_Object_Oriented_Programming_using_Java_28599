package com.mycompany.shapeexample;

public class ShapeExample 
{

    public static void main(String[] args)
    {
        Circle c1=new Circle(5);
        //c1.setRadius(5.0);
        System.out.println("Area is circle : "+c1.calculateArea());
        System.out.println("Perimeter is circle : "+c1.calculatePerimeter());
        
        Rectangle r1=new Rectangle(2,4);
//        r1.setLength(2.0);
//        r1.setWidth(5.0);
        System.out.println("Area is Rectangle : "+r1.calculateArea());
        System.out.println("Perimeter is Rectangle : "+r1.calculatePerimeter());
        
        Triangle t1=new Triangle(3,4,5);
//        t1.setLength1(3.0);
//        t1.setLength2(4.0);
//        t1.setLength3(5.0);
        System.out.println("Area is Rectangle : "+t1.calculateArea());
        System.out.println("Perimeter is Rectangle : "+t1.calculatePerimeter());
    }
}
