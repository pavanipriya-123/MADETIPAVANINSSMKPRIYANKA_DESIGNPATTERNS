package com.BridgePattern.bridgepattern;
public class circle extends shape {
	   private int x, y, radius;

	   public circle(int x, int y, int radius, drawcircleAPI drawcircleAPI) {
	      super(drawcircleAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() {
	      drawcircleAPI.drawCircle(radius,x,y);
	   }
	}