package com.sharyu.designpatterns.abstractfactory;

import com.sharyu.designpatterns.abstractfactory.service.Shape;
import com.sharyu.designpatterns.abstractfactory.service.impl.RoundedRectangle;
import com.sharyu.designpatterns.abstractfactory.service.impl.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
		return null;
	}

}
