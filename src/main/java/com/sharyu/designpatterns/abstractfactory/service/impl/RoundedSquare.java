package com.sharyu.designpatterns.abstractfactory.service.impl;

import com.sharyu.designpatterns.abstractfactory.service.Shape;

public class RoundedSquare implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");

	}

}
