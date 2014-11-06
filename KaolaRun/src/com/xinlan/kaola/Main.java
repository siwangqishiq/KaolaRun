package com.xinlan.kaola;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        LwjglApplicationConfiguration config= new LwjglApplicationConfiguration();
        config.fullscreen = false;
        config.width=1000;
        config.height = 600;
        config.title="øº¿≠≈‹≈‹";
        new LwjglApplication(new MyApp(),config);
    }

}
