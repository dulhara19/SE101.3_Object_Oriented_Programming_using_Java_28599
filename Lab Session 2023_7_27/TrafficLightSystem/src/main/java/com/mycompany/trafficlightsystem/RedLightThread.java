
package com.mycompany.trafficlightsystem;

public class RedLightThread extends Thread
{
    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("red light");
                Thread.sleep(5000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
