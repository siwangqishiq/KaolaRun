package com.xinlan.kaola;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import de.swagner.paxbritannica.PaxBritannica;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
//        LwjglApplicationConfiguration config= new LwjglApplicationConfiguration();
//        config.fullscreen = false;
//        config.width=800;
//        config.height = 400;
//        config.title="øº¿≠≈‹≈‹";
//        new LwjglApplication(new MyApp(),config);
        
        LwjglApplicationConfiguration config= new LwjglApplicationConfiguration();
        config.fullscreen = false;
        config.width=800;
        config.height = 480;
        new LwjglApplication(new PaxBritannica(),config);
    }

}
