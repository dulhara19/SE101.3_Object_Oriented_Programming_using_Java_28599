
package com.mycompany.trafficlightsystem;

public class TrafficLightSystem 
{

    public static void main(String[] args)
    {
        RedLightThread rt = new RedLightThread();
        rt.start();
        GreenLightThread gt = new GreenLightThread();
        gt.start();
        YellowLightThread yt = new  YellowLightThread();
        yt.start();
    }
}
