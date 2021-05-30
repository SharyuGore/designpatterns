package com.sharyu.designpatterns.abstractfactory.service.impl;

import com.sharyu.designpatterns.abstractfactory.service.Shape;

public class RoundedRectangle implements Shape {
	   @Override
	   public void draw() {
	      System.out.println("Inside RoundedRectangle::draw() method.");
	   }
	}
