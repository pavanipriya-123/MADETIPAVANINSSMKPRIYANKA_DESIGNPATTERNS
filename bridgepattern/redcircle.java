package com.BridgePattern.bridgepattern;
public class redcircle implements drawcircleAPI {
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle of [ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}