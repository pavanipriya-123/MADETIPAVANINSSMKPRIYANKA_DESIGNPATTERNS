package com.CommandPattern.commandpattern;

public class LightOnCmd implements Cammand{
  //reference to the light
  Light light;
  public LightOnCmd(Light light){
    this.light = light;
  }
  public void execute(){
    light.switchOn();
  }
}