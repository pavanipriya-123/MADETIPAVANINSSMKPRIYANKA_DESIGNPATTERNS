package com.BridgePattern.bridgepattern;
public abstract class shape {
	   protected drawcircleAPI drawcircleAPI;
	   
	   protected shape(drawcircleAPI drawcircleAPI){
	      this.drawcircleAPI = drawcircleAPI;
	   }
	   public abstract void draw();
	   }