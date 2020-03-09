package com.BridgePattern.bridgepattern;
public class bluecircle implements drawcircleAPI {
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}