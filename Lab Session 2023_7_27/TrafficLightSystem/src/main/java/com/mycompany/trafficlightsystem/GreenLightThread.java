
package com.mycompany.trafficlightsystem;

public class GreenLightThread extends Thread
{
     @Override
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("Green light");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    } 
}
