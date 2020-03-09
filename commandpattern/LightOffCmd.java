package com.CommandPattern.commandpattern;
public class LightOffCmd implements Cammand{
	  //reference to the light
	  Light light;
	  public LightOffCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOff();
	  }
	}