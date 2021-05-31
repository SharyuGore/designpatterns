package com.sharyu.designpatterns.bridge.service.impl;

import com.sharyu.designpatterns.bridge.service.DrawAPI;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");

	}

}
