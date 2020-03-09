package com.BridgePattern.bridgepattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	shape redcircle = new circle(100,100, 10, new redcircle());
        shape bluecircle = new circle(100,100, 10, new bluecircle());

        redcircle.draw();
        bluecircle.draw();
    }
}