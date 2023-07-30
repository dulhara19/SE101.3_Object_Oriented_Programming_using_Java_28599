
package com.mycompany.textexceptionhandling1;

public class TextExceptionHandling1 
{

    public static void main(String[] args) 
    {
        int[] numbers={1,2,3,4,5};
        
       try
       {
           int value= numbers[10];
           System.out.println("value : "+value);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Invalid index is accessed");
       }
       finally
       {
           for(int i=0;i<numbers.length;i++)
           {
               System.out.println(numbers[i]+" ");
           }
       }
    }
}
