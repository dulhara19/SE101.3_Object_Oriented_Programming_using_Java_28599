
package com.mycompany.trafficlightsystem;

public class YellowLightThread extends Thread
{
     @Override
    public void run()
    {while(true)
            {
        try
        {
            
                System.out.println("Yellow light");
                Thread.sleep(2000);
            
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        }
    } 
}
