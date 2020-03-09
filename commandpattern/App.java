package com.CommandPattern.commandpattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {RemoteControl control = new RemoteControl();
    Light light = new Light();
    Cammand lightsOn = new LightOnCmd(light);
    Cammand lightsOff = new LightOffCmd(light);
    control.setCommand(lightsOn);
    control.pressButton();
    control.setCommand(lightsOff);
    control.pressButton();
    }
}
