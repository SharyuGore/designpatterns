package com.sharyu.designpatterns.bridge;

import com.sharyu.designpatterns.bridge.service.impl.Circle;
import com.sharyu.designpatterns.bridge.service.impl.GreenCircle;
import com.sharyu.designpatterns.bridge.service.impl.RedCircle;
import com.sharyu.designpatterns.bridge.service.impl.Shape;

public class BridgePatternDemo {
	 public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }
}
