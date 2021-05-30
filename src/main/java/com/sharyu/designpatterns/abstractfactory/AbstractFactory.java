package com.sharyu.designpatterns.abstractfactory;

import com.sharyu.designpatterns.abstractfactory.service.Shape;

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType) ;
}
