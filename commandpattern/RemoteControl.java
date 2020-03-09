package com.CommandPattern.commandpattern;
public class RemoteControl{
	  private Cammand command;
	  public void setCommand(Cammand command){
	    this.command = command;
	  }
	  public void pressButton(){
	    command.execute();
	  }
	}