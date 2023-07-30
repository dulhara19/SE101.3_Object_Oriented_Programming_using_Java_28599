package com.mycompany.textexceptionhandling;

import java.util.Scanner;

public class TextExceptionHandling 
{

    public static void main(String[] args) 
    {
        int n1,n2,ans;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter First Number : ");
            n1=sc.nextInt();
            System.out.println("Enter Second Number : ");
            n2=sc.nextInt();
            
            ans=n1/n2;
            System.out.println("Answer is : "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println(" The denomonator is zero");
               
        }
    }
}
