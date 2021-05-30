package com.sharyu.designpatterns.factory.service.impl;

import com.sharyu.designpatterns.factory.service.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");

	}

}
