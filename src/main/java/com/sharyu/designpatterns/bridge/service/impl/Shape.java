package com.sharyu.designpatterns.bridge.service.impl;

import com.sharyu.designpatterns.bridge.service.DrawAPI;

public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
