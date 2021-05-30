package com.sharyu.designpatterns.factory;

import com.sharyu.designpatterns.factory.service.Shape;
import com.sharyu.designpatterns.factory.service.impl.Circle;
import com.sharyu.designpatterns.factory.service.impl.Rectangle;
import com.sharyu.designpatterns.factory.service.impl.Square;

public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}