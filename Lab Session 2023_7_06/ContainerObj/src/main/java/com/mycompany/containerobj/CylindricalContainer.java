
package com.mycompany.containerobj;

public class CylindricalContainer extends Container
{
 private double height,radius;
 
 public CylindricalContainer(double height,double radius)
 {
     this.height=height;
     this.radius=radius;
 }
 
 @Override
 public double Volume()
 {
     return 3.1459f*radius*radius*height;
 }
 
}
